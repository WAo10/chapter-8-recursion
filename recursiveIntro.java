

/**
 * Write a description of class recursiveIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recursiveIntro
{
    public static void main(String[] args)
    {
        methodOne(10);
        methodTwo(10);
    }
    public static void methodOne(int n)
    {
        System.out.println(n);
        if (n>0)
        {
            methodOne(n-1);
        }
    }
    public static void methodTwo(int n)
    {
        System.out.println(0);
        if (n>0)
        {
            methodTwo(n-(n-1));
        }
    }
    public static String methodThree(String string)
    {
        String reverse = new String(string);
        
        return reverse;
    }
    public static boolean methodFour(int num)
    {
        return true;
    }
    public static int methodFive()
    {
        return 5;
    }

}
