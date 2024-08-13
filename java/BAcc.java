package dp;

class BankAccount {
    double balance;
    BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        balance -= amount;
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum Balance 300");
        }
    }
}
public class BAcc {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount(500);
        mySavings.displayBalance();

        mySavings.withdraw(200);  
        mySavings.displayBalance();

        mySavings.withdraw(250);  
        mySavings.displayBalance();
    }
}