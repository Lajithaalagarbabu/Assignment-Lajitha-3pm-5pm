
class Node {

    public int data;
    public Node next;

}

class Linkedlist2 {

    public static void main(String[] args) {

        int choice;
        Scanner s = new Scanner(System.in);

        Node start = null;
        Node last = null;

        do {

            System.out.println("Enter 1. Add 2. Traverse");
            choice = s.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter a number");
                    int data = s.nextInt();

                    Node temp = new Node();
                    temp.data = data;
                    temp.next = null;

                    if (start == null) {

                        start = temp;
                        last = temp;

                    }

                    // Insert at Beginning if smaller than first node
                    else if (data < start.data) {

                        temp.next = start;
                        start = temp;

                    }

                    // Insert at End
                    else {

                        last.next = temp;
                        last = temp;

                    }

                    break;

                case 2:

                    temp = start;

                    while (temp != null) {

                        System.out.println(temp.data);
                        temp = temp.next;

                    }

                    break;

                default:

                    choice = -1;
                    break;
            }

        } while (choice != -1);

       // s.close();
    }
}