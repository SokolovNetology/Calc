package Games;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Создание директорий
        File Games = new File("Games");
        Games.mkdir();

        File src = new File(Games, "src");
        src.mkdir();

        File res = new File(Games, "res");
        res.mkdir();

        File savegamesDir = new File(Games, "savegames");
        savegamesDir.mkdir();

        File tempDir = new File(Games, "temp");
        tempDir.mkdir();

        // Создание файлов
        File mainFile = new File(src, "Main.java");

        File utilsFile = new File(src, "Utils.java");


        try {
            mainFile.createNewFile();
            utilsFile.createNewFile();

            File drawablesDir = new File(res, "drawables");
            drawablesDir.mkdir();

            File vectorsDir = new File(res, "vectors");
            vectorsDir.mkdir();

            File iconsDir = new File(res, "icons");
            iconsDir.mkdir();

            File tempFile = new File(tempDir, "temp.txt");
            tempFile.createNewFile();

            System.out.println("Структура директорий и файлов задана успешно!");
        } catch (Exception e) {
            System.out.println("Произошла ошибка при создании директорий и файлов!");
            e.printStackTrace();
        }
    }
}