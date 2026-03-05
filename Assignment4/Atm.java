import java.util.*;
public class Atm{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);

int initial_balance = 10000;
Boolean withdraw=true;
int balance;

while(withdraw){
      System.out.println("enter amount:");
      int amount = scan.nextInt();

if(amount==0){
    withdraw=false;
}

if(amount> initial_balance){
System.out.println("Insufficient Balance");
}
else if(amount<=0){
System.out.println("Invalid amount");
}
else{
balance = initial_balance - amount;
System.out.println("Current balance = " +balance);
}
}
}
}