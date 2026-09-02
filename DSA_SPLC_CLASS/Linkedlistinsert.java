class Node
{

 public int data;
 public Node next;

}

class sample1
{

  public static void main(String []args)
  {

    boolean isContinue=true;
    Node start=null, previous=null, temp=null,last=null, curr=null;
    
    do
    {
    
      System.out.println("enter 1. add node 2. traverse [visiting elements] 3. insert 4. delete 5. exit");
      Scanner s=new Scanner(System.in);
      int choice=s.nextInt();

     switch( choice )
     {

        case 1:

                if(start==null)
                {
	                System.out.println("enter a number");
        	        int data=s.nextInt();
                	temp=new Node(); // temp=[data, next] // 1000
	                temp.data=data;  // 1000=[data=10, next=null]
        	        start=previous=temp;//start=previous=temp=1000
               }
               else
               {
                        System.out.println("enter a number");
        	             int data=s.nextInt(); //20, 30
                        temp=new Node(); // temp=2000=[data, next], temp=3000=[data, next]
                        temp.data=data;  //temp=2000=[data=20, next=null], temp=3000=[data=30, next=null]
                        previous.next=temp; // 1000.next=2000, 2000.next=3000
                        previous=temp;      // previous=2000, 3000

               }

                break;
        case 2:
                  temp=start; //temp=1000

                 while(temp!=null)
                 {
                     System.out.println( temp.data); // 10, 20, 30
                     temp=temp.next;

                 }
                break;
        case 3:
                System.out.print(" 1. begining 2. middle 3. end ");
                int option=s.nextInt();
                if(option==1)
                  {

                   System.out.println("enter the value");
                   int data=s.nextInt();

                   temp=new Node(); //temp=500
                   temp.data=data; // temp.data=5

                   temp.next=start; //500->next=1000               
                   start=temp; //start =500

                  }
                 else if(option == 2)
                   {
                       System.out.println("enter the position ");
                       int position=s.nextInt();

                       int count=0;
                       curr=start;
                       previous=start;

                       while( count < position ) // 0< 2, 1<2
                       {
                         previous=curr;  //  previous=500, 1000
                         curr=curr.next; // curr=1000, 2000
                         count++; // 1, 2
                       }

                       System.out.println("enter the data ");
                       int data=s.nextInt(); //15

                       temp=new Node(); //temp=1500
                       temp.data=data; // 15

                       previous.next=temp; //1000.next=1500
                       temp.next=curr; // 1500.next=2000
               

                   }
                 else
                  {

                    last=start;
                    while( last.next!=null)
                       {
                         last=last.next;
                       }

                   // last=3000;


                   System.out.println("enter a number");
                   int data=s.nextInt(); // 40
                   temp=new Node(); //temp=4000
                   temp.data=data; // 40
                   last.next=temp; // 3000.next=4000
                                 
                  }
                break;
        case 4:
                System.out.println("deleting elements");
                break;
	default:
                isContinue=false;
                break;
     }

    }while(isContinue);
  }

}