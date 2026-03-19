
import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a your score:");
        int grade=sc.nextInt();
        if(grade>=90){
            System.out.println(" Your grade is A");
        }
        else if(grade>=70){
            System.out.println(" Your grade is B");
        }
        else if(grade>=50){
            System.out.println("Your grade is c");
        }
        else {
            System.out.println("Your grade is Fail");
        }
    }
}