import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        company.getIncome(12000215);

    Manager manager = new Manager();
    TopManager topmanager = new TopManager();
    Operator operator = new Operator();

    manager.hireAll(80);

    topmanager.hireAll(10);

    operator.hireAll(180);

        System.out.println(manager.m_count);
        manager.get();
        System.out.println(topmanager.tm_count);
        topmanager.get();
        System.out.println(operator.o_count);
        operator.get();

        System.out.println("----------");

    }
}
