public class Main {

// угадай число

    static int ran =  (int)(Math.random() * 100);
    static boolean isran = false;


    static boolean isFive = false;
    public static void main(String[] args) {
        System.out.println(ran+"\n");

        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    while (true ){
                        int i2 =  (int)(Math.random() * 100);
                        if(i2==ran){
                            isran=true;
                            System.out.println("-> "+i2+" <-");
                            break;
                        }
                        System.out.println(i2);

                        Thread.sleep(101);

                    }
                } catch (Exception e) {}
            }

        });
        timer2.start();

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    int i = 0;
                    while (!isran ){

                        System.out.println(i);
                        i++;
                        Thread.sleep(99);
                    }
                } catch (Exception e) {}
            }

        });
        timer.start();
    }
}
