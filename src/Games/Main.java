package Games;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder logBuilder = new StringBuilder();
        List<String> directories = new ArrayList<>();
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\src");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\src\\main");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\src\\test");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\res");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\res\\drawables");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\res\\vectors");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\res\\icons");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\res\\savegames");
        directories.add("C:\\User\\sokol\\Main\\src\\Games\\res\\temp");
        for (String directory : directories) {
            createDirectory(directory, logBuilder);
        }
        List<String> filePaths = new ArrayList<>();
        filePaths.add("C:\\User\\sokol\\Main\\src\\Games\\src\\main\\Main.java");
        filePaths.add("C:\\User\\sokol\\Main\\src\\Games\\src\\main\\Utils.java");
        filePaths.add("C:\\User\\sokol\\Main\\src\\Games\\res\\temp\\temp.txt");
        for (String file : filePaths) {
            createFile(file, logBuilder);
        }
    }

    public static void createDirectory(String path, StringBuilder logBuilder) {
        File directory = new File(path);
        boolean created = directory.mkdirs();
        String status = created ? "успешно" : "не удалось";
        logBuilder.append("Папка ").append(path).append(" создана (дата/время) - ")
                .append(LocalDateTime.now()).append(", ").append(status).append("\n");
    }

    public static void createFile(String path, StringBuilder logBuilder) throws IOException {
        File file = new File(path);
        try {
            boolean created = file.createNewFile();
            String status = created ? "успешно" : "не удалось";

        } catch (IOException e) {
            logBuilder.append("Ошибка при создании файла").append(path).append("дата/время  ").
                    append(LocalDateTime.now()).append(", ").append(e.getMessage()).append("\n");
        }
        public static void createFileLog (String filePath, String content){
            try (FileWriter writer = new FileWriter("C:\\User\\sokol\\Main\\src\\Games\\res\\temp\\text")) {
                writer.write(String.valueOf(logBuilder));
                System.out.println("Лог успешно записан в файл temp.txt");
            } catch (IOException e) {
                System.out.println("Ошибка при записи лога в файл temp.txt: " + e.getMessage());
            }
        }

    }
}