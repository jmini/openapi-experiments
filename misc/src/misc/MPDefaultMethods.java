/**
 *
 */
package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jbr
 *
 */
public class MPDefaultMethods {

    public static void modifyFolder(Path inputDir) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith(".java"))
                .forEach(f -> modifyFile(f));
    }

    public static void modifyFile(Path file) {
        String className = file.toFile()
                .getName()
                .replace(".java", "");
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        Pattern pattern = Pattern.compile(className + " ([a-zA-Z]+)\\([^\\)]+\\);");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            if (!matcher.group(1)
                    .startsWith("add")) {
                String newContent = "default " + matcher.group()
                        .substring(0, matcher.group()
                                .length() - 1) + " {\n"
                        + "        set" + capitalizeString(matcher.group(1)) + "(" + matcher.group(1) + ");\n"
                        + "        return this;\n"
                        + "    }";
                content = content.substring(0, matcher.start()) + newContent + content.substring(matcher.end());
                matcher = pattern.matcher(content);
            }
        }

        try {
            Files.write(file, content.getBytes());
        } catch (IOException e) {
            throw new IllegalStateException("Could not write file: " + file, e);
        }
    }

    public static String capitalizeString(final String string) {
        return string.isEmpty() ? "" : Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }
}
