import java.util.*;
public class Largestnumber3{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your input1 :");
int a=sc.nextInt();
System.out.println("Enter your input2 :");
int b=sc.nextInt();
System.out.println("Enter your input3 :");
int c=sc.nextInt();

if(a>b  && a>c){
System.out.println("Largest number is :" +a);
}
else if(b>a  && b>c){
System.out.println("Largest number is :" +b);
}
else if( c>a && c>b){
System.out.println("Largest number is :" +c);
}
else{
System.out.println("A , B and C are equal");
}
}
}