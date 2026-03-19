public class Companysystem {
  int Employee_id;
  String Employee_name;
Companysystem (){
   Employee_id=100;
   Employee_name="Not Assigned";
}
Companysystem (int id ,String name){
   Employee_id=id;
   Employee_name=name;
}
public void display(){
   System.out.println("Employee_id :" +Employee_id);
   System.out.println("Employee_name :" +Employee_name);
}
public static void main(String []args){
  Companysystem  cs=new Companysystem ();
  Companysystem  c1=new Companysystem (1,"lajitha");
   cs.display(); 
   c1.display(); 
  
}
}