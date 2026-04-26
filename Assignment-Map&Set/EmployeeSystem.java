import java.util.*;

public class EmployeeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> empMap = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Get Salary");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    empMap.put(id, salary);
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    if (empMap.containsKey(searchId)) {
                        System.out.println("Salary: " + empMap.get(searchId));
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    if (empMap.containsKey(updateId)) {
                        System.out.print("Enter new salary: ");
                        double newSalary = sc.nextDouble();

                        empMap.put(updateId, newSalary);
                        System.out.println("Salary updated.");
                    } else {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}