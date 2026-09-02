class Binary {
    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,4,6,7,8,22,28};
         int target=22;
         int ans=binarySearch(arr,target);
         System.out.println(ans);   
    }
}