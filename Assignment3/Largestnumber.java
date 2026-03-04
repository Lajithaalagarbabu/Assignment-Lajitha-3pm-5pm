import java.util.*;
public class Largestnumber{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your input1 :");
int a=sc.nextInt();
System.out.println("Enter your input2 :");
int b=sc.nextInt();
if(a>b){
System.out.println("Largest number is :" +a);
}
else if(b>a){
System.out.println("Largest number is :" +b);
}
else{
System.out.println("Both A and B are equal");
}
}
}




