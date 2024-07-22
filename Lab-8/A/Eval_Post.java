// 47. Write a program for evaluation of postfix Expression using Stack
import java.util.*;


public class Eval_Post{
    public static double evaluation(double opd1, double opd2,String oprt)
    {
        if(oprt.equals("+"))
        {
            return opd1 + opd2;
        }   
        else if(oprt.equals("-"))
        {
            return opd1 - opd2;
        }
        else if(oprt.equals("*"))
        {
            return opd1 * opd2;
        }
        else if(oprt.equals("/"))
        {
            return opd1 / opd2;
        }
        else return 0;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        System.out.println("Enter Postfix String to be evaluated:");
        String postfix=sc.next();
        String[] s = postfix.split(",");
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            if(s1.charAt(i) == '+' || s1.charAt(i) == '-' || s1.charAt(i) == '*' || s1.charAt(i) == '/')
            {
                double opd2 = stack.pop();
                double opd1 = stack.pop();
                double ans=stack.push(evaluation(opd1, opd2, s1));
            }
            else
            {
                double num = Double.parseDouble(s1);
                stack.push(num);  // Push the number to the stack.
            }
        }
        double ans1 = stack.pop();  // The final result is at the top of the stack.
        System.out.println(ans1);
    }    
}