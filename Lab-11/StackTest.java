// Definition for singly-linked list node
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using a singly linked list
class Stack {
    private Node top; // Top of the stack

    public Stack() {
        top = null;
    }

    // Push an item onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop an item from the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek the top item of the stack
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print the stack elements
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Test the Stack implementation
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // Output: 30 20 10
        
        System.out.println("Top element: " + stack.peek()); // Output: 30
        
        stack.pop();
        stack.printStack(); // Output: 20 10
    }
}
