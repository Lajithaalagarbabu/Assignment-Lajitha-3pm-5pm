import java.util.*;

public class Mobileshop  {
   String Model;
   int Price;
Mobileshop(){
  Model="Samsung";
  Price=20000;
}
public void display(){
   System.out.println("Model is :" +Model);
    System.out.println("Price is :" +Price);
  
}
    public static void main(String[] args) {
     Mobileshop ms=new Mobileshop();
     ms.display();
     
    }
}