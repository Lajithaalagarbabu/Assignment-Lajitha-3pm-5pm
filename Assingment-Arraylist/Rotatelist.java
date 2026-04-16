import java.util.*;
public class Rotatelist{
public static void main(String []args){
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);

int k=2;

Collections.rotate(list,k);
System.out.println(list);
}
}