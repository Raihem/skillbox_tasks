package Bank_account;

public class BankAccount {

    public int balance;
    public int addMon;
    public int withdraw;

    public BankAccount(int balance){
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    public int addM(int addMon) {
        return balance + addMon;
    }

    public int withD() {
        return balance - withdraw;
    }


}
