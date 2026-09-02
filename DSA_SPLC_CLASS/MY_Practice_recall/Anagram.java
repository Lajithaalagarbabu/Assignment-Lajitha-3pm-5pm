import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your input:");
         String input1 =sc.nextLine();
         System.out.println("Enter your input:");
         String input2 =sc.nextLine();
        // char ch1=input1.charAt();
        for (int i = 1; i <= input1.length(); i++) {
            for(int j=i;j<=input2.length();j++){
                    if(input1.charAt(i)==input2.charAt(j)){
                        System.out.println("");
                    }
            }
            
        } 

    }
}