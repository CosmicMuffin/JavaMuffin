import java.util.*;
public class AreaTriangle
{
    public static void main()
    {
        double area, b, h;
        
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter the Base below...");
        b = sr.nextDouble();
        
        System.out.println("Enter the Height below...");
        h = sr.nextDouble();
        
        area = b*h*1.0/2.0;
        
        System.out.println("The Area of a triangle with base "+b+" and height "+h+" is "+area+".");
    }
}
