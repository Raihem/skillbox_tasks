import java.util.TreeMap;

public class Manager extends Company implements Employee {

    public int m_count;
    public int fix_sal = 25000;

    public TreeMap<Integer, Manager > mng = new TreeMap<>();


    void hire() {                                  //      найм одного сотрудника
        Manager manager = new Manager();
        mng.put(manager.getMonthSalary(),manager);

        m_count++;
    }


    void hireAll(int amount) {                      //	найм списка сотрудников
        for (int i = 0; i < amount; i++) {
            Manager manager = new Manager();
            mng.put(manager.getMonthSalary(),manager);

            m_count++;
        }
    }

    void fire(int amount) {
        m_count = m_count - amount;
    }


    @Override
    public int getMonthSalary() {

        return (int) (fix_sal + ((115000 + Math.random() * 10 * 25000)) * 0.05);
    }


    void get() {

        for (Integer key : mng.keySet()) {
            System.out.println(key + " руб => " + mng.get(key));
        }
    }


}

