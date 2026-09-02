public  class Secondlarge{
public static void main(String[] args) {
    int arr[] = { 147, 49,2122, 55, 56, 590, 70,};

        int largest = arr[0];
        int second=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                 second = largest;
                largest = arr[i];
            }
             else if(largest<=second){
                second = arr[i];
             }

        }
        System.out.println("Second Largest number is " + second);
}
}