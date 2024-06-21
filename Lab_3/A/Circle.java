import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter what would ypu like to enter(radius/Diameter) of Circle");
        String property=sc.next();
        if(property.equalsIgnoreCase("radius"))
        {
            System.out.println("Enter radius:");
            double radius=sc.nextDouble();
            double area=3.14*radius*radius;
            System.out.println("Area of Circle:"+area);
        }
        if(property.equalsIgnoreCase("diameter"))
        {
            System.out.println("Enter diameter:");
            double diameter=sc.nextDouble();
            double area=3.14*(diameter/2)*(diameter/2);
            System.out.println("area of circle:"+area);
        }
    }
}
