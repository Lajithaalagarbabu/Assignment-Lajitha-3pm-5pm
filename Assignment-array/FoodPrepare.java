abstract class Food{
abstract void prepare();
}

class pizza extends Food{
void prepare(){
System.out.println("prepare A pizza for the customer");
}
}

class Burgar extends Food{
void prepare(){
System.out.println("prepare A Burgar for the customer");
}
}

public class FoodPrepare{

public static void main(String []args){
 
Food f1=new Pizza();
f1.prepare();

Food f2=new Burgar();
f2.prepare();


}}