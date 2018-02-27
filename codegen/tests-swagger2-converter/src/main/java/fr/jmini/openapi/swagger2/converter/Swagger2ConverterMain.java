package fr.jmini.openapi.swagger2.converter;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.config.CodegenConfigurator;
import io.swagger.codegen.languages.AbstractJavaCodegen;
import io.swagger.codegen.languages.JavaCXFServerCodegen;
import io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen;
import io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen;
import io.swagger.codegen.languages.JavaJerseyServerCodegen;
import io.swagger.codegen.languages.JavaResteasyEapServerCodegen;
import io.swagger.codegen.languages.JavaResteasyServerCodegen;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Swagger2ConverterMain {

    public static void main(String[] args) throws IOException {
        convertJaxrs("petstore");
        convertJaxrsCxf("petstore");
        convertJaxrsCxfCdi("petstore");
        convertJaxrsResteasy("petstore");
        convertJaxrsResteasyEap("petstore");
        convertJaxrsSpec("petstore");
    }

    private static void convertJaxrs(String inputSpecName) throws IOException {
        JavaJerseyServerCodegen config = new io.swagger.codegen.languages.JavaJerseyServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsCxf(String inputSpecName) throws IOException {
        JavaCXFServerCodegen config = new io.swagger.codegen.languages.JavaCXFServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsCxfCdi(String inputSpecName) throws IOException {
        JavaJAXRSCXFCDIServerCodegen config = new io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsResteasy(String inputSpecName) throws IOException {
        JavaResteasyServerCodegen config = new io.swagger.codegen.languages.JavaResteasyServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsResteasyEap(String inputSpecName) throws IOException {
        JavaResteasyEapServerCodegen config = new io.swagger.codegen.languages.JavaResteasyEapServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsSpec(String inputSpecName) throws IOException {
        JavaJAXRSSpecServerCodegen config = new io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertAbstractJava(String inputSpecName, AbstractJavaCodegen config) throws IOException {
        final String artifactId = toArtifactId(inputSpecName, config);
        config.setArtifactId(artifactId);
        config.setJava8Mode(true);
        convert(inputSpecName, config);
    }

    private static void convert(String inputSpecName, CodegenConfig config) throws IOException {
        final String folder = "../2.0/" + inputSpecName;
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
        return inputSpecName + "-swagger2-" + config.getName();
    }

    private static void removeGeneratedAnnotationInJavaFiles(final Path folder) throws IOException {
        Files.walk(folder)
            .filter(f -> f.toFile().isFile() && f.toFile().getName().endsWith("java"))
            .forEach(Swagger2ConverterMain::removeGeneratedAnnotation);
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
