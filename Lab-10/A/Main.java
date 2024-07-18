// 7. Write a menu driven program to implement following operations on the singly
// linked list.
//  Insert a node at the front of the linked list.
//  Display all nodes.
//  Delete a first node of the linked list.
//  Insert a node at the end of the linked list.
//  Delete a last node of the linked list.
//  Delete a node from specified position.
import java.util.Scanner;

// Node class representing a node in the singly linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class implementing operations on the singly linked list
class LinkedList {
    private Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a node at the front of the linked list
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted successfully at the front.");
    }

    // Method to display all nodes in the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.println("Nodes in the linked list:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to delete the first node of the linked list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked list is empty. Nothing to delete.");
            return;
        }
        head = head.next;
        System.out.println("First node deleted successfully.");
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Node inserted successfully at the end.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Node inserted successfully at the end.");
    }

    // Method to delete the last node of the linked list
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked list is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Last node deleted successfully.");
            return;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        System.out.println("Last node deleted successfully.");
    }

    // Method to delete a node from a specified position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty. Nothing to delete.");
            return;
        }
        Node current = head;
        if (position == 0) {
            head = current.next;
            System.out.println("Node at position " + position + " deleted successfully.");
            return;
        }
        int index = 0;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null || current.next == null) {
            System.out.println("Position " + position + " does not exist in the linked list.");
            return;
        }
        current.next = current.next.next;
        System.out.println("Node at position " + position + " deleted successfully.");
    }
}

// Main class to drive the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert node at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete first node");
            System.out.println("4. Insert node at the end");
            System.out.println("5. Delete last node");
            System.out.println("6. Delete node at a specific position");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    int dataFront = scanner.nextInt();
                    linkedList.insertAtFront(dataFront);
                    break;
                case 2:
                    linkedList.display();
                    break;
                case 3:
                    linkedList.deleteFirst();
                    break;
                case 4:
                    System.out.print("Enter data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    linkedList.insertAtEnd(dataEnd);
                    break;
                case 5:
                    linkedList.deleteLast();
                    break;
                case 6:
                    System.out.print("Enter position to delete node: ");
                    int pos = scanner.nextInt();
                    linkedList.deleteAtPosition(pos);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
