import java.util.*;
public class MissingNumber{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a integer of N:");
int N=sc.nextInt();
System.out.println("Enter a Size of Array:");
int size =sc.nextInt();
int arr[]= new int[size];

System.out.println("Enter a element: ");
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
Set<Integer> set=new HashSet<>();
for(int num:arr){
set.add(num);
}
System.out.println("Missing number :");
for(int i=1;i<=N;i++){
if(!set.contains(i)){
System.out.print(i+ "");
}
}
}
}