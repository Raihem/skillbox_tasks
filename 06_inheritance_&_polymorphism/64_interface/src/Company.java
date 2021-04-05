import java.util.List;
import java.util.TreeMap;

public class Company implements Employee{

    String emp_type;
    int salary = 15000;
    int InCome;

    int m_count;
    int tm_count;
    int o_count;

    void getIncome(int amount) {
        amount = InCome;
    }

    public Company() {


     }

    TreeMap<String, Integer> stf = new TreeMap<>();

    void hire(String emp_type) {                                  //      найм одного сотрудника
        Company company = new Company();
        if(emp_type.equals("manager")) {
             stf.put(emp_type,  company.getMonthSalary());

        }


    }



    void hireAll(String emp_type, int amount) {                      //	найм списка сотрудников
        for (int i = 0; i < amount; i++) {
            Company company = new Company();
            stf.put(emp_type+i,  company.getMonthSalary());

            m_count++;
        }
    }



          //   увольнение сотрудника

          // получение значения дохода компании – getIncome().


    void getAll() {

        for (String key : stf.keySet()) {
            System.out.println(key  + " " + stf.get(key) + " руб ");
        }



    }
    public List<Employee> getTopSalaryStaff(int count) {
        return null;
    }


    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }

    public void salary(int amount)
    {
        salary = salary + amount;
    }

    @Override
    public int getMonthSalary() {
        if(salary==15000) {
           return  (int) (salary + ((115000 + Math.random() * 10 * 25000)) * 0.05);
        } else
        return (int) (salary + ((1150000000 + Math.random() * 10 * 25000)) * 0.05);
    }
}


