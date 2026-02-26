import java.util.*;
class Login {
    public static void main(String[] args) {
        String username="Testuser1";
        String password="Testuser@123";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username : " );
        String username1=sc.nextLine();
        System.out.println("Enter your password : " );
        String password1=sc.nextLine();
        if(username1.equals(username)&& password1.equals(password)){
        System.out.println("Your logged in" );
        }
        else{
        System.out.println("Enter valid Username & Password " );
        }
    }
}