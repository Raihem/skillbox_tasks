package Bank_account;

public class CardBankAccount extends BankAccount{



    public CardBankAccount(int balance){

        this.balance = balance;
    }




    public void moneyWith(int amount)
    {
        balance = (int)(balance - (amount*1.01));
    }



}



