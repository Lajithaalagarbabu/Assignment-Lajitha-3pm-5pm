import java.util.*;

class Student {

    int studentId;
    String studentName;
    int marks;

    Student(int id, String name, int m) {
        studentId = id;
        studentName = name;
        marks = m;
    }

    void calculateGrade() {

        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Marks : " + marks);

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id:");
        int id = sc.nextInt();

        System.out.println("Enter Student Name:");
        String name = sc.next();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);

        s.calculateGrade();
    }
}