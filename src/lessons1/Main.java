package lessons1;
import java.io.FileOutputStream;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.*;
import java.io.IOException;
public class Main {
         static List<File> listFiles = new LinkedList<File>();


         public static void main(String[] args) {

    GameProgress gp1 = new GameProgress(100,1,1,12.4);
    GameProgress gp2 = new GameProgress(99,2,1,10.9);
    GameProgress gp3 = new GameProgress(98,3,1,11.2);
        File gp1file = new File("C:/User/sokol/Main/src/Games/res/savegames");
        File gp2file = new File("C:/User/sokol/Main/src/Games/res/savegames");
        File gp3file = new File("C:/User/sokol/Main/src/Games/res/savegames");
        saveGame(gp1file,gp1);
        saveGame(gp2file,gp2);
        saveGame(gp3file,gp3);
             textWriteFiles(gp1file);
             textWriteFiles(gp2file);
             textWriteFiles(gp3file);
             listFiles.add(gp1file);
             listFiles.add(gp2file);
             listFiles.add(gp3file);
}
    public static void saveGame (File file,GameProgress gameProgress){
      try (FileOutputStream fos = new FileOutputStream("savegames");
           ObjectOutputStream oos = new ObjectOutputStream(fos)){
               oos.writeObject(gameProgress);
      } catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}
    public static void zipFiles(File file,List <File> list){
             try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(file))){
                 for (File listString: list) {
                     FileInputStream fis = new FileInputStream(listString.toString());
                     ZipEntry zet = new ZipEntry(listString.getName());
                     zos.putNextEntry(zet);
                     byte[] buffer = new byte[fis.available()];
                     fis.read();
                     zos.write(buffer);
                     zos.closeEntry();
                     fis.close();
                 }}
                 catch (Exception ex){
                     System.out.println(ex.getMessage());
                 }
                 }
              public static void textWriteFiles(File file){
                  try {
                      if (file.createNewFile()) {
                          System.out.println("Файл  " + file.getName() + " создан в папке " + file.getParent());
                      } }
                  catch(IOException ex){
                          System.out.println(ex.getMessage());
                      }
                  }
              }





