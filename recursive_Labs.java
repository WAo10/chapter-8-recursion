

/**
 * William Ao
 */
public class recursive_Labs
{
    public static int collect(int monetaryGoal)
    {
       if (monetaryGoal>=10)
       {
           return 1+collect(monetaryGoal/10)+collect(monetaryGoal/10)+
           collect(monetaryGoal/10)+collect(monetaryGoal/10)+
           collect(monetaryGoal/10)+collect(monetaryGoal/10)+
           collect(monetaryGoal/10)+collect(monetaryGoal/10)
           +collect(monetaryGoal/10)+collect(monetaryGoal/10);
        }
        else
        {
            return 1;
        }
    }

    public static boolean palin_test(String test)
    {
        if (test.length()==1)
        {
            return true;
        }
        else if (test.charAt(0) == test.length()-1)
        {
            return palin_test(test.substring(1, test.length()-1));
        }
        else
        {
            return false;
        }
    }
    
    public static int gcd(int num1, int num2)
    {
        if ((num2<=num1)&& (num1%num2==0))
        {
            return num2;
        }
        else if (num1<num2)
        {
            return gcd(num2, num1);
        }
        else
        {
            return gcd(num2, num1%num2);
        }
    }
    
    
}
