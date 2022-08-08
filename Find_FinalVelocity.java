import java.util.*;
public class Find_FinalVelocity
{
    public static void main()
    {
        double v, u, a, t;
        
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter Initial Velocity, Acceleration and Time in the same order.");
        u = sr.nextDouble();
        a = sr.nextDouble();
        t = sr.nextDouble();
        
        v = u + a*t;
        
        System.out.println("The Final Velocity is "+v+".");
    }
}
