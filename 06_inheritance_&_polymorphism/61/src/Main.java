import Bank_account.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(200);


        bankAccount.moneyAdd(20);
        bankAccount.moneyWith(15);
        bankAccount.moneyWith(15);
        bankAccount.moneyWith(15);

        System.out.println("Account balance: " + bankAccount.getBalance());

    }
}