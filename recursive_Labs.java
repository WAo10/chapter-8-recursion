

/**
 * William Ao
 */
public class recursive_Labs
{
    private static int[] bills = {1, 5, 10, 20, 100};
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

    public static boolean palin(String test)
    {
        System.out.println(test);
        if (test.length()==1 || test.length()==0)
        {
            return true;
        }
        if (test.charAt(0) == test.charAt(test.length()-1))
        {
            return palin(test.substring(1, test.length()-1));
        }

            return false;
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
    
    public static int money(int value, int current)
    {
        if (value==0)
        {
            return 1;
        }
        if (value<0)
        {
            return 0;
        }
        
        int combos = 0;
        
        for(int bill = current; bill<bills.length; bill++)
        {
            combos += money(value-bills[bill], bill);
        }
        
        return combos;
    }
}
