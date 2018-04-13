

/**
 * William Ao
 */
public class fundraising
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
}
