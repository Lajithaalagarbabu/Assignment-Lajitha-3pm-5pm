public class PyramidPattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {   // rows
           
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // next line
        }
    }
}