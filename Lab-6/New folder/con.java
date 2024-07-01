
// Create methods to convert temperature from Celsius to Fahrenhit and vice
// versa. Take temperature input from user and call the appropriate conversion
method.public class Conversion{
    public static void main(String[] args) 
    {
        Conversion c = new Conversion();
        c.convert();
    }
}
public class con{
    public void convert(double)
    {
        double c=0;
        double f=0;
        System.out.println("Enter temperature in Celsius");
        c=sc.nextDouble();
        f=(c*9/5)+32;
        System.out.println(f);
    }
}