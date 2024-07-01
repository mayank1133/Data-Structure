import java.util.Scanner;

public class lab_6_35 {
    public static void main(String[] args) {
       student_details [] s = new student_details[5];
       for(int i =0; i<5;i++){
            s[i]=new student_details();
            s[i].getDetails();
            s[i].printDetails();

       }

    }
}
class student_details{
    double eno;
    String name;
    double cpi;
public void getDetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter eno");
    eno= sc.nextDouble();
    System.out.println("enter name");
    name = sc.next();
    System.out.println("enter CPI");
    cpi = sc.nextDouble();
}
public void printDetails(){
    System.out.println("employeee eno is is "+eno);
    System.out.println("employeee name is "+name);
    System.out.println("employee cpi is "+cpi);
    
}
}