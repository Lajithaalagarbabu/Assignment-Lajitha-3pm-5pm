class Student {
    
    String name;
    int rollNo;


    void calculateTotal(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;   // Local variable

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Lajitha";
        s1.rollNo = 21;

        s1.calculateTotal(80, 75, 90);
    }
}