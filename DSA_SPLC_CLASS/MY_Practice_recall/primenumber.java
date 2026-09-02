public  class primenumber{
    public static void main(String[] args) {
        int arr[]={1,2,3,18,50,17};
        int prime=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 1; j < arr[i]; j++) {
                if(arr[i]%j==0){
                    count ++;
                }
            }
            if(count == 2){
                 System.out.println(arr[i]);
            }
        }
        
    }
}