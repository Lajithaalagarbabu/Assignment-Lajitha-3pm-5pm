import java.util.*;

public class Frequencylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : list) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Frequencies:");
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}