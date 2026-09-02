import java.util.*;
class Binarysearch
{
 public static void main(String []args)
  { 
     int []numbers= {10,20,30,40,50,60,70,80,90,100};
     System.out.println("enter a number to be search");
     Scanner s=new Scanner(System.in);
     int num=s.nextInt();

     int min = 0;
     int max = numbers.length-1;
     int mid= ( min + (max-min) / 2);
     boolean isFound=false;

      while( min <= max)
      {
         if( num == numbers[mid] )  // 0 + 9 / 2 = 4 = numbers[4] = 50
         {
            isFound= true;
            break;
         }
         else if( num < numbers[mid])
         {
            max=mid-1;          // 3
            mid=(min+(max-min)/2);    // 0 + 3 / 2 = 1 = numbers[1]= 20
         }
         else
         {
            min=mid+1;        // min=11
            mid=(min+max)/2;  // mid=11+9=10
         }

      }

      if( isFound )
       {
           System.out.println(" number is found ");
       }
       else
       {
          System.out.println(" number is not found ");
       }
  }

}