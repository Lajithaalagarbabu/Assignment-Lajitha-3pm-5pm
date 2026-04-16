import java.util.*;
public class Secondlargest{
public static void main(String []args){
ArrayList<Integer>list= new ArrayList<>();
list.add(10);
list.add(20);
list.add(5);
list.add(30);
list.add(25);
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int num : list) {
if (num > largest) {
secondLargest = largest;
 largest = num;
} 
else if (num > secondLargest && num != largest) {
 secondLargest = num;
 }
}
System.out.println("Second Largest:" +secondLargest);
}
}