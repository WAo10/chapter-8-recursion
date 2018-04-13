

/**
 * Write a description of class palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class palindrome
{
    public static boolean palin_test(String test)
    {
        if (test.charAt(0) == test.charAt(test.length()-1))
        {
            return palin_test(test.substring(1, -2));
        }
        else
        {
            return false;
        }
    }

}
