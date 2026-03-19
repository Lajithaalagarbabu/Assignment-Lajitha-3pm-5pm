abstract class Appliance{
  
abstract void turnon();
abstract void turnoff();
}

class Fan extends Appliance{
void turnon(){
System.out.println("Fan is Turned on");
}
void turnoff(){
System.out.println("Fan is Turned off");
}
}

class WashingMachine extends Appliance {
void turnon(){
System.out.println("WashingMachine is Turned on");
}
void turnoff(){
System.out.println("WashingMachine is Turned off");
}
}


public class Machine{

public static void main(String []args){

Appliance a1=new Fan();
a1.turnon();
a1.turnoff();

Appliance a2=new WashingMachine();
a2.turnon();
a2.turnoff();




}
}