import java.util.*;
public class Grampro{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a input :");
String word=sc.nextLine();
char []arr=word.toCharArray();
for(int i=0;i<arr.length;i++){
for(int j=0;j<=i;j++)
{
System.out.print(arr[j]);

}
System.out.println();
}
}
}