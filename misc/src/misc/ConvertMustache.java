package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ConvertMustache {

    public static void convertAllMustacheFiles(Path inputDir, Path outputDir) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("mustache"))
                .forEach(f -> convert(f, inputDir, outputDir));
    }

    private static void convert(Path file, Path inputDir, Path outputDir) {
        Path subPath = inputDir.relativize(file);

        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        content = convertContent(content);

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

    /**
     * @param content
     * @return
     */
    private static String convertContent(String content) {
        String result = content;

        result = replaceInContent(result, Collections.singletonList(new Replacement("{{#isBodyParam}}", "{{#is this 'body-param'}}", "{{/isBodyParam}}", "{{/is}}")));
        // result = replaceInContent(result, Collections.singletonList(new Replacement("{{#allowableValues}}", "{{#if allowableValues}}", "{{/allowableValues}}", "{{/if}}")));
        // result = replaceInContent(result, Collections.singletonList(new Replacement("{{#enumVars}}", "{{#if allowableValues.enumVars}}", "{{/enumVars}}", "{{/if}}")));
        result = replaceInContent(result, Collections.singletonList(new Replacement("{{^-last}}", "{{^@last}}", "{{/-last}}", "{{/@last}}")));
        result = replaceInContent(result, Collections.singletonList(new Replacement("{{#-last}}", "{{#@last}}", "{{/-last}}", "{{/@last}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#gson}}", "{{#if gson}}", "{{/gson}}", "{{/if}}"),
                new Replacement("{{^gson}}", "{{#unless gson}}", "{{/gson}}", "{{/unless}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isInteger}}", "{{#is this 'integer'}}", "{{/isInteger}}", "{{/is}}"),
                new Replacement("{{^isInteger}}", "{{#isNot this 'integer'}}", "{{/isInteger}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isDouble}}", "{{#is this 'double'}}", "{{/isDouble}}", "{{/is}}"),
                new Replacement("{{^isDouble}}", "{{#isNot this 'double'}}", "{{/isDouble}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isLong}}", "{{#is this 'long'}}", "{{/isLong}}", "{{/is}}"),
                new Replacement("{{^isLong}}", "{{#isNot this 'long'}}", "{{/isLong}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isFloat}}", "{{#is this 'float'}}", "{{/isFloat}}", "{{/is}}"),
                new Replacement("{{^isFloat}}", "{{#isNot this 'float'}}", "{{/isFloat}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isBoolean}}", "{{#is this 'boolean'}}", "{{/isBoolean}}", "{{/is}}"),
                new Replacement("{{^isBoolean}}", "{{#isNot this 'boolean'}}", "{{/isBoolean}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isFormParam}}", "{{#is this 'form-param'}}", "{{/isFormParam}}", "{{/is}}"),
                new Replacement("{{^isFormParam}}", "{{#isNot this 'form-param'}}", "{{/isFormParam}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isFile}}", "{{#is this 'file'}}", "{{/isFile}}", "{{/is}}"),
                new Replacement("{{^isFile}}", "{{#isNot this 'file'}}", "{{/isFile}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isHeaderParam}}", "{{#is this 'header-param'}}", "{{/isHeaderParam}}", "{{/is}}"),
                new Replacement("{{^isHeaderParam}}", "{{#isNot this 'header-param'}}", "{{/isHeaderParam}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isEnum}}", "{{#is this 'enum'}}", "{{/isEnum}}", "{{/is}}"),
                new Replacement("{{^isEnum}}", "{{#isNot this 'enum'}}", "{{/isEnum}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isPathParam}}", "{{#is this 'path-param'}}", "{{/isPathParam}}", "{{/is}}"),
                new Replacement("{{^isPathParam}}", "{{#isNot this 'path-param'}}", "{{/isPathParam}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isContainer}}", "{{#is this 'container'}}", "{{/isContainer}}", "{{/is}}"),
                new Replacement("{{^isContainer}}", "{{#isNot this 'container'}}", "{{/isContainer}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isQueryParam}}", "{{#is this 'query-param'}}", "{{/isQueryParam}}", "{{/is}}"),
                new Replacement("{{^isQueryParam}}", "{{#isNot this 'query-param'}}", "{{/isQueryParam}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isDeprecated}}", "{{#is this 'deprecated'}}", "{{/isDeprecated}}", "{{/is}}"),
                new Replacement("{{^isDeprecated}}", "{{#isNot this 'deprecated'}}", "{{/isDeprecated}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isBasic}}", "{{#is this 'basic'}}", "{{/isBasic}}", "{{/is}}"),
                new Replacement("{{^isBasic}}", "{{#isNot this 'basic'}}", "{{/isBasic}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isApiKey}}", "{{#is this 'api-key'}}", "{{/isApiKey}}", "{{/is}}"),
                new Replacement("{{^isApiKey}}", "{{#isNot this 'api-key'}}", "{{/isApiKey}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isOAuth}}", "{{#is this 'oauth'}}", "{{/isOAuth}}", "{{/is}}"),
                new Replacement("{{^isOAuth}}", "{{#isNot this 'oauth'}}", "{{/isOAuth}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isPrimitiveType}}", "{{#is this 'primitive-type'}}", "{{/isPrimitiveType}}", "{{/is}}"),
                new Replacement("{{^isPrimitiveType}}", "{{#isNot this 'primitive-type'}}", "{{/isPrimitiveType}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#isKeyInHeader}}", "{{#is this 'key-in-header'}}", "{{/isKeyInHeader}}", "{{/is}}"),
                new Replacement("{{^isKeyInHeader}}", "{{#isNot this 'key-in-header'}}", "{{/isKeyInHeader}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{^isNotContainer}}", "{{#is this 'container'}}", "{{/isNotContainer}}", "{{/is}}"),
                new Replacement("{{#isNotContainer}}", "{{#isNot this 'container'}}", "{{/isNotContainer}}", "{{/isNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#hasMore}}", "{{#has this 'more'}}", "{{/hasMore}}", "{{/has}}"),
                new Replacement("{{^hasMore}}", "{{#hasNot this 'more'}}", "{{/hasMore}}", "{{/hasNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#hasVars}}", "{{#has this 'vars'}}", "{{/hasVars}}", "{{/has}}"),
                new Replacement("{{^hasVars}}", "{{#hasNot this 'vars'}}", "{{/hasVars}}", "{{/hasNot}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#items.isEnum}}", "{{#is items 'enum'}}", "{{/items.isEnum}}", "{{/is}}"),
                new Replacement("{{^items.isEnum}}", "{{#isNot items 'enum'}}", "{{/items.isEnum}}", "{{/isNot}}")));

        result = result.replace("swaggerUrl: ./src/main/swagger/swagger.yaml", "swaggerUrl: ./src/main/resources/openapi3.yaml");
        result = result.replace("import io.swagger.inflector.models.RequestContext;", "import io.swagger.oas.inflector.models.RequestContext;");
        result = result.replace("import io.swagger.inflector.models.ResponseContext;", "import io.swagger.oas.inflector.models.ResponseContext;");
        result = result.replace("{{{swagger-yaml}}}", "{{{openapi3-yaml}}}");
        return result;
    }

    static String replaceInContent(String content, Collection<Replacement> repacements) {
        if (content == null || repacements == null || repacements.isEmpty()) {
            return content;
        }
        String result = content;
        int index = 0;
        while (index != Integer.MAX_VALUE) {
            int nextIndex = Integer.MAX_VALUE;
            Replacement replacementToDo = null;
            for (Replacement r : repacements) {
                int i = result.indexOf(r.getOpenTag(), index);
                if (i > -1 && i < nextIndex) {
                    replacementToDo = r;
                    nextIndex = i;
                }
            }
            index = nextIndex;
            if (replacementToDo != null) {
                int searchIndex = index + replacementToDo.getOpenTag()
                        .length();

                int closeIndex = result.indexOf(replacementToDo.getCloseTag(), searchIndex);
                if (closeIndex == -1) {
                    throw new IllegalStateException("CloseTag not found after index " + index + " for " + replacementToDo);
                }
                for (Replacement r : repacements) {
                    int i = result.indexOf(r.getOpenTag(), searchIndex);
                    if (i > -1 && i < closeIndex) {
                        throw new IllegalStateException("Found nested replacement " + r + " in " + replacementToDo);
                    }
                }
                result = result.substring(0, index) + replacementToDo.getOpenTagReplacement() + result.substring(index + replacementToDo.getOpenTag()
                        .length(), closeIndex) + replacementToDo.getCloseTagReplacement() + result.substring(closeIndex + replacementToDo.getCloseTag()
                                .length());
            }
        }
        return result;
    }

    public static class Replacement {
        private String openTag;
        private String openTagReplacement;
        private String closeTag;
        private String closeTagReplacement;

        public Replacement(String openTag, String openTagReplacement,
                String closeTag, String closeTagReplacement) {
            super();
            this.openTag = openTag;
            this.openTagReplacement = openTagReplacement;
            this.closeTag = closeTag;
            this.closeTagReplacement = closeTagReplacement;
        }

        public String getOpenTag() {
            return openTag;
        }

        public String getOpenTagReplacement() {
            return openTagReplacement;
        }

        public String getCloseTag() {
            return closeTag;
        }

        public String getCloseTagReplacement() {
            return closeTagReplacement;
        }

    }
}
