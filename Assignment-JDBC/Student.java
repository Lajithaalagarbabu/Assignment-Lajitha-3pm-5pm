import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "Lajitha@13"
            );

            // 3. SQL Query
            String query = "UPDATE student set marks=? ,name=? where id= ?";



            // 4. Prepare Statement
            PreparedStatement ps = con.prepareStatement(query);

            // 5. Set values
            ps.setDouble(1, marks);
            ps.setString(2, name);
            ps.setInt(3, id);
           
            

            // 6. Execute
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            } else {
                System.out.println("Insertion failed!");
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