
import java.util.Scanner;

public class DifferenceOfSquares
{
       
       void input()
   	{
   		Scanner sc=new Scanner(System.in);
   		System.out.println("Enter the number: ");
   		int n=sc.nextInt();
   		calDifference(n);
   		
   	}
     
       void calDifference(int n)
       {	  int sum=0,sq=0;
              for(int i=1;i<=n;i++)
              {
                     sum+=i;
              }
              sum = sum*sum;
              for(int i=1;i<=n;i++)
              {
                     sq=sq+(i*i);
              }
             display(sum-sq);
       }
       
      void  display(int diff)
       {
    	   System.out.println("Diffrence is: "+diff);
       }
       public static void main(String[] args)
       {
    	   DifferenceOfSquares d= new DifferenceOfSquares();
           d.input();
       }
}