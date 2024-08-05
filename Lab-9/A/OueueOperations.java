// 50. Write a menu driven program to implement following operations on the Queue
// using an Array
//  ENQUEUE
//  DEQUEUE
//  DISPLAY

import java.util.Scanner;

public class OueueOperations{
    int MAX_SIZE = 5;
    int front = -1;
    int rear = -1;
    int arr[] = new int[MAX_SIZE];
    
    public static void main(String[] args) {
        OueueOperations queue = new OueueOperations();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("\nQueue Operations");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    queue.enqueue(sc);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    
    public void enqueue(Scanner sc) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full");
            return;
        }
        
        if (front == -1){
            front = 0;
        }
        
        System.out.print("Enter the element to enqueue: ");
        int value = sc.nextInt();
        
        rear++;
        arr[rear] = value;
        System.out.println(value + " inserted into queue.");
    }
    
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        
        int dequeued = arr[front];
        front++;
        
        if (front > rear) {
            front = rear = -1;
        }
        
        System.out.println(dequeued + " dequeued from queue.");
    }
    
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        
        System.out.print("Queue elements: ");
        
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
}