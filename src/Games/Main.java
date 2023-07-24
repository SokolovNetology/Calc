package Games;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // Создание директорий
        StringBuilder stringBuilder = new StringBuilder();
        File dir = new File("C:Games");
        dir.mkdir();
            stringBuilder.append("C:Games");
        System.out.println();
        File dir1 = new File(dir, "src");
        dir1.mkdir();
             stringBuilder.append("src/main");
        File dir2 = new File(dir1, "main");
        dir2.mkdir();
             stringBuilder.append("src/main");
        File dir3 = new File(dir1, "test");
        dir3.mkdir();
        stringBuilder.append("test");

        File dir4 = new File(dir, "res");
        dir4.mkdir();
             stringBuilder.append("res");
        File dir5 = new File(dir, "save games");
        dir5.mkdir();
             stringBuilder.append("res");
        File dir6 = new File(dir, "save games");
        dir6.mkdir();
             stringBuilder.append("save games");

        File mainFile = new File(dir1, "/main/Main.java");
             stringBuilder.append("/main/Main.java");
        File utilsFile = new File(dir1, "/main/Utils.java");
             stringBuilder.append("/main/Utils.java");
        try {
            mainFile.createNewFile();
            utilsFile.createNewFile();

            File drawablesDir = new File(dir2, "res/drawables");
            drawablesDir.mkdir();
               stringBuilder.append("res/drawables");
            File vectorsDir = new File(dir2, "res/vectors");
            vectorsDir.mkdir();
                stringBuilder.append("res/vectors");
            File iconsDir = new File(dir2, "res/icons");
            iconsDir.mkdir();
                  stringBuilder.append("res/icons");
            File tempFile = new File(dir2, "temp.txt");
            tempFile.createNewFile();

            System.out.println("Структура директорий и файлов задана успешно!");
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при создании директорий и файлов!");
            exception.printStackTrace();
        }
    }
}



