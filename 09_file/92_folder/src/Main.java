import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


        File folder = new File("E:/online/[Skillbox] Java-разработчик (2020)");
        File[] files = folder.listFiles();





        Path path = Paths.get("E:/online/[Skillbox] Java-разработчик (2020)");
        long size = 0;


        try (Stream<Path> walk = Files.walk(path)) {
            size = walk
                    .filter(Files::isRegularFile)
                    .mapToLong(p -> {
                        try {


                            return Files.size(p);

                        } catch (IOException e) {
                            System.out.printf("Невозможно получить размер файла %s%n%s", p, e);
                            return 0L;
                        }
                    })
                    .sum();
        } catch (IOException e) {
            System.out.printf("Ошибка при подсчёте размера директории %s", e);
        }
        System.out.println(size + " bytes");
        int size1 = (int) (size/1024/1024);
        System.out.println(size1 + " MegaBytes");


        for(File file: files){
            System.out.println(file);


        }


    }
}