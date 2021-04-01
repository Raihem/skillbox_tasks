package Client;

public class Self_Employed extends Client{

    public Self_Employed(double balance, String name) {
        super(balance,name);
    }

    @Override
    public void moneyAdd(double amount) {
        if(amount<1000) {
            balance = balance + amount*0.99;
        } else if (amount>=1000) {
            balance = balance + amount*0.995;
        }
    }

    @Override
    public void moneyWith(double amount) {

        balance = balance - amount;

    }


}
