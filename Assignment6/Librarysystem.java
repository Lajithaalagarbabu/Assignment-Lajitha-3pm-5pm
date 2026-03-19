
public class Librarysystem  {
   
   int Member_ID;
   String Membership_Type;
   static int count=501;
  
Librarysystem(){
 Member_ID= count++;
 Membership_Type= "Regular";
}
public void display(){
   System.out.println("Member_ID is :" +Member_ID);
    System.out.println("Price is :" +Membership_Type);
  
}
    public static void main(String[] args) {
     Librarysystem ls=new Librarysystem();
     Librarysystem l=new Librarysystem();
     ls.display();
     l.display();
     
    
    }
}