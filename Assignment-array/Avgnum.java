import java.util.*;
public class Avgnum{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter a user input:");

        for (int i = 0; i < 5; i++) {   
            num[i] = sc.nextInt();
        }
int sum=0;
for(int i=0;i<num.length;i++){
sum=sum+num[i];
}
double avg=(double) sum/num.length;
System.out.println("Sum of array elements :" +avg);
}
}