package fr.jmini.openapi.swagger2.converter;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.ClientOpts;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.languages.AbstractJavaCodegen;
import io.swagger.codegen.languages.JavaCXFClientCodegen;
import io.swagger.codegen.languages.JavaCXFServerCodegen;
import io.swagger.codegen.languages.JavaClientCodegen;
import io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen;
import io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen;
import io.swagger.codegen.languages.JavaJerseyServerCodegen;
import io.swagger.codegen.languages.JavaResteasyEapServerCodegen;
import io.swagger.codegen.languages.JavaResteasyServerCodegen;
import io.swagger.codegen.languages.StaticDocCodegen;
import io.swagger.codegen.languages.StaticHtml2Generator;
import io.swagger.codegen.languages.StaticHtmlGenerator;
import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Swagger2ConverterMain {

    public static void main(String[] args) throws IOException {
        convertJava("petstore");
        // convertInflector("petstore");
        convertJaxrs("petstore");
        convertJaxrsCxfClient("petstore");
        convertJaxrsCxfServer("petstore");
        convertJaxrsCxfCdi("petstore");
        convertJaxrsResteasy("petstore");
        convertJaxrsResteasyEap("petstore");
        convertJaxrsSpec("petstore");
        convertStaticHtml("petstore");
        convertStaticHtml2("petstore");
        convertStaticDoc("petstore");
    }

    private static void convertJava(String inputSpecName) throws IOException {
        JavaClientCodegen config = new io.swagger.codegen.languages.JavaClientCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    // private static void convertInflector(String inputSpecName) throws
    // IOException {
    // JavaInflectorServerCodegen config = new
    // io.swagger.codegen.languages.JavaInflectorServerCodegen();
    // convertAbstractJava(inputSpecName, config);
    // }

    private static void convertJaxrs(String inputSpecName) throws IOException {
        JavaJerseyServerCodegen config = new io.swagger.codegen.languages.JavaJerseyServerCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsCxfClient(String inputSpecName) throws IOException {
        JavaCXFClientCodegen config = new io.swagger.codegen.languages.JavaCXFClientCodegen();
        convertAbstractJava(inputSpecName, config);
    }

    private static void convertJaxrsCxfServer(String inputSpecName) throws IOException {
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

    private static void convertStaticHtml(String inputSpecName) throws IOException {
        StaticHtmlGenerator config = new io.swagger.codegen.languages.StaticHtmlGenerator();
        convert(inputSpecName, config);
    }

    private static void convertStaticHtml2(String inputSpecName) throws IOException {
        StaticHtml2Generator config = new io.swagger.codegen.languages.StaticHtml2Generator();
        convert(inputSpecName, config);
    }

    private static void convertStaticDoc(String inputSpecName) throws IOException {
        StaticDocCodegen config = new io.swagger.codegen.languages.StaticDocCodegen();
        convert(inputSpecName, config);
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

        if (Files.exists(outputDirPath)) { //
            Files.walk(outputDirPath) //
                    .filter(Files::isRegularFile) //
                    .filter(p -> !".project".equals(p.getFileName().toString()) //
                            && !".classpath".equals(p.getFileName().toString()) //
                            && !p.getFileName().toString().endsWith(".prefs")) //
                    .map(Path::toFile).forEach(File::delete);
        }

        config.setOutputDir(outputDir);
        config.setHideGenerationTimestamp(true);

        final SwaggerParser swaggerParser = new SwaggerParser();
        Swagger swagger = swaggerParser.read(folder + "/" + inputSpecName + ".json", null, true);

        final ClientOptInput opts = new ClientOptInput();
        opts.setConfig(config);
        opts.setSwagger(swagger);
        opts.setOpts(new ClientOpts());
        new DefaultGenerator().opts(opts).generate();

        removeGeneratedAnnotationInJavaFiles(outputDirPath);
    }

    private static String toArtifactId(String inputSpecName, CodegenConfig config) {
        return inputSpecName + "-swagger2-" + config.getName();
    }

    private static void removeGeneratedAnnotationInJavaFiles(final Path folder) throws IOException {
        Files.walk(folder) //
                .filter(f -> f.toFile().isFile() && f.toFile().getName().endsWith("java")) //
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
