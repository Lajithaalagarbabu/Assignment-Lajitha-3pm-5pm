import java.util.*;

public class InputValue
{
public static void main(String args[])
{
int value;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a value");
int input = scan.nextInt();

if(input>=0){
value = input;
}
 return value;
}
}