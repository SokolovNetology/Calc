package Games;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создание директорий
        File dir = new File("С://Games");
        if (dir.mkdir()) {
            System.out.println("Каталог создан");
        }


        File dir1 = new File(dir, "src");
        dir1.mkdir();

        File dir2 = new File(dir, "res");
        dir2.mkdir();

        File dir3 = new File(dir, "savegames");
        dir3.mkdir();

        File dir4 = new File(dir, "temp");
        dir4.mkdir();
        File mainFile = new File(dir1, "Main.java");
        File utilsFile = new File(dir1, "Utils.java");
        try {
            mainFile.createNewFile();
            utilsFile.createNewFile();

            File drawablesDir = new File(dir2, "drawables");
            drawablesDir.mkdir();

            File vectorsDir = new File(dir2, "vectors");
            vectorsDir.mkdir();

            File iconsDir = new File(dir2, "icons");
            iconsDir.mkdir();

            File tempFile = new File(dir2, "temp.txt");
            tempFile.createNewFile();

            System.out.println("Структура директорий и файлов задана успешно!");
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при создании директорий и файлов!");
            exception.printStackTrace();
        }
    }
}



