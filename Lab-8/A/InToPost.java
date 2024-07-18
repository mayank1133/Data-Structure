// 45. Write a program to convert infix notation to postfix notation using stack.(A)

import java.util.*;

public class InToPost {
    
    // Function to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    // Function to determine precedence of operators
    private static int precedence(char operator) {
        switch(operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    
    // Function to convert infix expression to postfix expression
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            
            // If character is operand, add it to postfix
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            // If character is '(', push it to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If character is ')', pop and add to postfix until '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Pop '(' from stack (and discard it)
            }
            // If character is operator
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    // Main method to test the infixToPostfix function
    public static void main(String[] args) {
        String infixExpression = "((A + B) * C - D) / E";
        String postfixExpression = infixToPostfix(infixExpression);
        
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}
        