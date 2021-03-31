
public class Loader {
    public static void main(String[] args) {
        Loader load = new Loader();
        load.go();


        Cat Murka = new Cat();
        Murka.setColor("grey");
        Cat Vasya = new Cat();



        Murka.drink(51.55);
        Murka.feed(141.51);



        System.out.println("Поела: " + Murka.nyam());
        System.out.println(Murka.getStatus() + " " + Murka.getWeight());

        Murka.kaki();
        System.out.println(Murka.getStatus() + " " + Murka.getWeight());
        System.out.println(Cat.count);

        Cat asya = new Cat(21.51);
        System.out.println(asya.getStatus()+asya.getWeight());


//        try {
//            asya.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }



        Vasya.meow();
        System.out.println(Vasya.getStatus() + " " + Vasya.getWeight());
        System.out.println(Cat.count);
        Murka.feed(1041.51);
        System.out.println(Murka.getStatus());
        System.out.println(Cat.count);

        Cat Myau = new Cat();
        System.out.println(Cat.count);
        System.out.println(Cat.getCount());




    }

    void go() {  Cat cat = new Cat();   }


    }





