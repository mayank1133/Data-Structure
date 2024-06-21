import java.util.*;
public class Fact{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int ans=1;
        if(n==1){
            System.out.println("1");
        }
        else{
            for(int i=1;i<=n;i++){
                
                ans=ans*i;
            }

        }
       System.out.println(ans); 
    }
}