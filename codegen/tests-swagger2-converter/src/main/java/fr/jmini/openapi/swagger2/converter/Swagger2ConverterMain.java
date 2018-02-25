package fr.jmini.openapi.swagger2.converter;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.config.CodegenConfigurator;
import io.swagger.codegen.languages.JavaJerseyServerCodegen;

public class Swagger2ConverterMain {

    public static void main(String[] args) {
        convertJaxrs("petstore");
    }

    private static void convertJaxrs(String inputSpecName) {
        JavaJerseyServerCodegen config = new io.swagger.codegen.languages.JavaJerseyServerCodegen();
        final String artifactId = toArtifactId(inputSpecName, config);
        config.setArtifactId(artifactId);
        config.setJava8Mode(true);
        convert(inputSpecName, config);
    }

    private static void convert(String inputSpecName, CodegenConfig config) {
        final String folder = "../2.0/" + inputSpecName;
        final String subFolder = toArtifactId(inputSpecName, config);

        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setLang(config.getName()); 
        configurator.setInputSpec(folder + "/" + inputSpecName + ".json");
        final ClientOptInput input = configurator.toClientOptInput();
        config.setOutputDir(folder + "/" + subFolder);
        input.setConfig(config);

        new DefaultGenerator().opts(input).generate();
    }

    private static String toArtifactId(String inputSpecName, CodegenConfig config) {
        return inputSpecName + "-swagger2-" + config.getName();
    }
}
