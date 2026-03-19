import java.util.*;
interface Payment{
void processPayment(double amount);
}
class Creditcardpayment implements Payment{
public void processPayment(double amount){
System.out.println("Processing credit card payment Rs : " +amount);
}
}
class UPIpayment implements Payment{
public void processPayment(double amount){
System.out.println("Processing UPI payment Rs : " +amount);
}
}

class Paypalpayment implements Payment{
public void processPayment(double amount){
System.out.println("Processing Paypal payment Rs : " +amount);
}
}

public class  ECommerceWebsite {
public static void main(String []args){

Payment p1=new Creditcardpayment();
Payment p2=new UPIpayment();
Payment p3=new Paypalpayment();
 
p1.processPayment(2500);
p2.processPayment(1542);
p3.processPayment(6325);

}
}