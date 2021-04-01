package Bank_account;

public class DepoBankAccount extends BankAccount{


    long start = System.currentTimeMillis()*1000;

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public DepoBankAccount(int balance){

        this.balance = balance;
    }


    public void moneyAdd(int amount) {  balance = balance + amount;  }

    public void moneyWith(int amount)  {
        long duration = System.currentTimeMillis()*1000 - start;
        if (duration < 5 || duration > 2592000)
        {
            try {
                balance = balance - amount;
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println((char) 27 + "[31mWarning! Next withdrawal possible after month! " + (char)27 + "[0m");
        }
    }

    public int getBalance () {
        return balance;
    }

}