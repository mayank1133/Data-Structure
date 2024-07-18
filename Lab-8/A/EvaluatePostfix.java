// A 47. Write a program for evaluation of postfix Expression using Stack.
import java.util.*;
public class EvaluatePostfix {
    
    // Function to evaluate postfix expression
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through each character in the postfix expression
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            
            // If character is operand, push it onto stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to int
            } else {
                // Character is operator, pop top two elements from stack and perform operation
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                switch(c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        
        // Result will be the only element left in the stack
        return stack.pop();
    }
    
    // Main method to test the evaluatePostfix function
    public static void main(String[] args) {
        String postfixExpression = "23*54*+9-";
        int result = evaluatePostfix(postfixExpression);
        
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Result of Evaluation: " + result);
    }
}
