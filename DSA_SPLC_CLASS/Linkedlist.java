import java.util.*;
class Node
{

 public int data; // STORE A VALUE  
 public Node next;   //Stores the address of the next node

}
class Linkedlist
{

 public static void main(String []args)
  {  

    int choice;
    Scanner s=new Scanner(System.in);
    Node start=null;
    Node last=new Node(); // node is always datatype 

    do
    {

     System.out.println("enter 1. add 2. traverse "); // Stores the user's option.
     choice=s.nextInt();
	    switch(choice)
    		{     
                   case 1:

                           
                           if( start == null)
                            {
                               System.out.println("enter a number");
                               int data=s.nextInt(); //10

                               Node temp=new Node(); // temp = 1000 // memory is created
                               temp.data=data;        // data = 10 store data
                               start=temp;           // start = 1000
                                
                               last=start;            //last=1000;  Both point to the same node.
                               

                            }
                     
                            else
                            {
                               System.out.println("enter a number");
                               int data=s.nextInt(); //30
                               
                               Node temp=new Node(); // temp=3000
                               temp.data=data;         // data=30  store data
                               //temp.next=null;
                          
                               last.next=temp;  //2000->next=3000 Connect previous node
                               last=temp; //  last=3000
                            }
                          break;

                   case  2:
                         Node temp=new Node();
                         temp = start; // 1000

                         while( temp != null )
                         {
                            System.out.println(temp.data); // 10 20 30
                            temp=temp.next;
                         }
                
                          break;
   
                   default:
			choice=-1;
                        break;
 
    		}
    }while(choice !=-1);  
 }
}
