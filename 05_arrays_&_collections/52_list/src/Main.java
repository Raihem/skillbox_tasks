import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cases = new ArrayList<>() {{
            add(0, "First case");
            add(1, "Second case");
        }};

        System.out.println("Welcome to CaseRedactor!");
        System.out.println("Your commands: LIST, ADD, EDIT, DELETE");
        System.out.println("and EXIT for stop working");

        while (true) {

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            String[] com = command.split(" ", 2);

            if (com[0].equals("ADD")) {
                cases.add(com[1]);

            }

            else if (com[0].equals("LIST")) {

                int currentPosition = -1;
                for (String item : cases) {
                    currentPosition++;
                    System.out.println(currentPosition + " - " + item);
                }

            } else if (com[0].equals("DELETE")) {
               int e = Integer.parseInt(com[1]); // нужна отсечка после 1-го элемента для корректной работы
                cases.remove(e);
            }
            else if (com[0].equals("EDIT")) {

                int e = Integer.parseInt(com[1]);

                cases.remove(e);
                System.out.println("Enter new case");
                Scanner sc1 = new Scanner(System.in);

                cases.add(e,sc1.nextLine());

            }
            else if (com[0].equals("EXIT")) {
                System.out.println("CaseRedactor is stopped...");
                break;

            }


        }

    }
}



