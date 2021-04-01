package Bank_account;

public class BankAccount {

    protected int balance;

    public BankAccount() {
    }


    public BankAccount(int balance){
        this.balance = balance;
    }


    public void moneyAdd(int amount) {  balance = balance + amount;  }

    public void moneyWith(int amount)   {  balance = balance - amount;  }

        public int getBalance () {
        return balance;
    }

}
