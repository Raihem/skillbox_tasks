import java.util.Arrays;
import java.util.Collections;
//массив в обратном порядке

public class Main {
    public static void main(String[] args) {

        String text = "Каждый охотник желает знать, где сидит фазан";

        String[]colors = text.split(",?\\s+");


        String result = "";
        for (String i : colors) {
            result = i +  "\r\n" + result;
        }

        System.out.println(result);
    }
}
