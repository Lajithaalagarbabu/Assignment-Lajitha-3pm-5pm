import java.util.*;

class LoginAuthenticationSystem {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Login l = new Login("Lajitha","lajitha@gmail.com","lajitha@13",86653212);

        boolean state = true;

        while(state){

            System.out.println("Enter your way of Login");
            System.out.println("1. User Name\n2. Email\n3. Phone Number");

            int i = sc.nextInt();
            sc.nextLine();

            switch(i){

                case 1:

                    System.out.println("Enter the User name : ");
                    String na = sc.nextLine();

                    System.out.println("Enter the Password : ");
                    String p1 = sc.nextLine();

                    state = l.checkLogin(na,p1);
                    break;

                case 2:

                    System.out.println("Enter the Email : ");
                    String e = sc.nextLine();

                    System.out.println("Enter the Password : ");
                    String p2 = sc.nextLine();

                    state = l.checkLogin(e,p2);
                    break;

                case 3:

                    System.out.println("Enter the Phone Number : ");
                    long pn = sc.nextLong();

                    Random r = new Random();
                    int otp = 1000 + r.nextInt(9000);

                    System.out.println("Your OTP : " + otp);

                    System.out.println("Enter your OTP : ");
                    int otps = sc.nextInt();

                    state = l.checkLogin(pn,otp,otps);
                    break;
            }
        }
    }
}

class Login{

    String username;
    String password;
    String email;
    long mobileNumber;

    Login(String username,String email,String password,long mobileNumber){

        this.username = username;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    boolean checkLogin(String name,String pass){

        if((username.equals(name) || email.equals(name)) && password.equals(pass)){

            System.out.println("Login Successful...");
            return false;
        }
        else{
            System.out.println("Login Invalid...");
            return true;
        }
    }

    boolean checkLogin(long number,int otp,int userOtp){

        if(number == mobileNumber && otp == userOtp){

            System.out.println("Login Successful...");
            return false;
        }
        else{
            System.out.println("Login Invalid...");
            return true;
        }
    }
}