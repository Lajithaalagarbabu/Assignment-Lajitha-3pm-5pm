import java.util.*;
class Employee{
int employeeId;
double basicSalary;

void calculateBonus(){
double bonus;
bonus = basicSalary * 10/100;

System.out.println("Employee ID: " + employeeId);
System.out.println("Basic salary: " + basicSalary);
System.out.println("Bonus Amount: " + bonus);

}
}

public class EmployeeSalary {
public static void main(String[] args){
Employee emp1 = new Employee();
emp1.employeeId = 101;
emp1.basicSalary = 50000;
emp1.calculateBonus();
}
}
