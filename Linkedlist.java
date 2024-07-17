
import java.util.Scanner;

class Node {
    int info;
    Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }
}

public class LinkedList {

    public Node first;

    public void InsertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        newNode.link = first;
        first = newNode;
    }

    public void InsertAtOrder(int data) {
        Node newNode = new Node(data);

        if (first == null || newNode.info <= first.info) {

            newNode.link = first;
            first = newNode;
            return;
        }

        Node save = first;
        while (save.link != null && newNode.info > save.link.info) {
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
    }

    public void InsertAtLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
    }

    public void display() {
        Node current = first;
        if (first == null) {
            System.out.println("your Linkedlist is null");
        }
        while (current != null) {
            System.out.print(current.info + ",   ");
            current = current.link;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("if you want to insert a node at frist than enter 1");
        System.out.println("if you want to insert a node at last than enter 2");
        System.out.println("if you want to insert a node at order position than enter 3");
        System.out.println("if you not want to insert a node  than enter -1");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("enter value:");
            int data = sc.nextInt();
            list.InsertAtFirst(data);
        } else if (n == 2) {
            System.out.println("enter value:");
            int data = sc.nextInt();
            list.InsertAtLast(data);
        } else if (n == 3) {
            System.out.println("enter value:");
            int data = sc.nextInt();
            list.InsertAtOrder(data);
        }
        list.display();
    }
}
