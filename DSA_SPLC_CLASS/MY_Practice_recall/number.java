import java.util.Scanner;
public class number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            // Print from i to 0
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }

            // Print from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}