import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution3 {

    public static void main(String[] args) throws Exception {

        System.out.println("Please enter date for convert");
        System.out.println("Example: 2020-12-30");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Date = reader.readLine();



        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(Date);
            System.out.println("\n"+"New Format: "+formatter2.format(date).toUpperCase());
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}