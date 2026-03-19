import java.util.*;
public class Storearray{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int[] num=new int[5];
System.out.println("Enter a user input:");


for(int i=0;i<5;i++){
num[i]=sc.nextInt();
}

for(int i=0;i<5;i++){
System.out.println("Your array number is : "+num[i]);

}
}
}