package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FindScript {
    private static final Pattern OUTPUT_PATTERN = Pattern.compile("-o ([a-zA-Z0-9-\\/_\\.]+)");

    public static Map<String, String> findScript(Path inputDir, Path rootDir) throws IOException {
        Map<String, String> map = Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith(".sh")
                        && !"openapi3".equals(f.getParent()
                                .toFile()
                                .getName())
                        && !"openapi3".equals(f.getParent()
                                .getParent()
                                .toFile()
                                .getName()))
                .collect(Collectors.toMap(
                        f -> rootDir.relativize(f)
                                .toString(),
                        FindScript::findOutputFolder));

        return map.entrySet()
                .stream()
                .filter(e -> !"NOT_FOUND".equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public static String findOutputFolder(Path file) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            content = "ERROR";
        }

        String r = findOutputFolder(content);
        if (r == null) {
            System.err.println("OUTPUT not found in " + file);
            return "NOT_FOUND";
        }
        return r;
    }

    public static String findOutputFolder(String content) {
        Matcher matcher = OUTPUT_PATTERN.matcher(content);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

}
