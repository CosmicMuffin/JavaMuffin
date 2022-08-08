import java.util.*;
public class Average
{
    public static void main()
    {
        double num1, num2, num3, avg, sum; 
        
        Scanner sr = new Scanner(System.in); 
        
        System.out.println("Enter 3 Numbers");
        num1 = sr.nextDouble();
        num2 = sr.nextDouble();
        num3 = sr.nextDouble();
        
        sum = num1 + num2 + num3;
        avg = sum/3.0;
        
        System.out.println("The Sum is "+sum+" and the Average is "+avg+".");
    }
}
