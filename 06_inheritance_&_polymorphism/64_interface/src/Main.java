import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)  {

        Company company = new Company();

        company.hire("manager");
        company.salary(15000);

        company.hireAll("manager",5);

        company.getIncome(12000215);

//    Manager manager = new Manager();
//    TopManager topmanager = new TopManager();
//
//
//    manager.hireAll(80);
//
//    topmanager.hireAll(10);
//
//
//
//        System.out.println(manager.m_count);
//        manager.get();
//        System.out.println(topmanager.tm_count);
//        topmanager.get();


        System.out.println("----------");

        company.getAll();

    }
}
