import Client.Entity;
import Client.Individual;
import Client.Self_Employed;

public class Main {
    public static void main(String[] args) {

        Individual man1 = new Individual(100, "Иванов");   // физическое лицо

        man1.moneyAdd(20);
        man1.moneyWith(15);

        System.out.println(man1.name +" (individual) account balance: " +  man1.getBalance()+"\n");

        Entity man2 = new Entity(100,"OcOO \"Слоны и жирафы\"");  //  юридическое лицо

        man2.moneyAdd(20);
        man2.moneyWith(15);

        System.out.println(man2.name + " (entity) account balance: " + man2.getBalance()+"\n");

        Self_Employed man3 = new Self_Employed(100, "ИП Хитрожопин");  //  частный предприниматель

        man3.moneyAdd(100);

        man3.moneyWith(0);

        System.out.println(man3.name + " (self_Employed) account balance: " + man3.getBalance()+"\n");
    }
}
