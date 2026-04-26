import java.util.*;
public class RemoveDuplicateUsers{
public static void main(String []args){
List<String> emails=Arrays.asList(
"asd@gmail.com",
"wed@gmail.com",
"mnb@gmail.com",
"asd@gmail.com"

);
Set<String>uniqueEmails=new HashSet<>(emails);

for(String email:uniqueEmails){
System.out.println(email);
}
}
}