package Games;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder logBuilder = new StringBuilder();
        List<String> directories = List.of(
                "C:\\User\\sokol\\Main\\src\\Games\\",
                         "C:\\User\\sokol\\Main\\src\\Games\\src",
                         "C:\\User\\sokol\\Main\\src\\Games\\src\\main",
                         "C:\\User\\sokol\\Main\\src\\Games\\src\\test",
                         "C:\\User\\sokol\\Main\\src\\Games\\res",
                         "C:\\User\\sokol\\Main\\src\\Games\\res\\drawables",
                         "C:\\User\\sokol\\Main\\src\\Games\\res\\vectors",
                         "C:\\User\\sokol\\Main\\src\\Games\\res\\icons",
                         "C:\\User\\sokol\\Main\\src\\Games\\res\\savegames",
                         "C:\\User\\sokol\\Main\\src\\Games\\res\\temp");
        for (String directory : directories) {
            createDirectory(directory, logBuilder);
            //System.out.println(directory);
        }
        List<String> filePaths = List.of(
                          "C:\\User\\sokol\\Main\\src\\Games\\src\\main\\Main.java",
                          "C:\\User\\sokol\\Main\\src\\Games\\src\\main\\Utils.java",
                          "C:\\User\\sokol\\Main\\src\\Games\\res\\temp\\temp.txt");
        for (String file : filePaths) {
            createFile(file, logBuilder);

        }
    }

    private static void createFileLog() {
    }

    public static void createDirectory (String path, StringBuilder logBuilder) throws IOException {
        File directory = new File(path);
        boolean created = directory.mkdirs();

        String status = created ? "успешно" : "не удалось";
        logBuilder.append("Папка ").append(path).append(" создана (дата/время) - ")
                .append(LocalDateTime.now()).append(", ").append(status).append("\n");
        //System.out.println(logBuilder);
    }

    public static void createFile(String path, StringBuilder logBuilder) {

         File file = new File(path);
        try {
            boolean created = file.createNewFile();
            String status = created ? "успешно" : "не удалось";

        } catch (IOException e) {
            logBuilder.append("Ошибка при создании файла").append(path).append("дата/время  ").
                    append(LocalDateTime.now()).append(", ").append(e.getMessage()).append("\n");
        }

        public static void createFileLog (String filePaths, String content) {
            String content;
            try (FileWriter writer = new FileWriter("C:\\User\\sokol\\Main\\src\\Games\\res\\temp\\text") {
                writer.write();
                System.out.println("Лог успешно записан в файл temp.txt");
            } catch (IOException e) {
                System.out.println("Ошибка при записи лога в файл temp.txt: " + e.getMessage());
            }
        }

    }
}