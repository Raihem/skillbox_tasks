import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Main {
    public static void main(String[] args) {


        Path source_path = Paths.get("C:/javagit/folder");
        Path destination_path = Paths.get("C:/javagit/folder2");


            try {
                Files.walk(source_path)
                        .forEach(source -> copy(source, destination_path.resolve(source_path.relativize(source))));
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

        static void copy(Path source, Path dest) {
            try {
                Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }

    }

