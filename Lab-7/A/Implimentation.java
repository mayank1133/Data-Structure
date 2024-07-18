//  Write a menu driven program to implement following operations on the Stack 
// using an Array 
//  PUSH, POP, DISPLAY 
//  PEEP, CHANGE 
import java.util.Scanner;
class Stack{
    int s[];
    int top;
    int X;
    int i;
}
public void push(int x){
    if(top >= s.length - 1){
        System.out.println("Stack Overflow");
        return;
    }
    top++;
    s[top] = x;
}
public  pop(){
    if(top < 0){
        System.out.println("Stack Underflow");
        return;
    }
    System.out.println("Popped element is: " + s[top]);
    top--;
    int temp=s[top+1];
    s[top+1]=0;
    return temp;
}
public void peep(int s,int top,int i){
    if(top-i+1 < 0){
        System.out.println("Stack Underflow");
    }
    else {
        System.out.println("Top element is: " + s[top-i+1]);
    }
    
}
public void change(int i,int x)
{
    if(top-i+1 < 0){
        System.out.println("Stack Underflow");
    }
    else {
        s[top-i+1]=x;
        System.out.println("Top element changed to: " + x);
    }
}
public void display(){
    if(top < 0){
        System.out.println("Stack is Empty");
        return;
    }
    System.out.println("Stack elements are:");
    for(int i=top; i>=0; i--){
        System.out.println(s[i]);
    }
}