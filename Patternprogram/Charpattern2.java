import java.util.*;
public class Charpattern2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enetr a value :");
      int row=5;
        String[] letters = {
            "A","B","C","D","E","F","G","H","I","J",
            "K","L","M","N","O","P","Q","R","S","T",
            "U","V","W","X","Y","Z"
        };

        int ascii = 65;

        for (int i = 0; i <= row; i++) {
            for(int j=0;j<=i;j++){
               System.out.print(letters[i]);
            ascii++; 
            }
            System.out.println();
        }
    }
}