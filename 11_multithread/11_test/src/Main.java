public class Main {

// угадай число

    static int ran =  (int)(Math.random() * 100);
    static boolean is_ran = false;


    public static void main(String[] args) {
        System.out.println(ran+"\n");

        Thread guess = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    while (true ){
                        int i2 =  (int)(Math.random() * 100);
                        if(i2==ran){
                            is_ran=true;
                            System.out.println("number is: "+"-> "+i2+" <-");
                            System.out.println("threads stopped...");
                            break;
                        }
                        System.out.println(i2);

                        Thread.sleep(100);

                    }
                } catch (Exception e) {}
            }

        });
        guess.start();

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    int i = 0;
                    while (!is_ran ){

                        System.out.println("step:"+i);
                        i++;
                        Thread.sleep(101);
                    }
                } catch (Exception e) {}
            }

        });
        timer.start();
    }
}
