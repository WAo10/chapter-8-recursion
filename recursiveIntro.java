

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
   
         // nums(100);
         //nums2(100);
         revString("waleed");
    //       int n = 73;
    //       int x = prime(n,2);
    //        if(x == 1)
    //         {
    //             System.out.println(n+" is prime number");
    //         }
    //         else
    //         {
    //             System.out.println(n+" is not prime number");
    //         }
    //System.out.print(fibb(12));
  }
  
  public static void nums(int n)
  {
      if (n==0)
      System.out.println("0");
      else
      {
          System.out.println(n);
          nums(n-1);    
      }
  }

  public static void nums2(int n)
   {
       if (n==0)
       System.out.println("0");
       else
       {
           nums(n-1);   
           System.out.println(n);
       }
   }
  
  public static String revString(String b)
  {
      String rev = "";
     if (b.length() < 0)
     {
         return "";
        }
        else
        {
            return (b.charAt(b.length()-1)) + revString(b.substring(0, b.length()-1));
        }
     
   }
  
  static int prime(int y,int i)
   {
        if(i < y)
       {
           if(y % i != 0) 
           {
               return(prime(y, ++i));
           } 
           else
           {
               return 0; 
           }
       }
       return 1;
   }
   
  static int fibb(int n)
  {
      if(n == 0)
       return 0;
      else if(n == 1)
       return 1;
      else
      {
       return fibb(n - 1) + fibb(n - 2);
      }
       
  }

}
