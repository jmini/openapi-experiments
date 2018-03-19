package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FixVersionInPom {
    public static void convertAllPom(Path inputDir, NewVersions newVersions) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .equals("pom.xml"))
                .forEach(f -> convertPom(f, newVersions));
    }

    private static void convertPom(Path file, NewVersions newVersions) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        content = replaceVersion(content, "version", "3.0.0-SNAPSHOT", newVersions.v3Replacement);
        content = replaceVersion(content, "version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "version", "1.0.0-SNAPSHOT", newVersions.v1Replacement);

        content = replaceVersion(content, "swagger-codegen-version", "3.0.0-SNAPSHOT", newVersions.v3Replacement);

        content = replaceVersion(content, "swagger-parser-version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "swagger-core-version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "swagger-core-module-version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "models.version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "core.version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "annotations.version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "integration.version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);
        content = replaceVersion(content, "swagger.version", "2.0.0-SNAPSHOT", newVersions.v2Replacement);

        content = replaceVersion(content, "swagger-codegen-generators-version", "1.0.0-SNAPSHOT", newVersions.v1Replacement);

        System.out.println(file);
        try {
            Files.write(file, content.getBytes());
        } catch (IOException e) {
            throw new IllegalStateException("Could not write file: " + file, e);
        }
    }

    private static String replaceVersion(String content, String tagName, String currentVersion, String newVersion) {
        content = content.replace("<" + tagName + ">" + currentVersion + "</" + tagName + ">", "<" + tagName + ">" + newVersion + "</" + tagName + ">");
        return content;
    }

    public static class NewVersions {
        final String v1Replacement;
        final String v2Replacement;
        final String v3Replacement;

        public NewVersions(String v1Replacement, String v2Replacement, String v3Replacement) {
            super();
            this.v1Replacement = v1Replacement;
            this.v2Replacement = v2Replacement;
            this.v3Replacement = v3Replacement;
        }
    }
}
