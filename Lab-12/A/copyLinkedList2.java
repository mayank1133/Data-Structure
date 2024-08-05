import java.util.Scanner;

public class copyLinkedList2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to exit");
        int data = 0;
        LinkedList li = new LinkedList();
        while (true) {
            System.out.print("Enter data : ");
            data = sc.nextInt();
            if (data == -1) break;
            li.addNode(data);
        }
        
        System.out.println("Original List:");
        li.display();

        LinkedList copiedList = li.copyList();
        System.out.println("Copied List:");
        copiedList.display();
    }
}

class Node {
    int info;
    Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }
}

class LinkedList {
    Node first = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.println("data : " + temp.info);
            temp = temp.link;
        }
    }
    public Node cpyList(Node first)
    {
        if (first==null)
        {
            return null;
        }
        return first;
        else
        {
            System.out.println("Copyed List");
            while(first!=null)
            {

            }
        }
    }

} 