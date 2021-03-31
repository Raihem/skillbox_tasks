import Bank_account.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(200);

        System.out.println("Account balance: " + bankAccount.addM(50));
        System.out.println(bankAccount.getBalance());

    }
}