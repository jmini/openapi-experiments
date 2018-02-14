package fr.jmini.openapi.converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;

public class ConvertAllMain {

    public static void main(final String[] args) throws Exception {

        Path inputDir = Paths.get("../tests/azure_openapi-diff/swagger20-json");
        Path outputDir = Paths.get("../tests/azure_openapi-diff/openapi301-json");

        // TODO: when using `2.0.0-rc3` for `swagger-core-version`, following files will not work:
        // List<String> ignoredFiles = Arrays.asList("response_check_01.json", "version_check_01.json", "version_check_02.json", "version_check_03.json", "version_check_04.json", "param_check_01.json", "misc_checks_02.json");
        List<String> ignoredFiles = Collections.emptyList();

        convertAllJsonFiles(inputDir, outputDir, ignoredFiles);
    }

    private static void convertAllJsonFiles(Path inputDir, Path outputDir, List<String> ignoredFiles) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("json")
                        && !ignoredFiles.contains(f.toFile()
                                .getName()))
                .forEach(f -> convert(f, inputDir, outputDir));
    }

    private static void convert(Path file, Path inputDir, Path outputDir) {
        Path subPath = inputDir.relativize(file);
        // System.out.println(subPath);

        OpenAPIV3Parser openApiParser = new OpenAPIV3Parser();
        ParseOptions options = new ParseOptions();
        OpenAPI openAPI = openApiParser.read(file.toString(), null, options);

        if (openAPI == null) {
            throw new IllegalStateException("Could not open " + file.toString());
        }

        String content;
        try {
            content = Json.mapper()
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(openAPI);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Error during conversion of '" + file.toString() + "' to JSON ", e);
        }

        Path outPath = outputDir.resolve(subPath);
        System.out.println(outPath.toFile()
                .getAbsolutePath());
        try {
            Files.createDirectories(outPath.getParent());
            Files.write(outPath, content.getBytes());
        } catch (IOException e) {
            throw new IllegalStateException("Could not write file: " + outPath, e);
        }
    }

    private static OpenAPI openOpenAPI(String url) {
        OpenAPIV3Parser openApiParser = new OpenAPIV3Parser();
        ParseOptions options = new ParseOptions();
        return openApiParser.read(url, null, options);
    }

}
