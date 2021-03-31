package Bank_account;

public class BankAccount {

    public int balance;


    public void setBalance(int balance) {
        this.balance = balance;
    }


    public BankAccount(int balance){
        this.balance = balance;
    }


    public void moneyAdd(int amount) {  balance = balance + amount;  }

    public void moneyWith(int amount)
    {
        balance = balance - amount;
    }

        public int getBalance () {
        return balance;
    }

}
