import java.util.*;

public class ArmstrongNumber {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number:");
int num = scan.nextInt();
int original = num;
int count = 0;
int sum = 0;

int temp = num;
while(temp != 0){
temp= temp/10;
count++;
}

temp = num;

while(temp !=0){
int digit = temp%10;
int power = 1;
for(int i = 0; i<count; i++){
power = power * digit;
}

sum = sum+ power;
temp = temp/10;

}

if(sum == original){
System.out.println("Armstrong number");
} 
else{
System.out.println("Not a Armstrong number");
}
}
}