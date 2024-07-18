// C 59. WAP to check whether 2 singly linked lists are same or not.

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

    // Method to insert a node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display all nodes in the linked list (for debugging purpose)
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to check whether two linked lists are identical
    public boolean areIdentical(LinkedList list2) {
        Node current1 = this.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        // If both lists are traversed completely and both are null, they are identical
        return current1 == null && current2 == null;
    }
}

// Main class to test the LinkedList
public class SameOrNot {
    public static void main(String[] args) {
        // Create first linked list
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);

        // Create second linked list
        LinkedList list2 = new LinkedList();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);

        // Display both lists (for verification)
        System.out.print("List 1: ");
        list1.display();
        System.out.print("List 2: ");
        list2.display();

        // Check if both lists are identical
        if (list1.areIdentical(list2)) {
            System.out.println("Both linked lists are identical.");
        } else {
            System.out.println("Linked lists are not identical.");
        }
    }
}
