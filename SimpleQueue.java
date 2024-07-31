
public class SimpleQueue {

    int[] queue = new int[5];
    int front = 0, rear = 0, size = 0;

    public void enqueue(int data) {
        if (size == queue.length) {
            System.out.println("Queue is full you not enter an element into queue:");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % queue.length;
        size++;
        System.out.println("Element " + data + " added to the queue");
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        System.out.println("Element " + data + " removed from the queue");
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < front + size; i++) {
                System.out.println((i + 1) + " element of queue is : " + queue[i % queue.length] + " ");

            }
        }
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        q.display();
    }

}