public class Smallest{
    public static void main(String[] args) {
        int arr[]={23, 35, 39, 45, 47, 49, 55, 56, 59, 7};
        
        for (int i = 0; i < arr.length; i++) {
             boolean tenp=true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                      tenp=false;
                      break;
                }
            }    
      if(tenp){
       System.out.println("Smallest number is "+arr[i]);
      }
        }
    }
}