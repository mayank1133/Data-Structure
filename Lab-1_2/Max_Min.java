import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int a = sc.nextInt();
        int []b = sc.nextInt[a];
        for (int i = 0; i < a; i++) 
        {
          System.out.println("enter element " +i + "  " );
          b[i] = sc.nextInt();
    }
    int maxindex=0;
    int minindex=0;
    for(int i = 0; i <a; i++)
    {
        if(b[i]>b[maxindex])
        {
            System.out.println("max index " +maxindex);
        }
        if(b[i]<b[minindex])
        {
            System.out.println("min index " +minindex);
        }
    }
}
}
