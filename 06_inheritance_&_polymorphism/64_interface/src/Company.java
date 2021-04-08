import java.util.*;

public class Company implements Employee{

    int m_salary = 37000;
    int tm_salary = 75000;
    int op_salary = 45000;

    int InCome;
    int y_count;


    public int getIncome(int amount) {                           // получение значения дохода компании – getIncome().
        return InCome = InCome + amount  ;

    }

    public Company() {


    }

    TreeMap<String, Integer> stf = new TreeMap<>();
    List<Integer> myStf = new ArrayList<Integer>();

    void hire(String emp_type) {                                  //      найм одного сотрудника

        if(emp_type.equals("manager")) {
            stf.put(emp_type, m_getMonthSalary());
            myStf.add(m_getMonthSalary());
        } else if(emp_type.equals("top_manager")) {
            stf.put(emp_type, tm_getMonthSalary());
            myStf.add(tm_getMonthSalary());
        } else if(emp_type.equals("operator")) {
            stf.put(emp_type, op_getMonthSalary());
            myStf.add(op_getMonthSalary());
        } else {
            System.out.println("Unknown type of employee");
        }


    }


    void hireAll(String emp_type, int amount) {                      //	найм списка сотрудников
        for (int i = 1; i <= amount; i++) {

            if(emp_type.equals("manager")) {
                stf.put(emp_type + i, m_getMonthSalary());
                myStf.add(m_getMonthSalary());
            } else if(emp_type.equals("top_manager")) {
                stf.put(emp_type + i, tm_getMonthSalary());
                myStf.add(tm_getMonthSalary());
            } else if(emp_type.equals("operator")) {
                stf.put(emp_type + i, op_getMonthSalary());
                myStf.add(op_getMonthSalary());
            } else {
                System.out.println("Unknown type of employee");
            }
            y_count++;
        }
    }



    void fire(String emp_type, int amount) {                      //	найм списка сотрудников
        for (int i = 1; i <= amount; i++) {

            if(emp_type.equals("manager")) {
                stf.remove(emp_type + i );

            } else if(emp_type.equals("top_manager")) {
                stf.remove(emp_type + i );

            } else if(emp_type.equals("operator")) {
                stf.remove(emp_type + i );

            } else {
                System.out.println("Unknown type of employee");
            }
            y_count--;
        }
    }  //   увольнение сотрудника

    int get_y_count(){
        return y_count;
    }


    void getAll() {

        for (String key : stf.keySet()) {
            System.out.println(key  + " " + stf.get(key) + " руб ");
        }
        }



    List<Employee> getTopSalaryStaff(int count) {
        System.out.println("Топ " + count + " максимальных зарплат: ");
        for (int i = 0; i < count; i++) {
            int maxVal = Collections.max(myStf);
            int maxIdx = myStf.indexOf(maxVal);
            System.out.println(maxVal + " руб");
              myStf.remove(maxIdx);
        } return null;

    }


    	List<Employee> getLowestSalaryStaff(int count) {
        System.out.println("Топ " + count + " минимальных зарплат: ");
        for (int i = 0; i < count; i++) {
                int minVal = Collections.min(myStf);
                int maxIdx = myStf.indexOf(minVal);
                System.out.println(minVal + " руб");
                myStf.remove(maxIdx);
            }
        return null;
    }



    @Override
    public int m_getMonthSalary() {

           return  (int) (m_salary + ((115000 + Math.random() * 10 * 25000)) * 0.05);
        }



    @Override
    public int tm_getMonthSalary()  {
        if(InCome > 10000000) {return (int) (tm_salary+tm_salary*1.5);}
        else{
        return  tm_salary;}
    }


    @Override
    public int op_getMonthSalary() {
        return op_salary;
    }
    }




