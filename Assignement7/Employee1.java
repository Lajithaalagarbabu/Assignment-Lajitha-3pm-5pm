
import java.util.*;
class  Employee {
    
 int  empId;
 String empName;
 int salary;
 
 Employee(int id, String name,int sa){
     empId=id;
     empName=name;
     salary=sa;
 }
 void displayEmployee(){
     System.out.println("Employee id is: " +empId);
     System.out.println("Employee name is :" +empName);
     System.out.println("Employee Salary is :" +salary);
 }}
 
public class Employee1{
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
       Employee de = new Employee(1, "Lajitha", 50000);
         
         de.displayEmployee();
    }
}