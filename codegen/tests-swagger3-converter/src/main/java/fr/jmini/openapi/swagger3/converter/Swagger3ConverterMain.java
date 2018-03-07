package fr.jmini.openapi.swagger3.converter;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.config.CodegenConfigurator;
import io.swagger.codegen.languages.java.AbstractJavaCodegen;
import io.swagger.codegen.languages.java.JavaCXFServerCodegen;
import io.swagger.codegen.languages.java.JavaClientCodegen;
import io.swagger.codegen.languages.java.JavaJAXRSCXFCDIServerCodegen;
import io.swagger.codegen.languages.java.JavaJAXRSSpecServerCodegen;
import io.swagger.codegen.languages.java.JavaJerseyServerCodegen;
import io.swagger.codegen.languages.java.JavaResteasyEapServerCodegen;
import io.swagger.codegen.languages.java.JavaResteasyServerCodegen;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Swagger3ConverterMain {

    public static void main(String[] args) throws IOException {
        convertJava("petstore");
        convertJaxrs("petstore");
        convertJaxrsCxf("petstore");
        convertJaxrsCxfCdi("petstore");
        convertJaxrsResteasy("petstore");
        convertJaxrsResteasyEap("petstore");
        convertJaxrsSpec("petstore");
    }

    private static void convertJava(String inputSpecName) throws IOException {
        JavaClientCodegen config = new io.swagger.codegen.languages.java.JavaClientCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrs(String inputSpecName) throws IOException {
        JavaJerseyServerCodegen config = new io.swagger.codegen.languages.java.JavaJerseyServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsCxf(String inputSpecName) throws IOException {
        JavaCXFServerCodegen config = new io.swagger.codegen.languages.java.JavaCXFServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsCxfCdi(String inputSpecName) throws IOException {
        JavaJAXRSCXFCDIServerCodegen config = new io.swagger.codegen.languages.java.JavaJAXRSCXFCDIServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsResteasy(String inputSpecName) throws IOException {
        JavaResteasyServerCodegen config = new io.swagger.codegen.languages.java.JavaResteasyServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsResteasyEap(String inputSpecName) throws IOException {
        JavaResteasyEapServerCodegen config = new io.swagger.codegen.languages.java.JavaResteasyEapServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsSpec(String inputSpecName) throws IOException {
        JavaJAXRSSpecServerCodegen config = new io.swagger.codegen.languages.java.JavaJAXRSSpecServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertAbstractJava(String inputSpecName, AbstractJavaCodegen config) throws IOException {
        final String artifactId = toArtifactId(inputSpecName, config);
        config.setArtifactId(artifactId);
        config.setJava8Mode(true);
        convert(inputSpecName, config);
    }

    private static void convert(String inputSpecName, CodegenConfig config) throws IOException {
        final String folder = "../3.0/" + inputSpecName;
        final String subFolder = toArtifactId(inputSpecName, config);
        final String outputDir = folder + "/" + subFolder;
        Path outputDirPath = Paths.get(outputDir);

        if(Files.exists(outputDirPath)) {
            Files.walk(outputDirPath)
                .filter(Files::isRegularFile)
                .filter(p -> !".project".equals(p.getFileName().toString()) && !".classpath".equals(p.getFileName().toString()) && !p.getFileName().toString().endsWith(".prefs"))
                .map(Path::toFile)
                .forEach(File::delete);
        }

        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setLang(config.getName()); 
        configurator.setInputSpec(folder + "/" + inputSpecName + ".json");
        final ClientOptInput input = configurator.toClientOptInput();
        config.setOutputDir(outputDir);
        input.setConfig(config);

        new DefaultGenerator().opts(input).generate();

        removeGeneratedAnnotationInJavaFiles(outputDirPath);
    }

    private static String toArtifactId(String inputSpecName, CodegenConfig config) {
        return inputSpecName + "-swagger3-" + config.getName();
    }

    private static void removeGeneratedAnnotationInJavaFiles(final Path folder) throws IOException {
        Files.walk(folder)
            .filter(f -> f.toFile().isFile() && f.toFile().getName().endsWith("java"))
            .forEach(Swagger3ConverterMain::removeGeneratedAnnotation);
    }

    private static void removeGeneratedAnnotation(final Path file) {
        try {
            String content = new String(Files.readAllBytes(file));
            content = content.replaceAll("@javax.annotation.Generated\\([^\\)]+\\)", "");
            Files.write(file, content.getBytes());
        }
        catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
