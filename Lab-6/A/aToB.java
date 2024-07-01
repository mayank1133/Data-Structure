
import java.util.Scanner;

public class NumberSwap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Integer 2:");
        int num2=sc.nextInt();
        swap(num1,num2);
    }
}
    public class AtoB{
        public  void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Integer 1="+a);
        System.out.println("Integer 2="+b);
    }
}
