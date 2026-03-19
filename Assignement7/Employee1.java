import java.util.*;

class Employee {

    int empId;
    String empName;
    int salary;

    Employee(int id, String name, int sa) {
        empId = id;
        empName = name;
        salary = sa;
    }

    void displayEmployee() {
        System.out.println("Employee id is: " + empId);
        System.out.println("Employee name is: " + empName);
        System.out.println("Employee salary is: " + salary);
    }

    public static void main(String[] args) {

        Employee de = new Employee(1, "Lajitha", 50000);

        de.displayEmployee();
    }
}