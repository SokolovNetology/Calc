package games;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        StringBuilder logBuilder = new StringBuilder();

        List<String> directories = List.of(
                "C:/User/sokol/Main/src/Games/",
                "C:/User/sokol/Main/src/Games/src",
                "C:/User/sokol/Main/src/Games/src/main",
                "C:/User/sokol/Main/src/Games/src/test",
                "C:/User/sokol/Main/src/Games/res",
                "C:/User/sokol/Main/src/Games/res/drawables",
                "C:/User/sokol/Main/src/Games/res/vectors",
                "C:/User/sokol/Main/src/Games/res/icons",
                "C:/User/sokol/Main/src/Games/res/savegames",
                "C:/User/sokol/Main/src/Games/res/temp");
        for (String directory : directories) {
            createDirectory(directory, logBuilder);
        }
        List<String> file = List.of(
                "C:/User/sokol/Main/src/Games/src/main/Main.java",
                "C:/User/sokol/Main/src/Games/src/main/Utils.java",
                "C:/User/sokol/Main/src/Games/res/temp/temp.txt");
        for (String fileP : file) {
            createFile(fileP, logBuilder);

        }
        String filePaths = "C:/User/sokol/Main/src/Games/res/temp/text";
        String content = "/temp.txt:/";
        createFileLog(filePaths, content);
    }

    public static void createDirectory(String path, StringBuilder logBuilder) {
        File directory = new File(path);
        boolean created = directory.mkdirs();
        String status = created ? "успешно" : "не удалось";
        logBuilder.append("Папка ").append(path).append(" создана (дата/время) - ")
                .append(LocalDateTime.now()).append(", ").append(status).append("\n");

    }

    public static void createFile(String path, StringBuilder logBuilder) {

        try {
            File file = new File(path);
            boolean created = file.createNewFile();
            String status = created ? "успешно" : "не удалось";
        } catch (IOException e) {
            logBuilder.append("Ошибка при создании файла").append(path).append("дата/время  ").
                    append(LocalDateTime.now()).append(", ").append(e.getMessage()).append("\n");
        }
    }

    public static void createFileLog(String filePaths, String content) {

        try (FileWriter writer = new FileWriter(filePaths)) {
            writer.write(content);
            writer.flush();
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Ошибка при записи лога в файл temp.txt: " + e.getMessage());
        }
    }
}

