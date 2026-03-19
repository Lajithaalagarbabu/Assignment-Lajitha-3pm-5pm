import java.util.*;
public class SumodNnumb{
static int count(int num) {

    if (num == 0)
    return 0;

    return 1 + count(num/10); 
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
if (num == 0) {
System.out.println("Number of digits: 1");
} 
else {
if (num < 0)
num = -num; 
System.out.println("Number of digits: " + count(num));
}
}}