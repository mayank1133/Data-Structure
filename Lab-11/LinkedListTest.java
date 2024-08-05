import java.util.HashSet;

// Definition for singly-linked list node
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Function to remove duplicates from a linked list
class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // Add a new node to the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Remove duplicate nodes from the linked list
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;
        
        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next; // Remove duplicate node
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    // Print the linked list elements
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Test the LinkedList with duplicate removal
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(4);
        list.append(1);

        System.out.println("Original List:");
        list.printList(); // Output: 1 2 3 2 4 1

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.printList(); // Output: 1 2 3 4
    }
}
