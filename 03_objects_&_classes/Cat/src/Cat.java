


public class Cat
{
    private double originWeight;
    private double weight;
    private double weight2;

    private double minWeight;
    private double maxWeight;
    public static int count;

    private static String color;

    public final static int EYECOUNT = 2;
    public final static int MINWEIGT = 990;
    public final static int MAXWEIGT = 9990;



    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public  Cat(double weight2)
    {
       this();
        this.weight2 = weight2;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public  String getColor()
    {
        return color;
    }

//    public Cat clone() throws CloneNotSupportedException{
//
//        return (Cat) super.clone();
//    }


    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void kaki()
    {
        weight = weight - 25;
        System.out.println("kaki puki");
    }



    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }



    public Double getWeight()
    {
        return weight;
    }
    public Double nyam()
    {
        return weight-originWeight;
    }


    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";

        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
    public static int getCount(){
        return count;
    }
}