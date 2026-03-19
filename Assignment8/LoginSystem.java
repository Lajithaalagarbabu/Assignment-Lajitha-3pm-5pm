// import java.util.*;
// public class LoginSystem1
// {
    
//     void login (String username,String password){
//              System.out.println("USER NAME :" +username);
//              System.out.println("PASSWORD :" +password);
//     }
    
//     void login (String email,String password){
//         System.out.println("EMAIL :" +email);
//              System.out.println("PASSWORD :" +password);
//     }
    
    
//     void login(long mobileno,int  otp){
//         System.out.println("MOBILE NUMBER  :" +mobileno);
//              System.out.println("OTP :" +otp);
//     }
    
    
// }
// public class LoginSystem{
//     public static void main(String []args){
//     LoginSystem ls = new LoginSystem();
// ls.login("Aqulin","aqulin@abc");
// ls.login(aqulinjebha20@gmail.com, 123450);
// ls.login(86653212, 7707);

//     }
// }

class LoginSystem1 {

    void login(String username,String password){
        System.out.println("USER NAME : " + username);
        System.out.println("PASSWORD : " + password);
    }

    void login(long mobileno,int otp){
        System.out.println("MOBILE NUMBER : " + mobileno);
        System.out.println("OTP : " + otp);
    }
}

public class LoginSystem {

    public static void main(String[] args){

        LoginSystem1 ls = new LoginSystem1();

        ls.login("Lajitha","lajitha@13");
        ls.login(9874563210l,7707);

    }
}