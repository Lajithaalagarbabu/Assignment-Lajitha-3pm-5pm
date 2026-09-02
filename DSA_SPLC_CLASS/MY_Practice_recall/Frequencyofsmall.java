import java.util.*;
public class Frequencyofsmall{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a your input:");
        int num=sc.nextInt();
        int arr[]=new int[num];
       // int freq=0;
        
        int count=0;
         System.out.println("Enter a frequency values :");
        for (int i = 0; i < num; i++) {
             arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
           //System.out.println("Frequency of number is :"+freq);
        for (int i = 0; i < num; i++) {
        {
                if(arr[i]<smallest){
                   smallest=arr[i];
                }
            }
        }
       for (int i = 0; i < num; i++) {
           if(arr[i]== smallest){
            count ++;
           }
       }
          System.out.println("Smallest number is: " + smallest);
         System.out.println("Frequency of smallest number is :" +count);
    }
}