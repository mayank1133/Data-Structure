import java.util.Scanner;
public class Insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ent Length");
        int n=sc.nextInt();
        System.out.println("Ent index");
        int index=sc.nextInt();
        System.out.println("Ent number you want to add");
        int number=sc.nextInt();
        int [] pre=new int[n];
        int [] post=new int[n+1];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("enter arr["+i+"]:");   
            pre[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<post.length;i++,j++)
        {
            if(index==i)
            {
                post[i]=number;
                j--;
            }
            else
            
            {
                post[i]=pre[j];
            }
        }
        for(int i=0;i<post.length+1;i++)
        {
            System.out.println("arr["+i+"];"+post[i]);
        }
    }
}