import java.util.Scanner;
public class Arry{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int m=sc.nextInt();
        int []n=new int[m];
        for(int i=0;i<m;i++)
        {
            n[i]=sc.nextInt();
        }
        for (int j = 0; j < m; j++) 
        {
            System.out.println(n[j]);
        }
    }
}