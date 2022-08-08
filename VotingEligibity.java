import java.util.*;
public class VotingEligibity
{
    public static void main()
    {
        int age, agewt;
        
        Scanner sr = new Scanner(System.in);
        
        System.out.println("Enter your age");
        
        age = sr.nextInt();
        agewt = 18 - age;
        
        if (age >= 18)
        {
            System.out.println("You're eligible to Vote in India.");
        }
        else if(age == 17)
        {
            System.out.println("You're not elegible to Vote in India. "+"You can start voting after "+agewt+" year.");
        }
        else
        {
            System.out.println("You're not elegible to Vote in India. "+"You can start voting after "+agewt+" years.");
        }
    }
}
