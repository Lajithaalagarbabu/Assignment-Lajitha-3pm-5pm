import java.util.*;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String msg) {
        super(msg);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}


public class Loginsystem  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "admin@123";

        int attempts = 0;

        while (attempts < 3) {
            try {
                System.out.print("Enter username: ");
                String user = sc.nextLine();

                System.out.print("Enter password: ");
                String pass = sc.nextLine();

                if (!user.equals(correctUser)) {
                    throw new InvalidUsernameException("Invalid Username");
                }

                if (!pass.equals(correctPass)) {
                    throw new InvalidPasswordException("Invalid Password");
                }

                System.out.println("Login Successful");
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                attempts++;
            }
        }

        if (attempts == 3) {
            System.out.println("Program terminated after 3 attempts");
        }
    }
}