import java.util.*;
class Stock {
    public static void main(String[] args) {
        String item1="Pen";
        String item2="pencil";
        String item3="Eraser";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your item : ");
        String total=sc.nextLine();
        if(item1.equals(total) || item2.equals(total)|| item3.equals(total)) {
        System.out.println("Item is There!");
    }
    else{
        System.out.println("Item is not There!");
    }
    }
}