import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR DEPARTMENT_ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

               System.out.print("ENTER YOUR EMPLOYEE_SALARY: ");
        double emp_salary = sc.nextDouble();

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "Lajitha@13"
            );

            // 3. SQL Query
            String query = "UPDATE employee set emp_salary=? where dept_id= ?";


            // 4. Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            // 5. Set values
            ps.setDouble(1, emp_salary);
            ps.setInt(2, id);
            

            // 6. Execute
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Salary Updated successfully!");
            } else {
                System.out.println("Updated failed!");
            }

            // Close resources
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}