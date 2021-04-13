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
            FileInputStream is = new FileInputStream("lib/foo_dr.txt");
            for(;;){
               int code = is.read();
               if(code < 0){break;}
               char ch = (char) code;
                builder.append(ch);
            }
        } catch (Exception ex) {ex.printStackTrace();}

        System.out.println(builder.toString());
    }
}
