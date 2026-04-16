import java.util.*;
public class Removelist{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
ArrayList<Integer>list=new ArrayList<>();

System.out.print("Enter a size :");
int n=sc.nextInt();

System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

System.out.println("Enter a element to remove :" );
int element=sc.nextInt();

for (int i = 0; i < list.size(); i++) {
    if (list.get(i) == element) {
        list.remove(i);
        i--;
    }
}

System.out.println("Updated List :" +list);

}
}