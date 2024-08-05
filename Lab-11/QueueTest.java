// Definition for singly-linked list node
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue implementation using a singly linked list
class Queue {
    private Node front; // Front of the queue
    private Node rear;  // Rear of the queue

    public Queue() {
        front = rear = null;
    }

    // Enqueue an item into the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue an item from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Peek the front item of the queue
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Print the queue elements
    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Test the Queue implementation
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Output: 10 20 30
        
        System.out.println("Front element: " + queue.peek()); // Output: 10
        
        queue.dequeue();
        queue.printQueue(); // Output: 20 30
    }
}
