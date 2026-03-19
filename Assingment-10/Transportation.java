abstract class Transport
{
abstract void bookTicket();
}

class Bus extends Transport
{
void bookTicket(){
System.out.println("Book a Bus Ticket!");
}
}

class Train extends Transport
{
void bookTicket(){
System.out.println("Book a Train Ticket!");
}
}

public class Transportation{
public static void main(String[] args){

Transport t1=new Bus();
t1.bookTicket();


Transport t2=new Train();
t2.bookTicket();
}
}