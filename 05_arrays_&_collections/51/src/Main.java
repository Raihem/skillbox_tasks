
//массив в обратном порядке
//температура пациентов
//массив масивов Х

public class Main {



    public static void main(String[] args) {


        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");


        String result = "";
        for (String i : colors) {
            result = i + "\r\n" + result;
        }

        System.out.println(result);

        Main main = new Main();
        main.go();
        main.go2();

    }



        void go() {
            float[] patient = new float[10];
            int j = 0;
            float k = 0;
            System.out.print("Температуры пациентов: ");
            for (int i = 0; i < patient.length; i++) {
                float value = (float) (32 + (Math.random() * 8));
                patient[i] = value;
                System.out.print(value+"; ");
                k += value;
                if(value>35.5&&value<37.2){
                    j++;
                }
            }

            System.out.println("" );
            System.out.println("Средняя температура по больнице: " + (k/patient.length));
            System.out.println("Количество здоровых пациентов: " + j  );
            System.out.println("" );

        }

    void go2() {
        String[][] words = new String[11][11];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == 0 || i == words.length - 1 || j == 0 || j == words.length - 1) {
                    System.out.print("*");
                } else if (i == j || j == words.length - 1 - i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

            }

        }






