import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class EmployeeProcedure {
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

            // Prepare CallableStatement
            CallableStatement cs =
                con.prepareCall("{call addEmployee(?,?,?)}");

            // Set Values
            cs.setInt(1, 101);
            cs.setString(2, "Rahul");
            cs.setDouble(3, 45000);

            // Execute Stored Procedure
            cs.execute();

            System.out.println("Employee details inserted successfully");

            // Close Resources
            cs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}