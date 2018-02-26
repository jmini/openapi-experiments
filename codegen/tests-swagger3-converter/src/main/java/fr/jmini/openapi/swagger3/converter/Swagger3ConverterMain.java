package fr.jmini.openapi.swagger3.converter;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.config.CodegenConfigurator;
import io.swagger.codegen.languages.java.JavaJerseyServerCodegen;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Swagger3ConverterMain {

    public static void main(String[] args) throws IOException {
        convertJaxrs("petstore");
    }

    private static void convertJaxrs(String inputSpecName) throws IOException {
        JavaJerseyServerCodegen config = new io.swagger.codegen.languages.java.JavaJerseyServerCodegen();
        final String artifactId = toArtifactId(inputSpecName, config);
        config.setArtifactId(artifactId);
        config.setJava8Mode(true);
        convert(inputSpecName, config);
    }

    private static void convert(String inputSpecName, CodegenConfig config) throws IOException {
        final String folder = "../3.0/" + inputSpecName;
        final String subFolder = toArtifactId(inputSpecName, config);
        final String outputDir = folder + "/" + subFolder;

        Files.walk(Paths.get(outputDir))
            .filter(Files::isRegularFile)
            .filter(p -> !".project".equals(p.getFileName().toString()) && !".classpath".equals(p.getFileName().toString()) && !p.getFileName().toString().endsWith(".prefs"))
            .map(Path::toFile)
            .forEach(File::delete);

        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setLang(config.getName()); 
        configurator.setInputSpec(folder + "/" + inputSpecName + ".json");
        final ClientOptInput input = configurator.toClientOptInput();
        config.setOutputDir(outputDir);
        input.setConfig(config);

        new DefaultGenerator().opts(input).generate();
    }

    private static String toArtifactId(String inputSpecName, CodegenConfig config) {
        return inputSpecName + "-swagger3-" + config.getName();
    }
}
