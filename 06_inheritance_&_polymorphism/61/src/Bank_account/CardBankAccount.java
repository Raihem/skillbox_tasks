package Bank_account;

public class CardBankAccount extends BankAccount{




    public void setBalance(int balance) {
        this.balance = balance;
    }


    public CardBankAccount(int balance){

        this.balance = balance;
    }


    public void moneyAdd(int amount) {  balance = balance + amount;  }

    public void moneyWith(int amount)
    {
        balance = (int)(balance - (amount*1.01));
    }

    public int getBalance () {
        return balance;
    }

}



