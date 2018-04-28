package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CheckVersion {

    /**
     * In the <code>Entry<String, String>></code> item of the list, the key correspond to the relative-path of the output folder, the value to the version.
     */
    public static Map<Status, List<Entry<String, String>>> projectsByVersion(Path inputDir, String expectedVersion) throws IOException {
        Map<String, String> map = Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .equals("VERSION"))
                .collect(Collectors.toMap(
                        f -> inputDir.relativize(f)
                                .getParent()
                                .getParent()
                                .toString(),
                        CheckVersion::readFile));

        Map<Status, List<Entry<String, String>>> groupedBy = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> expectedVersion.equals(e.getValue()) ? Status.VERSION_OK : Status.OLD_VERSION));
        return groupedBy;
    }

    /**
     * @param inputDir
     * @param expectedVersion
     * @throws IOException
     */
    public static void printVersions(Path inputDir, String expectedVersion) throws IOException {
        Map<Status, List<Entry<String, String>>> groupedBy = projectsByVersion(inputDir, expectedVersion);

        if (groupedBy.containsKey(Status.OLD_VERSION)) {
            System.out.println("== NOK:");
            groupedBy.get(Status.OLD_VERSION)
                    .stream()
                    .sorted(Comparator.comparing(Entry::getKey))
                    .forEach(e -> System.out.println(e.getKey() + "  (" + e.getValue() + ")"));
        } else {
            System.out.println("All 'VERSION' files correspond to the expected version");
        }

        if (groupedBy.containsKey(Status.VERSION_OK)) {
            System.out.println("");
            System.out.println("== OK:");
            groupedBy.get(Status.VERSION_OK)
                    .stream()
                    .map(Entry::getKey)
                    .sorted()
                    .forEach(System.out::println);
        }
    }

    public static String readFile(Path file) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            content = "ERROR";
        }
        return content.trim();
    }

    public static enum Status {
        VERSION_OK, OLD_VERSION
    }

}
