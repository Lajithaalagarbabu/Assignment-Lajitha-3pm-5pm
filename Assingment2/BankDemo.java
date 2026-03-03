class BankAccount {
    double balance;
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        customer1.balance = 10000;
        customer1.withdraw(2000);
    }
}