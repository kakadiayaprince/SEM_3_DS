
 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    
    public Node first;
    

    public void AddInsertFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        newNode.next = first;
        first = newNode;
    }

    public void display() {
        Node curr = first;
        if (first == null) {
            System.out.println("your Lnkedlist is null");
        }
        while (curr != null) {
            System.out.print(curr.data + ",   ");
            curr = curr.next;
        }
    }

}

public class Linkedlist {

    public static void main(String[] args) {
         Node list = new Node(0);
        list.AddInsertFirst(5);
        list.AddInsertFirst(8);
        // list.AddInsertFirst(6);
        // list.AddInsertFirst(9);

        dhhdhd
        list.display();
    }
}
