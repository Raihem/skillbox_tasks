//import java.util.TreeMap;
//
//public class Operator extends Company implements Employee {
//
//
//    public int o_count;
//    public int fix_sal = (int)(30000+Math.random()*1000);
//
//
//    TreeMap<Integer, Operator> omng = new TreeMap<>();
//
//
//    void hire() {                                  //      найм одного сотрудника
//        Operator operator = new Operator();
//        omng.put(operator.getMonthSalary(),operator);
//        o_count++;
//    }
//
//
//    void hireAll(int amount) {                      //	найм списка сотрудников
//        for (int i = 0; i < amount; i++) {
//            Operator operator = new Operator();
//            omng.put(operator.getMonthSalary(),operator);
//            stf.put(operator.getMonthSalary(),operator);
//            o_count++;
//        }
//    }
//
//    void fire(int amount) {
//        o_count = o_count - amount;
//    }
//
//
//    @Override
//    public int getMonthSalary() {
//
//        return fix_sal;
//    }
//
//
//    void get() {
//
//        for (Integer key : omng.keySet()) {
//            System.out.println(key + " => " + omng.get(key));
//        }
//    }
//
//
//}