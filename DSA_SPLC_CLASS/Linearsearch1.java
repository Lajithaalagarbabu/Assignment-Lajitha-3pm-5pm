import java.util.*;
class Linearsearch1
{
 public static void main(String []args)
  {
     int []numbers= {11,22,33,44,55,50,200,500};
     System.out.println("enter a number to be search");
     Scanner s=new Scanner(System.in);
     int num=s.nextInt();
     int isFound=false; //boolean value default the value will be "false"    

     for(int i=0; i<numbers.length; i++)
      {
         if( num == numbers[i])
         {
           isFound=true; //if number is found the value will change in "1" it means "true" 
           break;
         }
      }
      if( isFound ) //the number will be changed into "1" or "True"  
       {
          System.out.println(" number is found ");
       }
      else
       {
          System.out.println(" number is not found ");
       }
  }
}