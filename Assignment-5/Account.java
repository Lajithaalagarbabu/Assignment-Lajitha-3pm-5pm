
import java.util.*;
class Account {
    int accountNumber;
    String accountHolderName;
    int balance;
    void deposit( int amount){
         balance=amount+balance;
        System.out.println("Your deposit amount is:" +amount);
    }
    void withdraw(int amount){
        if(amount<=balance){
         amount=balance-amount;
          System.out.println("Withdrawal amount: " + amount);
        }
          else {
            System.out.println("Insufficient balance!");
        }
}

    void displayBalance(){
         System.out.println("Current Balance: " + balance);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Account c1=new Account();
        c1.accountNumber = 101;
        c1.accountHolderName = "Lajitha";
        c1.balance = 5000;
        
        Account c2=new Account();
        c2.accountNumber = 102;
        c2.accountHolderName = "Akshi";
        c2.balance = 5200;
        
        c1.deposit(1000);
        c1.withdraw(2000);
        c1.displayBalance();

        c2.deposit(500);
        c2.withdraw(6000);
        c2.displayBalance();
        
    
    }
    }
