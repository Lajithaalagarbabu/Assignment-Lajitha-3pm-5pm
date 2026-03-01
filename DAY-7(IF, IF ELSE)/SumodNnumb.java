import java.util.*;
public class SumodNnumb{
static int sum(int n){
if(n==0){
 return 0;
}
 return n+sum(n-1);
}

public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number:");
int n= scan.nextInt();
System.out.println("Sum of N numbers:"+ sum(n));
}
}