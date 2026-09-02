public class Largestnumber{
    public static void main(String[] args) {
        int arr[]={23, 35, 39, 45, 47, 49, 55, 56, 59, 70};
         int tenp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]<=arr[j]){
                      tenp=arr[i];
                }
            }
        } 
    
       System.out.println("Largest number is "+tenp);
    }
}