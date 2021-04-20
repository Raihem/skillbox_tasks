import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File file = new File("data.movementList.csv");
        String mFile = "data.movementList.csv";
        String dateFormat = "dd.MM.yyyy";


        ArrayList<Motions> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(mFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
//                if (fragments.length != 3) {
//                    System.out.println("Wrong line: " + line);
//                    continue;
//                }
                staff.add(new Motions(
                        fragments[0],
//                        Integer.parseInt(fragments[1]),
                        fragments[1],

//                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                        fragments[2]));
            }
        } catch (Exception ex) {
            ex.printStackTrace();

            for (Motions motion : staff) {
                System.out.println(motion);
            }
        }
    }
}