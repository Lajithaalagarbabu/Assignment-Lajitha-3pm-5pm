import java.util.*;
public class SmallestArray{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter a user input:");

        for (int i = 0; i < 5; i++) {   
            num[i] = sc.nextInt();
        }
int Min=num[0];
for(int i=0;i<num.length;i++){
if(num[i]<Min){
Min=num[i];
}
}
System.out.println("Sum of array elements :" +Min);
}
}