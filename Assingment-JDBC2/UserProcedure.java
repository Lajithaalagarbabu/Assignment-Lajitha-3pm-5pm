import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class UserProcedure {
    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/assi2",
                "root",
                "Lajitha@13"
            );

            // Create CallableStatement
            CallableStatement cs =
                con.prepareCall("{call addUser(?,?,?)}");

            // Set Input Parameters
            cs.setInt(1, 1);
            cs.setString(2, "Alagarbabu");
            cs.setInt(3, 22);

            // Execute Stored Procedure
            cs.execute();

            System.out.println("User data inserted successfully");

            // Close Resources
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}