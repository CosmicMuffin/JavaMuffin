import java.util.Scanner;
public class CelciusToFahrenheit
{
    public static void main()
    {
        double f, c;
        System.out.println("Enter temperature in Celcius, then this program will convert it to Fahrenheit.");
        
        Scanner sr = new Scanner(System.in);
        c = sr.nextDouble();
        
        f = (9.0/5.0)*c+32.0;
        System.out.println("The Fahrenheit Value of "+c+"C is "+f+"F.");
    }
}