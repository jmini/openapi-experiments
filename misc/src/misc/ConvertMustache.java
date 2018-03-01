package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

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

    private static final Collection<TagPair> ENUM_VARS = Collections.singletonList(new TagPair("{{#enumVars}}", "{{/enumVars}}"));

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

        result = replaceInContentOutside(result, Arrays.asList(
                new Replacement("{{#isInteger}}", "{{#is this 'integer'}}", "{{/isInteger}}", "{{/is}}"),
                new Replacement("{{^isInteger}}", "{{#isNot this 'integer'}}", "{{/isInteger}}", "{{/isNot}}")),
                ENUM_VARS);

        result = replaceInContentOutside(result, Arrays.asList(
                new Replacement("{{#isDouble}}", "{{#is this 'double'}}", "{{/isDouble}}", "{{/is}}"),
                new Replacement("{{^isDouble}}", "{{#isNot this 'double'}}", "{{/isDouble}}", "{{/isNot}}")),
                ENUM_VARS);

        result = replaceInContentOutside(result, Arrays.asList(
                new Replacement("{{#isLong}}", "{{#is this 'long'}}", "{{/isLong}}", "{{/is}}"),
                new Replacement("{{^isLong}}", "{{#isNot this 'long'}}", "{{/isLong}}", "{{/isNot}}")),
                ENUM_VARS);

        result = replaceInContentOutside(result, Arrays.asList(
                new Replacement("{{#isFloat}}", "{{#is this 'float'}}", "{{/isFloat}}", "{{/is}}"),
                new Replacement("{{^isFloat}}", "{{#isNot this 'float'}}", "{{/isFloat}}", "{{/isNot}}")),
                ENUM_VARS);

        result = replaceInContentOutside(result, Arrays.asList(
                new Replacement("{{#isBoolean}}", "{{#is this 'boolean'}}", "{{/isBoolean}}", "{{/is}}"),
                new Replacement("{{^isBoolean}}", "{{#isNot this 'boolean'}}", "{{/isBoolean}}", "{{/isNot}}")),
                ENUM_VARS);

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

        result = replaceInContentInside(result, Arrays.asList(
                new Replacement("{{#hasMore}}", "{{#has this 'more'}}", "{{/hasMore}}", "{{/has}}"),
                new Replacement("{{^hasMore}}", "{{#hasNot this 'more'}}", "{{/hasMore}}", "{{/hasNot}}")),
                Arrays.asList(
                        new TagPair("{{#responses}}", "{{/responses}}"),
                        new TagPair("{{#vars}}", "{{/vars}}"),
                        new TagPair("{{#allParams}}", "{{/allParams}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#hasVars}}", "{{#has this 'vars'}}", "{{/hasVars}}", "{{/has}}"),
                new Replacement("{{^hasVars}}", "{{#hasNot this 'vars'}}", "{{/hasVars}}", "{{/hasNot}}")));

        result = replaceInContentInside(result, Arrays.asList(
                new Replacement("{{#hasConsumes}}", "{{#has this 'consumes'}}", "{{/hasConsumes}}", "{{/has}}"),
                new Replacement("{{^hasConsumes}}", "{{#hasNot this 'consumes'}}", "{{/hasConsumes}}", "{{/hasNot}}")),
                Collections.singletonList(new TagPair("{{#operation}}", "{{/operation}}")));

        result = replaceInContentInside(result, Arrays.asList(
                new Replacement("{{#hasProduces}}", "{{#has this 'produces'}}", "{{/hasProduces}}", "{{/has}}"),
                new Replacement("{{^hasProduces}}", "{{#hasNot this 'produces'}}", "{{/hasProduces}}", "{{/hasNot}}")),
                Collections.singletonList(new TagPair("{{#operation}}", "{{/operation}}")));

        result = replaceInContent(result, Arrays.asList(
                new Replacement("{{#items.isEnum}}", "{{#is items 'enum'}}", "{{/items.isEnum}}", "{{/is}}"),
                new Replacement("{{^items.isEnum}}", "{{#isNot items 'enum'}}", "{{/items.isEnum}}", "{{/isNot}}")));

        result = result.replace("swaggerUrl: ./src/main/swagger/swagger.yaml", "swaggerUrl: ./src/main/resources/openapi3.yaml");
        result = result.replace("import io.swagger.inflector.models.RequestContext;", "import io.swagger.oas.inflector.models.RequestContext;");
        result = result.replace("import io.swagger.inflector.models.ResponseContext;", "import io.swagger.oas.inflector.models.ResponseContext;");
        result = result.replace("{{{swagger-yaml}}}", "{{{openapi3-yaml}}}");
        return result;
    }

    static String replaceInContentInside(String content, Collection<Replacement> repacements, Collection<TagPair> inside) {
        if (content == null || repacements == null || repacements.isEmpty()) {
            return content;
        }
        String result = content;
        int fromIndex = 0;
        while (fromIndex != Integer.MAX_VALUE) {
            TagPairIndex<TagPair> pair = searchTagPair(inside, Function.identity(), result, fromIndex);
            fromIndex = pair.openTagEndIndex;
            if (pair.isMatch) {
                String subContent = result.substring(pair.openTagEndIndex, pair.closeTagStartIndex);
                subContent = replaceInContent(subContent, repacements);
                result = result.substring(0, pair.openTagEndIndex)
                        + subContent
                        + result.substring(pair.closeTagStartIndex);
            }
        }
        return result;
    }

    static String replaceInContent(String content, Collection<Replacement> repacements) {
        return replaceInContentOutside(content, repacements, Collections.emptyList());
    }

    static String replaceInContentOutside(String content, Collection<Replacement> repacements, Collection<TagPair> excludes) {
        if (content == null || repacements == null || repacements.isEmpty()) {
            return content;
        }
        String result = content;
        int fromIndex = 0;
        while (fromIndex != Integer.MAX_VALUE) {
            TagPairIndex<TagPair> exclude = searchTagPair(excludes, Function.identity(), result, fromIndex);
            TagPairIndex<Replacement> replacement = searchTagPair(repacements, Replacement::getTagPair, result, fromIndex);
            if (exclude.openTagStartIndex < replacement.openTagStartIndex) {
                fromIndex = exclude.closeTagEndIndex;
            } else {
                fromIndex = replacement.openTagEndIndex;
                if (replacement.isMatch) {
                    for (Replacement r : repacements) {
                        int i = result.indexOf(r.getOpenTag(), fromIndex);
                        if (i > -1 && i < replacement.closeTagStartIndex) {
                            throw new IllegalStateException("Found nested replacement " + r + " in " + replacement.object);
                        }
                    }
                    for (TagPair r : excludes) {
                        int i = result.indexOf(r.getOpenTag(), fromIndex);
                        if (i > -1 && i < replacement.closeTagStartIndex) {
                            throw new IllegalStateException("Found nested exclude " + r + " in " + replacement.object);
                        }
                    }
                    result = result.substring(0, replacement.openTagStartIndex)
                            + replacement.object.getOpenTagReplacement()
                            + result.substring(replacement.openTagEndIndex, replacement.closeTagStartIndex)
                            + replacement.object.getCloseTagReplacement()
                            + result.substring(replacement.closeTagEndIndex);
                }
            }
        }
        return result;
    }

    private static <O> TagPairIndex<O> searchTagPair(Collection<O> collection, Function<O, TagPair> tagPairProvider, String content, int fromIndex) {
        TagPairIndex<O> result = TagPairIndex.maxValue();
        for (O item : collection) {
            TagPairIndex<O> match = indexOfTagPair(item, tagPairProvider.apply(item), content, fromIndex);
            if (match.isMatch && match.openTagStartIndex < result.openTagStartIndex) {
                result = match;
            }
        }
        return result;
    }

    private static <O> TagPairIndex<O> indexOfTagPair(O object, TagPair tagPair, String content, int fromIndex) {
        int openTagStartIndex = content.indexOf(tagPair.getOpenTag(), fromIndex);
        if (openTagStartIndex == -1) {
            return TagPairIndex.maxValue();
        }
        int openTagEndIndex = openTagStartIndex + tagPair.getOpenTag()
                .length();

        int closeTagStartIndex = content.indexOf(tagPair.getCloseTag(), openTagEndIndex);
        if (closeTagStartIndex == -1) {
            throw new IllegalStateException("CloseTag not found after index " + openTagEndIndex + " for " + tagPair);
        }
        int closeTagEndIndex = closeTagStartIndex + tagPair.getCloseTag()
                .length();
        return TagPairIndex.newMatch(object, openTagStartIndex, openTagEndIndex, closeTagStartIndex, closeTagEndIndex);
    }

    public static class Replacement {
        private final TagPair tagPair;
        private final TagPair tagPairReplacement;

        public Replacement(String openTag, String openTagReplacement, String closeTag, String closeTagReplacement) {
            super();
            this.tagPair = new TagPair(openTag, closeTag);
            this.tagPairReplacement = new TagPair(openTagReplacement, closeTagReplacement);
        }

        public TagPair getTagPair() {
            return tagPair;
        }

        public String getOpenTag() {
            return tagPair.getOpenTag();
        }

        public String getOpenTagReplacement() {
            return tagPairReplacement.getOpenTag();
        }

        public String getCloseTag() {
            return tagPair.getCloseTag();
        }

        public String getCloseTagReplacement() {
            return tagPairReplacement.getCloseTag();
        }
    }

    public static class TagPair {
        private final String openTag;
        private final String closeTag;

        public TagPair(String openTag, String closeTag) {
            super();
            this.openTag = openTag;
            this.closeTag = closeTag;
        }

        public String getOpenTag() {
            return openTag;
        }

        public String getCloseTag() {
            return closeTag;
        }
    }

    private static class TagPairIndex<T> {
        private final T object;
        private final boolean isMatch;
        private final int openTagStartIndex;
        private final int openTagEndIndex;
        private final int closeTagStartIndex;
        private final int closeTagEndIndex;

        private TagPairIndex(T object, boolean isMatch, int openTagStartIndex, int openTagEndIndex, int closeTagStartIndex, int closeTagEndIndex) {
            super();
            this.object = object;
            this.isMatch = isMatch;
            this.openTagStartIndex = openTagStartIndex;
            this.openTagEndIndex = openTagEndIndex;
            this.closeTagStartIndex = closeTagStartIndex;
            this.closeTagEndIndex = closeTagEndIndex;
        }

        private static <O> TagPairIndex<O> newMatch(O object, int openTagStartIndex, int openTagEndIndex, int closeTagStartIndex, int closeTagEndIndex) {
            return new TagPairIndex<O>(object, true, openTagStartIndex, openTagEndIndex, closeTagStartIndex, closeTagEndIndex);
        }

        private static <O> TagPairIndex<O> maxValue() {
            return new TagPairIndex<O>(null, false, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }
}
