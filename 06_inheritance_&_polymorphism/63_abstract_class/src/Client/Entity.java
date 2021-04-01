package Client;

public class Entity extends Client{

    public Entity(double balance, String name) {
        super(balance,name);
    }

    @Override
    public void moneyAdd(double amount) { balance = balance + amount;

    }

    @Override
    public void moneyWith(double amount) { balance = balance - amount*1.01;

    }


}