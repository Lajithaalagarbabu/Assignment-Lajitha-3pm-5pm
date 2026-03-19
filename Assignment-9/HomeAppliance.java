
interface SmartDevice{
void turnon();
void turnoff();
}

class Fan implements SmartDevice{
public void turnon(){
System.out.println("Turned On the fan!");
}
public void turnoff(){
System.out.println("Turned Off the fan!");
}
}

class Light implements SmartDevice{
public void turnon(){
System.out.println("Turned On the Light!");
}
public void turnoff(){
System.out.println("Turned Off the Light!");
}
}

class AirConditioner implements SmartDevice{
public void turnon(){
System.out.println("Turned On the AirConditioner!");
}
public void turnoff(){
System.out.println("Turned Off the AirConditioner!");
}
}

public class HomeAppliance{

public static void main(String []args){
SmartDevice a1=new Fan();
SmartDevice a2=new Light();
SmartDevice a3=new AirConditioner();

a1.turnon();
a1.turnoff();

a2.turnon();
a2.turnoff();

a3.turnon();
a3.turnoff();


}

}