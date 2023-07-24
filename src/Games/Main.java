package Games;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создание директорий
        File dir = new File("С://Games");
        if (dir.mkdir()){
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

        // Создание файлов
        File mainFile = new File(dir1, "Main.java");
        mainFile.createNewFile();
        File utilsFile = new File(dir1, "Utils.java");
        utilsFile.createNewFile();

        try {


            File drawablesDir2 = new File(dir2, "drawables");
            drawablesDir2.mkdir();

            File vectorsDir2 = new File(dir2, "vectors");
            vectorsDir2.mkdir();

            File iconsDir2 = new File(dir2, "icons");
            iconsDir2.mkdir();

            File tempFile = new File(dir4, "temp.txt");
            tempFile.createNewFile();

            System.out.println("Структура директорий и файлов задана успешно!");
        } catch (Exception e) {
            System.out.println("Произошла ошибка при создании директорий и файлов!");
            e.printStackTrace();
        }
    }
}