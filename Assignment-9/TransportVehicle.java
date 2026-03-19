interface Vehicle{
void startEngine();
void stopEngine();
}
class Car implements Vehicle{
 public void startEngine(){
   System.out.println("Car Engine Started!");
}
public void stopEngine(){
System.out.println("Car Engine Stoped!");
}
}

class Bike implements Vehicle{
 public void startEngine(){
   System.out.println("Bike Engine Started!");
}
public void stopEngine(){
System.out.println("Bike Engine Stoped!");
}
}

class Truck implements Vehicle{
 public void startEngine(){
   System.out.println("Truck Engine Started!");
}
public void stopEngine(){
System.out.println("Truck Engine Stoped!");
}

}

public class TransportVehicle{
public static void main(String []args){



Vehicle v1=new Car();
Vehicle v2=new Bike();
Vehicle v3=new Truck();

v1.startEngine();
v1.stopEngine();

v2.startEngine();
v2.stopEngine();

v3.startEngine();
v3.stopEngine();

}
}