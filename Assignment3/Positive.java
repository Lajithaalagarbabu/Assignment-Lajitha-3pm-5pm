import java.util.*;
public class Positive{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter number:");
int n = scan.nextInt();

if(n>0){
System.out.println("N is a positive number");
}
else if(n<0){
System.out.println("N is a negative number");
}
else{
System.out.println("N is zero");
}
}
}