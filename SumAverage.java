import java.util.*;
public class SumAverage
{
    public static void main(){
        double num1, num2, num3, sum, avg;
        
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers");
        num1 = sr.nextInt();
        num2 = sr.nextInt();
        num3 = sr.nextInt();
        
        sum = num1 + num2 + num3;
        avg = sum/3;
        
        System.out.println("Sum = "+sum+" and average = "+avg);
        
    }
}
