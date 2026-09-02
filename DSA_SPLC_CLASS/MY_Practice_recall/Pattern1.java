import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int start = (i - 1) * n + 1;
            int end = i * n;

            if (i % 2 != 0) {

                // Print from start to end
                for (int j = start; j <= end; j++) {
                    System.out.print(j + " ");
                }

            } else {

                // Print from end to start
                for (int j = end; j >= start; j--) {
                    System.out.print(j + " ");
                }

            }

            System.out.println();
        }

        sc.close();
    }
}