package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Map.Entry;

public class ExtractFileFromSamplesToSamplesCI {

    public static void doItForMultipleFiles(Path repositoryRoot, Map<String, String> fromRelFolderToRelFolder, String srcFileRelPath, String destRelPathReplace, Map<String, String> scriptsMap) {
        for (Entry<String, String> e : fromRelFolderToRelFolder.entrySet()) {
            doItForOneFile(repositoryRoot, e.getKey(), srcFileRelPath, e.getValue(), destRelPathReplace, scriptsMap);
        }
    }

    public static void doItForOneFile(Path repositoryRoot, String sampleProjectRelPath, String srcFileRelPath, String destFolderRelPath, String destRelPathReplace, Map<String, String> scriptsMap) {
        Path pathInProject = repositoryRoot.resolve(sampleProjectRelPath)
                .resolve(srcFileRelPath);
        Path pathInCiFolder = repositoryRoot.resolve(destFolderRelPath)
                .resolve(replaceInRelPath(srcFileRelPath, destRelPathReplace));

        String script = scriptsMap.get(sampleProjectRelPath);
        if (script == null) {
            throw new IllegalStateException("No script found for '" + sampleProjectRelPath + "' output folder");
        }
        Path scriptPath = repositoryRoot.resolve(script);
        if (!Files.isRegularFile(scriptPath)) {
            throw new IllegalStateException("Script file '" + scriptPath + "' does not exist.");
        }
        String contentToAppend = "" +
        // "\n" +
                "mkdir -p " + repositoryRoot.relativize(pathInProject.getParent()) + "\n" +
                "cp " + repositoryRoot.relativize(pathInCiFolder) + " " + repositoryRoot.relativize(pathInProject) + "\n" +
                "";

        try {
            Files.createDirectories(pathInCiFolder.getParent());
            Files.copy(pathInProject, pathInCiFolder, StandardCopyOption.REPLACE_EXISTING);
            Files.write(scriptPath, contentToAppend.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String replaceInRelPath(String srcFileRelPath, String destRelPathReplace) {
        String result = srcFileRelPath.replace(destRelPathReplace, "");
        if (result.startsWith("/")) {
            return result.substring(1);
        }
        return result;
    }
}
