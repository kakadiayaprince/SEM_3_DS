public class LinkedList {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }

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
            Node save = null;
            while (save.link != null && newNode.info >= save.link.info) {
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
    }

    public static void main(String[] args) {

        Node list = new Node(10);
        list.InsertAtFirst(10);
        list.InsertAtLast(20);
        list.InsertAtOrder(15);
        list.display();
    }
}
