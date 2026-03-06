import java.util.*;
class Employee {
    String Name;
    int id;
    int Salary;
    void calculation() {
        int Hra = Salary * 20 / 100;
        int da = Salary * 10 / 100;
        int gross_Salary = Salary + Hra + da;
        System.out.println("Your Gross Salary is: " + gross_Salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.Name = "Lajitha";
        e1.id = 1;
        e1.Salary = 50000;

        Employee e2 = new Employee();
        e2.Name = "Thamarai";
        e2.id = 2;
        e2.Salary = 55000;

        e1.calculation();
        e2.calculation();

        if (e1.Salary >= 50000) {
            int Bonus = e1.Salary * 5 / 100;
            System.out.println("Bonus is given: " + Bonus);
        } else {
            System.out.println("You are not eligible for bonus");
        }
    }
}