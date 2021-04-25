import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("data/movementList.csv");
        String mFile = "data/movementList.csv";
        String dateFormat = "dd.MM.yyyy";


        ArrayList<Motions> staff = new ArrayList<>();

        ArrayList<String> income1 = new ArrayList<>();
        ArrayList<String> expense1 = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(mFile));
            for (String line : lines)
            if(line.contains("/"))
            {
                income1.add(line);
              //  System.out.println(line);
                } else if (line.contains("\\")) {
                expense1.add(line);
                System.out.println(line);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


//                String[] fragments = i.split("\t");
//                staff.add(new Motions(
//                 fragments[0],
////               Integer.parseInt(fragments[1]),
//                  fragments[1],
////                  (new SimpleDateFormat(dateFormat)).parse(fragments[2])
//                     fragments[2],fragments[3],fragments[4],fragments[5],fragments[6],fragments[7]));