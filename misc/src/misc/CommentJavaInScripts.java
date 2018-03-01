package misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommentJavaInScripts {
    public static void convertAllSh(Path inputDir) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("sh"))
                .forEach(CommentJavaInScripts::convertSh);
    }

    private static void convertSh(Path file) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        if (!content.contains("-l java ") && !content.contains("-l inflector ")) {
            content = content.replace("java ", "# java ");
            System.out.println(file);
            try {
                Files.write(file, content.getBytes());
            } catch (IOException e) {
                throw new IllegalStateException("Could not write file: " + file, e);
            }
        }
    }

    public static void convertAllBat(Path inputDir) throws IOException {
        Files.walk(inputDir)
                .filter(f -> f.toFile()
                        .isFile()
                        && f.toFile()
                                .getName()
                                .endsWith("bat"))
                .forEach(CommentJavaInScripts::convertBat);
    }

    private static void convertBat(Path file) {
        String content;
        try {
            content = new String(Files.readAllBytes(file));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Could not read file: " + file, e);
        }

        if (!content.contains("-l java ") && !content.contains("-l inflector ")) {
            content = content.replace("java ", "REM java ");
            System.out.println(file);
            try {
                Files.write(file, content.getBytes());
            } catch (IOException e) {
                throw new IllegalStateException("Could not write file: " + file, e);
            }
        }
    }
}
