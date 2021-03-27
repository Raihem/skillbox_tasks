import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> mails = new TreeSet<>() {{
            add("example@mail.ru");
            add("zample@yandex.ru");
            add("sample@gmail.com");
        }};


        System.out.println("Welcome to MailChecker!");
        System.out.println("Your commands: LIST & ADD");
        System.out.println("and EXIT for stop working");

        while (true) {

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            String[] com = command.split(" ", 2);

            if (com[0].equals("ADD")) {
                if(com[1].contains("@")&&com[1].contains(".")) {    //доп проверка (задание со звездочкой)


                    mails.add(com[1]);
                }
                else System.out.println("mail not correct");
            }

            else if (com[0].equals("LIST")) {

                for (String item : mails) {

                    System.out.println(item);
                }
            }

            else if (com[0].equals("EXIT")) {
                System.out.println("MailChecker is stopped...");
                break;

            }
        }
    }
}