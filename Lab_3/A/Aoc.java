import java.util.*;
public class Aoc{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Radius");
        double radius=sc.nextDouble();
        double area=radius*radius*3.14;
        System.out.println(area);
    }
}