import java.util.*;

public class Charpattern {
    public static void main(String[] args) {

        int row = 5;

        for(int i = 1; i <= row; i++) {

            char ch = 'a';   // start from 'a' for every row

            for(int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;   // move to next character
            }

            System.out.println();
        }
    }
}