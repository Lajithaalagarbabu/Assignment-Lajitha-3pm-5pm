// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Student {
   int studentId;
   String studentName;
   int marks;
   Student(int id,String n,int m){
       studentId=id;
       studentName=n;
       marks=m;
   }
   void calculateGrade(){
       if(marks>=90){
           System.out.println("Grade A");
       }
       else if(marks >= 75){
           System.out.println("Grade B");
   }
       else if(marks >= 50){
            System.out.println("Grade C");
            }
       else{
            System.out.println("Fail");
       }
}
    public static void main(String[] args) {
       Student s1=new Student(1,"Lajitha",85);
       Student s2=new Student(2,"Suba",95);
        Student s3=new Student(3,"Singam",75);
         Student s4=new Student(4,"Meenu",65);
          Student s5=new Student(5,"Suzy",45);
          
        s1.calculateGrade();
         s2.calculateGrade();
          s3.calculateGrade();
           s4.calculateGrade();
            s5.calculateGrade();
       
    }
}