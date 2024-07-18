// Write a program to count the number of nodes in a singly circularly linked list using java

// Node class representing a node in the singly circular linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// CircularLinkedList class implementing operations on the singly circular linked list
class CircularLinkedList {
    private Node head;

    CircularLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // point to itself to make it circular
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        System.out.println("Node inserted successfully.");
    }

    // Method to count the number of nodes in the circular linked list
    public int countNodes() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}

// Main class to test the CircularLinkedList
public class CountNodes {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Insert nodes into the circular linked list
        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(4);

        // Count the number of nodes
        int nodeCount = circularList.countNodes();
        System.out.println("Number of nodes in the circular linked list: " + nodeCount);
    }
}
