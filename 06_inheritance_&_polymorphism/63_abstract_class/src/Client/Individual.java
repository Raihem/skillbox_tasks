package Client;

public class Individual extends Client{


    public Individual(double balance, String name) {
        super(balance, name);
    }

    @Override
    public void moneyAdd(double amount) { balance = balance + amount;

    }

    @Override
    public void moneyWith(double amount) { balance = balance - amount;

    }


}
