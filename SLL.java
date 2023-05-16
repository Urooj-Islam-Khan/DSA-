import java.util.Scanner;

public class SLL {
    static class Node {

        int item;
        Node link;

        Node(int item) {
            this.item = item;
            this.link = null;

        }
    }

    Node head = null;

    public void creation() {
        int n, item;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter item");
            item = sc.nextInt();

            Node new_node = new Node(item);

            if (head == null) {
                head = new_node;
            } else {
                new_node.link = head;
                head = new_node;
            }
            System.out.println("If you want to enter more Item, Press 0");
            n = sc.nextInt();
        } while (n == 0);

    }

    public void transverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist");

        } else {
            while (temp != null) {
                System.out.print(temp.item + " ");
                temp = temp.link;
            }
        }
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.creation();
        sll.transverse();

    }

}