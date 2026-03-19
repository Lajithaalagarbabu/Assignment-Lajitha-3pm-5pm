class BankAccount {
    
    double balance;
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.balance = 10000;
        acc.withdraw(2500);
    }
}