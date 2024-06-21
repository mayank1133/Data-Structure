import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter last number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        double average;
        average=sum/n;
        System.out.println(average);
    }
}
