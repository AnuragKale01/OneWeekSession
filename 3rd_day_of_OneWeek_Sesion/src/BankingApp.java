import CustomEx.InsufficientFundsException;
import CustomEx.NegativeDepositException;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);

        try {
            // Deposit money
            account.deposit(500);
            System.out.println("New Balance: " + account.getBalance());

            // Attempt to deposit a negative amount
            account.deposit(-100);
        } catch (NegativeDepositException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Withdraw money
            account.withdraw(300);
            System.out.println("New Balance: " + account.getBalance());

            // Attempt to withdraw more than the available balance
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

