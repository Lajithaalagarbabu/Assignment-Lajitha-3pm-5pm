public class Small {
    public static void main(String[] args) {

        int arr[] = {23, 35, 39, 45,1,47, 49, 55, 56, 59, 7};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest number is " + smallest);
    }
}