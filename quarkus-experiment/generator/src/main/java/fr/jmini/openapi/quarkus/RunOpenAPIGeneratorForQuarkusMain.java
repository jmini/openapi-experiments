package fr.jmini.openapi.quarkus;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;

import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunOpenAPIGeneratorForQuarkusMain {

    public static void main(String[] args) throws Exception {
        convert("ping.yaml");
    }

    private static void convert(String inputSpecName) throws IOException {
        final String outputDir = "../openapi-jaxrs-server";
        Path outputDirPath = Paths.get(outputDir);

        if (Files.exists(outputDirPath)) {
            Files.walk(outputDirPath) //
                    .filter(Files::isRegularFile) //
                    .filter(p -> !".project".equals(p.getFileName()
                            .toString())
                            && !".openapi-generator-ignore".equals(p.getFileName()
                                    .toString())
                            && !".classpath".equals(p.getFileName()
                                    .toString())
                            && !p.getFileName()
                                    .toString()
                                    .endsWith(".prefs"))
                    .map(Path::toFile)
                    .forEach(File::delete);
        }

        JavaJAXRSSpecServerCodegen config = new org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen();
        config.setHideGenerationTimestamp(true);
        config.setOutputDir(outputDirPath.toFile()
                .getCanonicalPath());
        config.setLibrary(JavaJAXRSSpecServerCodegen.QUARKUS_LIBRARY);
        config.setArtifactVersion("1.0-SNAPSHOT");

        final OpenAPIV3Parser openApiParser = new OpenAPIV3Parser();
        final ParseOptions options = new ParseOptions();
        options.setFlatten(true);
        options.setResolve(true);
        final OpenAPI openAPI = openApiParser.read("openapi/" + inputSpecName, null, options);

        final ClientOptInput opts = new ClientOptInput()
                .config(config)
                .openAPI(openAPI);
        new DefaultGenerator().opts(opts)
                .generate();
    }
}
