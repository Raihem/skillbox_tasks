package Client;

public abstract class Client {

    public double balance;
    public String name;





    public Client(double balance, String name){
        this.balance = balance;
        this.name = name;
    }






    public abstract void moneyAdd(double amount);

    public abstract void moneyWith(double amount);

    public double getBalance () {
        return balance;
    }

}
