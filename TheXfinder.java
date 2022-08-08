import java.util.*;
public class TheXfinder
{
    public static void main()
    {
        System.out.println("This Program will find the Value of b^3 + c^2 + 3");
        int x, b, c;
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter the Value for b...");
        b = sr.nextInt();
        
        System.out.println("Enter the Value for c...");
        c = sr.nextInt();
        
        x = b*b*b + c*c + 3;
        
        System.out.println("The Value of b^3 + c^2 + 3 is "+x+".");
    }
}
