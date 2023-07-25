package Games;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws Exception {
        // Создание директорий

        StringBuilder stringBuilder = new StringBuilder();
        File dir = new File("C:Games");
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Директория Games успешно создана");
            } else {
                System.out.println("Неудалось создать директорию C:Games");
            }
        } else {
            System.out.println("Так директория уже есть C:Games");
        }
        stringBuilder.append("C:Games");

        File dir1 = new File("Games/src");

        if (!dir1.exists()) {
            if (dir1.mkdir()) {
                System.out.println("Директория Games/src успешно создана");
            } else {
                System.out.println("Неудалось создать директорию Games/src");
            }
        } else {
            System.out.println("Так директория уже есть Games/src");
        }
        stringBuilder.append("Games/src");
        File dir2 = new File("Games/res");
        if (!dir2.exists()) {
            if (dir2.mkdir()) {
                System.out.println("Директория Games/res успешно создана");
            } else {
                System.out.println("Неудалось создать директорию Games/res");
            }
        } else {
            System.out.println("Так директория уже есть Games/res");
        }
        stringBuilder.append("Games/res");
        File dir3 = new File("Games/savegames");
        if (!dir3.exists()) {
            if (dir3.mkdir()) {
                System.out.println("Директория Games/savegames успешно создана");
            } else {
                System.out.println("Неудалось создать директорию Games/savegames");
            }
        } else {
            System.out.println("Так директория уже есть Games/savegames");
        }
        stringBuilder.append("Games/save games");

        File dir4 = new File("Games/temp");
        if (!dir4.exists()) {
            if (dir4.mkdir()) {
                System.out.println("Директория Games/temp успешно создана");
            } else {
                System.out.println("Неудалось создать директорию Games/temp");
            }
        } else {
            System.out.println("Так директория уже есть Games/temp");
        }
        stringBuilder.append("Games/temp");
        File dir5 = new File("Games/src/main");
        if (!dir5.exists()) {
            if (dir5.mkdir()) {
                System.out.println("Директория Games успешно создана Games/src/main");
            } else {
                System.out.println("Неудалось создать директорию Games/src/main");
            }
        } else {
            System.out.println("Так директория уже есть Games/src/main");
        }
        stringBuilder.append("Games/src/main");
        File dir6 = new File("Games/src/test");
        if (!dir6.exists()) {
            if (dir6.mkdir()) {
                System.out.println("Директория Games успешно создана Games/src/test");
            } else {
                System.out.println("Неудалось создать директорию Games/src/test");
            }
        } else {
            System.out.println("Так директория уже есть Games/src/test");
        }
        stringBuilder.append("Games/src/test");

        File tempFile = new File("Games/temp/temp.txt");
        try {
            if (tempFile.createNewFile()) {
                System.out.println("Данный файл Games/temp/temp.txt успешно создан");
            } else {
                System.out.println("Данный файл Games/temp/temp.txt не создан");
            }
        } catch (Exception e) {
            System.out.println("Не удалось создать файл Games/temp/temp.txt");
            e.printStackTrace();
            File mainFile1 = new File("Games/src/main/Main.java");
            File mainFile2 = new File("Games/src/main/Utils.java");
            try {
                if (mainFile1.createNewFile() && mainFile2.createNewFile()) {
                    System.out.println("Файлы Main.java и Utils.java успешно созданы");
                } else {
                    System.out.println("Не удалось создать файлы Main.java и Utils.java");
                }
            } catch (Exception ev) {
                System.out.println("Не удалось создать файлы Main.java и Utils.java");
                ev.printStackTrace();
            }

            // Создание трех директорий в директории res
            File drawablesDir = new File("Games/res/drawables");
            File vectorsDir = new File("Games/res/vectors");
            File iconsDir = new File("Games/res/icons");
            if (drawablesDir.mkdir() && vectorsDir.mkdir() && iconsDir.mkdir()) {
                System.out.println("Директории drawables, vectors, icons успешно созданы");
            } else {
                System.out.println("Не удалось создать директории drawables, vectors, icons");
            }
        }

        try (FileWriter writer = new FileWriter(dir6 + "/temp.txt", false)) {
            writer.write(stringBuilder.toString());
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}




