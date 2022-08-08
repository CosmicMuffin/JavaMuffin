import java.util.*;
public class Calculator
{
   public static void main()
   {
       int a,b,rem;
       double sum,diff,prod,quo;
       Scanner sr=new Scanner(System.in);
       
       System.out.println("Enter the first number in the text box below...");            
       a=sr.nextInt();
       
       System.out.println("Enter the second number in the text box below...");
       b=sr.nextInt();
       
       sum = a+b;
       diff = a-b;
       prod=a*b;
       quo=a/b;
       rem=a%b;
       
       System.out.println("The Sum of "+a+" and "+b+" is "+sum+".");
       System.out.println("The Difference of "+a+" and "+b+" is "+diff+".");
       System.out.println("The Product of "+a+" and "+b+" is "+prod+".");
       System.out.println("The Quotient of "+a+" and "+b+" is "+quo+".");
       System.out.println("The Reminder of "+a+" and "+b+" is "+rem+".");
       System.out.println("Thank you for using this Application!");
   }
}
