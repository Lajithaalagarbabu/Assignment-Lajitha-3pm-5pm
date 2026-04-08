class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) {
        super(msg);
    }
}

class Bank {
    double balance = 1000;

    void withdraw(double amount) throws Exception {

        try {
            if (amount < 0) {
                throw new NegativeAmountException("Amount cannot be negative");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Not enough balance");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Balance: " + balance);

        } finally {
            System.out.println("Transaction logged"); // always runs
        }
    }
}

public class BankException {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.withdraw(1500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}