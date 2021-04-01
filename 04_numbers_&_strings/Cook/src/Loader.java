
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 500; // g
        int eggsCount = 5; // items
        int sugarAmount = 15; // g
        int oilAmount = 30; // ml
        int appleCount = 1;
        boolean apple;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes possible");
        }
        //milk - 300 ml, powder - 5 g, eggs - 5
        if(powderAmount >= 5 &&  milkAmount >= 300 && eggsCount >= 5) {
            System.out.println("Omelette possible");
        }
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

            System.out.println(appleCount >= 3 &&  milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 ? "Apple pie possible" : "Apple pie not possible ");

    }
}