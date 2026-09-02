import java.util.Scanner;

class Node {
    public int data;
    public Node next;
}
public class Link {
    public static void main(String[] args) {
        boolean isContinue = true;
        Node start = null, previous = null, temp = null, last = null, curr = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1. Add Node 2. Insert Node 3. Traverse 4. Delete 5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    temp = new Node();
                    temp.data = data;
                    temp.next = null;
                    if (start == null) {
                        start = temp;
                        previous = temp;
                    } else {
                        previous.next = temp;
                        previous = temp;
                    }
                    break;
                case 2:
                    System.out.println("1. Beginning 2. Middle 3. End");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        temp = new Node();
                        temp.data = data;
                        temp.next = start;
                        start = temp;
                    } else if (option == 2) {
                        System.out.print("Enter position: ");
                        int position = sc.nextInt();
                        int count = 1;
                        curr = start;
                        previous = null;
                        while (curr != null && count < position) {
                            previous = curr;
                            curr = curr.next;
                            count++;
                        }
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        temp = new Node();
                        temp.data = data;
                        if (previous != null) {
                            previous.next = temp;
                            temp.next = curr;
                        }

                    } else if (option == 3) {
                        System.out.print("Enter data: ");
                        data = sc.nextInt();
                        temp = new Node();
                        temp.data = data;
                        temp.next = null;
                        if (start == null) {
                            start = temp;
                        } else {
                            last = start;
                            while (last.next != null) {
                                last = last.next;
                            }
                            last.next = temp;
                        }
                    }
                    break;

                case 3:

                    System.out.println("Linked List:");

                    curr = start;

                    if (curr == null) {
                        System.out.println("List is Empty");
                    } else {
                        while (curr != null) {
                            System.out.print(curr.data + " -> ");
                            curr = curr.next;
                        }
                        System.out.println("NULL");
                    }

                    break;

                case 4:

                    System.out.println("Delete operation not implemented.");

                    break;

                case 5:

                    isContinue = false;
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (isContinue);

        sc.close();
    }
}