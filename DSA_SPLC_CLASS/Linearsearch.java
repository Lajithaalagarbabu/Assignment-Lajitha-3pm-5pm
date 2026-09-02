import java.util.*;
class Linearsearch
{
 public static void main(String []args)
  {
     int []numbers= {11,22,33,44,55,50,200,500};
     System.out.println("enter a number to be search");
     Scanner s=new Scanner(System.in);
     int num=s.nextInt();
     int isFound=0; //boolean value default the value will be "false"    

     for(int i=0; i<numbers.length; i++)
      {
         if( num == numbers[i])
         {
           isFound=1; //if number is found the value will change in "1" it means "true" 
           break;
         }
      }
      if( isFound==1 ) //the number will be changed into "1" or "True"  
       {
          System.out.println(" number is found ");
       }
      else
       {
          System.out.println(" number is not found ");
       }
  }
}