import java.util.*;

public class Librarysystem  {
   
   int Member_ID;
   String Membership_Type;
  
Librarysystem(){
 Member_ID=501;
 Membership_Type= "Regular";
}
public void display(){
   System.out.println("Member_ID is :" +Member_ID);
    System.out.println("Price is :" +Membership_Type);
  
}
    public static void main(String[] args) {
     Librarysystem ls=new Librarysystem();
     ls.display();
     
    }
}