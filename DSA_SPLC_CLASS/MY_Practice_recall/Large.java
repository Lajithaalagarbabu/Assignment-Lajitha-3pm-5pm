public class Large {
    public static void main(String[] args) {

        int arr[] = {23, 35, 39, 45, 147, 49,2122, 55, 56, 59, 70,};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number is " + largest);
    }
}