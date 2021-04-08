import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args)  {

        Company company = new Company();

        company.getIncome(12000215);


        company.hireAll("manager",80);
        company.hireAll("top_manager",10);
        company.hireAll("operator",180);



        company.getAll();
        System.out.println(company.y_count);

        System.out.println("---------------------");

//        company.fire("manager",2);
//       company.fire("top_manager",2);
//
//       company.fire("operator",20);


//       company.getAll();
//      System.out.println(company.y_count);


      company.getTopSalaryStaff(15);
        System.out.println("---------------------");
      company.getLowestSalaryStaff(30);

    }
}
