import Bank_account.BankAccount;
import Bank_account.CardBankAccount;
import Bank_account.DepoBankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(200);

        bankAccount.moneyAdd(20);
        bankAccount.moneyWith(15);
        bankAccount.moneyWith(15);

        System.out.println("Account balance: " + bankAccount.getBalance()+"\n");

        /////

        CardBankAccount cardbankAccount = new CardBankAccount(1500);

        cardbankAccount.moneyAdd(200);
        cardbankAccount.moneyWith(150);
        cardbankAccount.moneyWith(150);

        System.out.println("Card Account balance: " + cardbankAccount.getBalance()+ "\n");

        /////

        DepoBankAccount depobankAccount = new DepoBankAccount(1500);

        depobankAccount.moneyAdd(200);
        depobankAccount.moneyWith(150);
        System.out.println("Deposit Account balance: " + depobankAccount.getBalance());
        depobankAccount.moneyWith(150);

        System.out.println("Deposit Account balance: " + depobankAccount.getBalance());
    }
}