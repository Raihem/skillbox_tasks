import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
