import java.util.*;
public class ProfitOrLoss
{
    public static void main()
    {
        Scanner sr = new Scanner(System.in);
        
        double cp, sp, pl, p, l;
        
        System.out.println("Enter the Cost Price");
        cp = sr.nextDouble();
        
        System.out.println("Enter the Selling Price");
        sp = sr.nextDouble();
        
        pl = sp - cp;
        
        
        
        if(pl == 0)
        {
            System.out.println("There is no profit or loss");
        }
        else if(pl > 0)
        {
            p = pl;
            System.out.println("You Have Gained a profit of Rs."+p);
        }
        else
        {
            l = -pl;
            System.out.println("You Have lost Rs."+l);
        }
    }
}
