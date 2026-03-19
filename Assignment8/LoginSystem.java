

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