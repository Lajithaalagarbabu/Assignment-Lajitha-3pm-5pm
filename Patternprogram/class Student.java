class Student {

    int id;
    String name;

    Student(int i, String n) { //constructor created (I,n (is a parameter))
        id = i;
        name = n;
    }

    void display() { //method 
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");

        s1.display();
        s2.display();
    }
}