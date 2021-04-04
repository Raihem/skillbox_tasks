import java.util.List;
import java.util.TreeMap;

public class Company {

     String emp_type;
     int salary;
    int InCome;



     public Company() {

     }

    TreeMap<Integer, Company> stf = new TreeMap<>();




    public List<Employee> getTopSalaryStaff(int count) {
        return null;
    }


    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }

    void hire() {

    }           //      найм одного сотрудника

    void hireAll() {
    }      //	найм списка сотрудников

    void fire() {
    }

          //   увольнение сотрудника

    void getIncome(int amount) {
        amount = InCome;
    }       // получение значения дохода компании – getIncome().


    void getAll() {

        for (Integer key : stf.keySet()) {
            System.out.println(key + " руб => " + stf.get(key));
        }
    }


}


