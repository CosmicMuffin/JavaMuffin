import java.util.*;
public class EvenOrOdd
{
    public static void main()
    {
        int num;
        
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        num = sr.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println("The Number "+num+" is even");
        }
        else
        {
            System.out.println("The Number "+num+" is odd");
        }
    }
}
