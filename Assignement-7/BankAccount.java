import java.util.*;

class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int ac_no, String ac_name, double b) {
        accountNumber = ac_no;
        accountHolderName = ac_name;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Amount: " + amount);
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(101, "Lajitha", 5000);

        ba.deposit(1000);

        ba.displayBalance();
    }
}