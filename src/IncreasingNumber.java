
import java.util.Scanner;
public class IncreasingNumber
{
       public boolean checkNumber(int num)
       {
              boolean flag=false;
              String str = String.valueOf(num);
              int l = str.length();
              for(int i=0;i<l-1;i++)
              {
                     if(str.charAt(i)<=str.charAt(i+1) )
                           flag=true;
                     else
                           flag=false;
              }
              return flag;
       }
       public static void main(String[] ar)
       {
    	   IncreasingNumber p = new IncreasingNumber();
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a number:");
              int num = s.nextInt();
              System.out.println("increasing number: "+p.checkNumber(num));
       }
}