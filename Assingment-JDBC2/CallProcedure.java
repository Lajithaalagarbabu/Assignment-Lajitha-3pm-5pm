import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class CallProcedure {
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

            // Prepare CallableStatement
            CallableStatement cs =
                con.prepareCall("{call insertStudent(?,?,?)}");

            // Set Values
            cs.setInt(1, 101);
            cs.setString(2, "Arun");
            cs.setInt(3, 95);

            // Execute Procedure
            cs.execute();

            System.out.println("Student record inserted successfully");

            // Close Connection
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}