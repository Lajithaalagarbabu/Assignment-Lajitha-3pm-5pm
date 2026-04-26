import java.util.*;
public class CharFrequency{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String :");
String str=sc.nextLine();

Map<Character,Integer>map=new HashMap<>();

for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
map.put(ch,map.getOrDefault(ch,0)+1);
}
System.out.println("Charcter Frequencies :");
for(char key :map.keySet()){
System.out.println(key+ "=" +map.get(key));
}
}
}