/**
 *
 */
package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.jmini.utils.substringfinder.Range;
import fr.jmini.utils.substringfinder.SubstringFinder;

/**
 * @author jbr
 *
 */
public class SRAdd11Methods {

    public static void modifyFolder(Path inputDir, Map<String, String> fqnMap) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith(".java"))
                .forEach(f -> modifyFile(f, fqnMap));
    }

    public static void modifyFile(Path file, Map<String, String> fqnMap) {
        String className = file.toFile()
                .getName()
                .replace(".java", "");
        String classNameFqn = fqnMap.get(className.replace("Impl", ""));
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        Pattern pattern = Pattern.compile("public [A-Za-z]+ add([A-Za-z]+)\\(String ([A-Za-z]+),");
        Matcher matcher = pattern.matcher(content);
        int startAt = 0;
        while (matcher.find(startAt)) {
            System.out.println(matcher.group());
            String methodPart = matcher.group(1);
            String mapName = decapitalizeString(methodPart) + "s";
            String variableName = matcher.group(2);

            Optional<Range> findRange = SubstringFinder.define("{", "}")
                    .nextRange(content, matcher.start());
            if (!findRange.isPresent()) {
                throw new IllegalStateException("Unxpected");
            }
            Range range = findRange.get();
            // System.out.println(content.substring(range.getRangeStart(), range.getRangeEnd()));
            // String newContent = ""
            String newContent = "\n" +
                    "\n" +
                    "    /**\n" +
                    "     * @see " + classNameFqn + "#remove" + methodPart + "(java.lang.String)\n" +
                    "     */\n" +
                    "    @Override\n" +
                    "    public void remove" + methodPart + "(String " + variableName + ") {\n" +
                    "        if (this." + mapName + " != null) {\n" +
                    "            this." + mapName + ".remove(" + variableName + ");\n" +
                    "        }\n" +
                    "    }";
            content = content.substring(0, range.getRangeEnd()) + newContent + content.substring(range.getRangeEnd());
            matcher = pattern.matcher(content);
            startAt = range.getRangeEnd() + newContent.length();
        }

        try {
            Files.write(file, content.getBytes());
        } catch (IOException e) {
            throw new IllegalStateException("Could not write file: " + file, e);
        }
    }

    public static void modifyFile_removeInList(Path file, Map<String, String> fqnMap) {
        String className = file.toFile()
                .getName()
                .replace(".java", "");
        String classNameFqn = fqnMap.get(className.replace("Impl", ""));
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        Pattern pattern = Pattern.compile("public [A-Za-z]+ add([A-Za-z]+)\\(([A-Za-z]+) ([A-Za-z]+)\\)");
        Matcher matcher = pattern.matcher(content);
        int startAt = 0;
        while (matcher.find(startAt)) {
            System.out.println(matcher.group());
            String methodPart = matcher.group(1);
            String parameterType = matcher.group(2);
            String parameterTypeFqn;
            if (fqnMap.containsKey(parameterType)) {
                parameterTypeFqn = fqnMap.get(parameterType);
            } else {
                parameterTypeFqn = parameterType;
            }
            String variableName = matcher.group(3);

            Optional<Range> findRange = SubstringFinder.define("{", "}")
                    .nextRange(content, matcher.start());
            if (!findRange.isPresent()) {
                throw new IllegalStateException("Unxpected");
            }
            Range range = findRange.get();
            // System.out.println(content.substring(range.getRangeStart(), range.getRangeEnd()));
            String newContent = "\n" +
                    "\n" +
                    "    /**\n" +
                    "     * @see " + classNameFqn + "#remove" + methodPart + "(" + parameterTypeFqn + ")\n" +
                    "     */\n" +
                    "    @Override\n" +
                    "    public void remove" + methodPart + "(" + parameterType + " " + variableName + ") {\n" +
                    "        if (this." + variableName + "s != null) {\n" +
                    "            this." + variableName + "s.remove(" + variableName + ");\n" +
                    "        }\n" +
                    "    }";
            content = content.substring(0, range.getRangeEnd()) + newContent + content.substring(range.getRangeEnd());
            matcher = pattern.matcher(content);
            startAt = range.getRangeEnd() + newContent.length();
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

    public static String decapitalizeString(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1)
                .toLowerCase() + string.substring(1);
    }

}
