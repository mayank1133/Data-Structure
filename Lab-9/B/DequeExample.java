// Write a menu driven program to implement following operations on the
// Doubled Ended Queue using an Array
//  Insert at front end, Insert at rear end
//  Delete from front end, Delete from rear end
//  Display all elements of the queue

import java.util.Scanner;



public class DequeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the deque: ");
        int size = scanner.nextInt();
        Deque deque = new Deque(size);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at front");
            System.out.println("2. Insert at rear");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete from rear");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    int frontValue = scanner.nextInt();
                    deque.insertFront(frontValue);
                    break;
                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    int rearValue = scanner.nextInt();
                    deque.insertRear(rearValue);
                    break;
                case 3:
                    deque.deleteFront();
                    break;
                case 4:
                    deque.deleteRear();
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
    class Deque {
        private int[] queue;
        private int front, rear, size;
    
        public Deque(int size) {
            this.size = size;
            queue = new int[size];
            front = -1;
            rear = -1;
        }
    
        private boolean isFull() {
            return (front == 0 && rear == size - 1) || (front == rear + 1);
        }
    
        private boolean isEmpty() {
            return front == -1;
        }
    
        public void insertFront(int value) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = size - 1;
            } else {
                front--;
            }
            queue[front] = value;
            System.out.println("Inserted " + value + " at the front");
        }
    
        public void insertRear(int value) {
            if (isFull()) {
                System.out.println("Deque is full");
                return;
            }
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = value;
            System.out.println("Inserted " + value + " at the rear");
        }
    
        public void deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            int removedValue = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
            System.out.println("Deleted " + removedValue + " from the front");
        }
    
        public void deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            int removedValue = queue[rear];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = size - 1;
            } else {
                rear--;
            }
            System.out.println("Deleted " + removedValue + " from the rear");
        }
    
        public void display() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            System.out.print("Elements in deque are: ");
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            } else {
                for (int i = front; i < size; i++) {
                    System.out.print(queue[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
