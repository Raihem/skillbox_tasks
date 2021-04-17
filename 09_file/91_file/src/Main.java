import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();


        try{
            List<String> lines = Files.readAllLines(Paths.get("lib/foo_dr.txt"));
            lines.forEach(line -> builder.append(line + "\n"));

        } catch (Exception ex) {ex.printStackTrace();}

        System.out.println(builder.toString());
    }
}
