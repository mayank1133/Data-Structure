// 51. Write a menu driven program to implement following operations on a circular
// queue using an Array
//  Insert
//  Delete
//  Display all elements of the queue
import java.util.Scanner;
public class CircularQueueOperation {
    int size ;
    int front = -1;
    int rear = -1;
    int[] arr;

    public CircularQueueOperation(int size) {
        this.size = size;
        arr = new int[size];
    }
    
    public boolean isFull() {
        return ((rear + 1) % size == front);
    }
    
    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }
    
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full. " + value);
            return;
        }
        
        if (isEmpty()) {
            front = 0;
        }
        
        rear = (rear + 1) % size;
        arr[rear] = value;
        System.out.println(value + " inserted into queue.");
    }
    
    public void delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
            .00
        }
        
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        
        System.out.println("Deleted element is: " + arr[front]);
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        
        int current = front;
        do {
            System.out.print(arr[current] + " ");
            current = (current + 1) % size;
        } while (current!= front);
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ;
        System.out.println("please Enter size of queue");
        size = sc.nextInt();
        CircularQueueOperation queue = new CircularQueueOperation(size);
        
        
        int choice;
        do {
            System.out.println("\n1.(1) Insert\n2. (2) Delete\n3. (3) Display\n4. (4) Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    queue.insert(sc.nextInt());
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(choice!=4); 
    }    
}
