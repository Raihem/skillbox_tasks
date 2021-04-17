import java.io.File;

import org.apache.commons.io.FileUtils;


public class Main {

    public static void main(String[] args) {
        File folder = new File("E:/online/[Skillbox] Java-разработчик (2020)");
        File[] files = folder.listFiles();


        long size = FileUtils.sizeOfDirectory(new File("E:/online/[Skillbox] Java-разработчик (2020)"));


        for(File file: files){
            System.out.print(file);
            System.out.println(" -> "+ ((int)(FileUtils.sizeOfDirectory(new File(String.valueOf(file))))/1024/1024)+ " Megabytes");
        }


        System.out.println("Folder Size: " + (size/1024/1024) + " Megabytes");

    }

}
