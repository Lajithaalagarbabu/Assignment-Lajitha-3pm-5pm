class Transport{
int ticketPrice;
int distance = 10;
int fare;
void calculateFare(){

}
}

class Bus extends Transport{
void calculateFare()
{
ticketPrice = 28;
fare = distance*ticketPrice;
System.out.println("Bus Fare:" +fare);
}
}

class Train extends Transport{
void calculateFare()
{
ticketPrice = 10;
fare = distance*ticketPrice;
System.out.println("Train Fare:" +fare);
}
}

class Taxi extends Transport{
void calculateFare()
{
ticketPrice = 320;
fare = distance*ticketPrice;
System.out.println("taxi Fare:" +fare);
}
}

public class TransportFareSystem{

public static void main(String[]args){
Transport t = new Transport();

t = new Bus();
t.calculateFare();

t = new Train();
t.calculateFare();

t = new Taxi();
t.calculateFare();

}
}