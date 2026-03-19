abstract class Food{
abstract void prepare();
}

class Pizza extends Food{
void prepare(){
System.out.println("prepare a pizza for the customer");
}
}

class Burgar extends Food{
void prepare(){
System.out.println("prepare a Burgar for the customer");
}
}

public class FoodPrepare{

public static void main(String []args){
 
Food f1=new Pizza();
f1.prepare();

Food f2=new Burgar();
f2.prepare();


}}