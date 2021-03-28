import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < 1000000; i++) {
            int randomNum = (int) (1000000 + 1000000 * Math.random());
            String Num = Integer.toString(randomNum);
            list.add(Num);
        }

        Collections.sort(list);

        HashSet<String> hs = new HashSet<>();
        hs.addAll(list);

        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(list);




        System.out.println("Welcome to Search by digits from 1 million to 2 million");
        System.out.println("Example: 1 1234573 ");
        System.out.println("Your commands: 1 - перебор; 2-treeset; 3-hashset");
        System.out.println("and EXIT for stop working");

        while (true) {

            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            String[] com = command.split(" ", 2);
            long start = System.currentTimeMillis();

            if (com[0].equals("1")) {
                if (list.contains(com[1])) {
                    long duration = System.currentTimeMillis() - start;
                    System.out.println("Yes, found. Time:" + duration);
                }
                if (!list.contains(com[1])) {
                    long duration = System.currentTimeMillis() - start;
                    System.out.println("Not found. Time:" + duration);
                }

            }

//            else if (com[0].equals("2")) {
//                if (Collections.binarySearch()) {
//                    long duration = System.currentTimeMillis() - start;
//                    System.out.println("Yes, found. Time:" + duration);
//                }
//                if (!hs.contains(com[1])) {
//                    long duration = System.currentTimeMillis() - start;
//                    System.out.println("Not found. Time:" + duration);
//                }
//
//            }

            else if (com[0].equals("2")) {
                if (hs.contains(com[1])) {
                    long duration = System.currentTimeMillis() - start;
                    System.out.println("Yes, found. Time:" + duration);
                }
                if (!hs.contains(com[1])) {
                    long duration = System.currentTimeMillis() - start;
                    System.out.println("Not found. Time:" + duration);
                }

            }
            else if (com[0].equals("3")) {
                if (ts.contains(com[1])) {
                    long duration = System.currentTimeMillis() - start;
                    System.out.println("Yes, found. Time:" + duration);
                }
                if (!ts.contains(com[1])) {
                    long duration = System.currentTimeMillis() - start;
                    System.out.println("Not found. Time:" + duration);
                }

            }

            else if (com[0].equals("EXIT")) {
                System.out.println("Search is stopped...");
                break;

            }
        }
    }
    }

