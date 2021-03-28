import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> notes = new TreeMap<>() {{
            put("Иванов Иван Иванович", "295615251");
            put("Петров Петр Петрович", "295615252");
            put("Олегов Олег Олегович", "295615253");
        }};


        System.out.println("Welcome to Notebook!");
        System.out.println("You may: insert new info or LIST current");
        System.out.println("or EXIT for stop working");

        while (true) {

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();

            if (command.equals("LIST")) {

                for(String key: notes.keySet()) {
                    System.out.println(key + " => " + notes.get(key));
                }
            }

            else if (command.equals("EXIT")) {
                System.out.println("Notebook is stopped...");
                break;
            }


            else if (notes.containsKey(command)) {
                System.out.println("DATA is found");
                System.out.println( command + " " + notes.get(command) );
                continue;
            }
            else if (notes.containsValue(command)) {

                continue;
            }
            else if (!notes.containsKey(command)&&command.length()>10) {    //  нужна проверка на цифры
                System.out.println("O! it's new guy, insert number:");
                Scanner sc1 = new Scanner(System.in);
                notes.put(command, sc1.nextLine());
            }

            else if (!notes.containsValue(command)&&command.length()<10) {   // нужна проверка на буквы
                System.out.println("O! it's new number, insert FIO:");
                Scanner sc2 = new Scanner(System.in);
                notes.put(sc2.nextLine(), command);
            }

        }
    }

}



