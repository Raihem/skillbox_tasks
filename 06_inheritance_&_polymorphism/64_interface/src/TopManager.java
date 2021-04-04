import java.util.TreeMap;

public class TopManager  implements Employee {

    public int tm_count;
    public int tfix_sal = (int)(75000+Math.random()*1000);


    TreeMap<Integer, TopManager> tmng = new TreeMap<>();


    void hire() {                                  //      найм одного сотрудника
        TopManager topmanager = new TopManager();
        tmng.put(topmanager.getMonthSalary(),topmanager);
        tm_count++;
    }


    void hireAll(int amount) {                      //	найм списка сотрудников
        for (int i = 0; i < amount; i++) {
            TopManager topmanager = new TopManager();
            tmng.put(topmanager.getMonthSalary(),topmanager);
//            stf.put(topmanager.getMonthSalary(),topmanager);
            tm_count++;
        }
    }

    void fire(int amount) {
        tm_count = tm_count - amount;
    }


    @Override
    public int getMonthSalary() {
        if(2<10000) {return (int) (tfix_sal+tfix_sal*1.5);}
        else{
        return  tfix_sal;}
    }


    void get() {

        for (Integer key : tmng.keySet()) {
            System.out.println(key + " => " + tmng.get(key));
        }
    }


}