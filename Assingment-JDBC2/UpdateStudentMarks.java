import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class UpdateStudentMarks {
    public static void main(String[] args) {

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/assi2",
                "root",
                "Lajitha@13"
            );

            // Create CallableStatement
            CallableStatement cs =
                con.prepareCall("{call updateMarks(?,?)}");

            // Set Parameters
            cs.setInt(1, 101);   // Student ID
            cs.setInt(2, 90);    // New Marks

            // Execute Procedure
            cs.execute();

            System.out.println("Student marks updated successfully");

            // Close Resources
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}