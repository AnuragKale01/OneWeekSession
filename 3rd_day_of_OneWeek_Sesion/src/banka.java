import CustomEx.InsufficientFundsException;
import CustomEx.NegativeDepositException;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount < 0) {
            throw new NegativeDepositException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
}
