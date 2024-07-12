
import java.awt.desktop.PreferencesHandler;
import java.util.function.Predicate;

// Write a menu driven program to implement following operations on the singly
// linked list.
//  Insert a node at the front of the linked list.
//  Display all nodes.
//  Delete a first node of the linked list.
//  Insert a node at the end of the linked list.
//  Delete a last node of the linked list.
//  Delete a node from specified position.
public class Operation_on_Sii
{
    class node 
    {
        int data;
        int link;
    }
    public node (int data)
    {
        this .data = data;
        this.link = null;
    }
    public node head;
    public node temp;
    public node save;
    public node pred;
    public void deleteAtPosition(int x)
    {
       temp=head;
       save=head;
       pred=head;
       //checkmfor underflow
       if (head == null)
       {
           System.out.println("Underflow");
           return;
       }
       //searxhing for index X in the list and deleting X from the list
       
       int count=1
       while(temp!=null)
       {
        temp=temp.next();
        count++; 
        if(count==x)
        {
            Pred.link=temp;
            break;
        }
        pred=temp;
       }
        
    }
    public void insertFirst(int data)
    {
        //creating a new node
        node newNode = new node(data);
        //checking for under flow
        if(head==null)
        {
            head=newNode;
            return;
        }
        //adding the new node at the beginning
        newNode.link=head;
        head=newNode;
    }
    public void insertAtLast(int data)
    {
        //creating a new node
        node newNode = new node(data);
        //checking for underflow
        if(head==null)
        {
            head=newNode;
            return;
        }
        //searching for the last node in the list
        node temp = head;
        while(temp.link!=null)
        {
            temp=temp.link;
        }
        //adding the new node at the end
        temp.link=newNode;
    }
}