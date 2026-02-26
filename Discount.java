import java.util.*;

public class Discount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first item price: ");
        int f = sc.nextInt();

        System.out.print("Enter your second item price: ");
        int s = sc.nextInt();

        int total = f + s;
        System.out.println("Total price is: " + total);

        if (total >= 5000) {
            int discount = total * 75 / 100;   // 75% discount
            int finalAmount = total - discount;

            System.out.println("Discount amount (75%): " + discount);
            System.out.println("Final amount to pay: " + finalAmount);
        } 
        else {
            System.out.println("No discount for your items");
        }

        sc.close();
    }
}