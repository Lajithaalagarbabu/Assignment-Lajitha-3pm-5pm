import java.util.*;
public class Student{
String name;
int rollNo;
int BiologyMark, ChemistryMark, PhysicsMark;

void calculateResult(){
int total = BiologyMark + ChemistryMark + PhysicsMark;
double average = total/3.0;
String grade;

if(average >= 80){
grade = "A";
}
else if(average >= 60){
grade = "B";
}
else if(average >= 40){
grade = "C";
}
else{
grade = "Fail";
}

System.out.println("Roll No: " + rollNo);
System.out.println("Name: " + name);
System.out.println("Total Mark: " + total);
System.out.println("Average Mark: " + average);
System.out.println("Grade: " + grade);

}



public static void main(String[]args){
Student s1 = new Student();
s1.name = "Abika";
s1.rollNo = 01;
s1.BiologyMark = 78;
s1.ChemistryMark = 81;
s1.PhysicsMark = 97;

Student s2 = new Student();
s2.name = "Akshi";
s2.rollNo = 02;
s2.BiologyMark = 68;
s2.ChemistryMark = 61;
s2.PhysicsMark = 91;

Student s3 = new Student();
s3.name = "Aqulin";
s3.rollNo = 03;
s3.BiologyMark = 61;
s3.ChemistryMark =71;
s3.PhysicsMark = 90;

Student s4 = new Student();
s4.name = "Ashika";
s4.rollNo = 04;
s4.BiologyMark = 62;
s4.ChemistryMark = 81;
s4.PhysicsMark = 87;

Student s5 = new Student();
s5.name = "Azariyas";
s5.rollNo = 05;
s5.BiologyMark = 78;
s5.ChemistryMark = 81;
s5.PhysicsMark = 97;


s1.calculateResult();
s2.calculateResult();
s3.calculateResult();
s4.calculateResult();
s5.calculateResult();


}
}