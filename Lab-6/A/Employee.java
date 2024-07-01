
import java.util.Scanner;

class Employee_Detail{
    double Employee_ID;
    String Name;
    String Designation;
    double Salary;
    public void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        emp1.Employee_ID=sc.nextDouble();
        System.out.println("Enter Employee Name:");
        emp1.Name=sc.next();
        System.out.println("Enter Employee Designation:");
        emp1.Designation=sc.next();
        System.out.println("Enter Employee Salary:");
        emp1.Salary=sc.nextDouble();
    }
    public void printDetails()
    {
        System.out.println("Employee ID:"+emp1.Employee_ID);
        System.out.println("Name:"+emp1.Name);
        System.out.println("Designation:"+emp1.Designation);
        System.out.println("Salary:"+emp1.Salary);
    }

}

public class Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getDetails();
        e.printDetails();
    }
}
