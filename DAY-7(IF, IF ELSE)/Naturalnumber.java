import java.util.*;
public class Naturalnumber{
static int sumN(int n){
if(n==1){
return 1;
}
else{
return n+sumN(n-1);
}
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your input :");
int n=sc.nextInt();
if(n<=0){
System.out.println("Sum of number is :" +num);
}
else{
int sum=sumN(n);
System.out.println("sum =" +sum);
}