import java.util.Scanner;

public class Fibonacci {

	
		
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Fibonacci series lenght: ");
			int num=sc.nextInt();
			fib(num);
		}
		
		void fib(int num)
		{
			int a=0,b=1,temp;
			System.out.println("Fibonacci serie is: ");
			
			System.out.println(a);
			System.out.println(b);
			
			 
			if(num==0)
			{
				return;
			}
			
			for(int i=2;i<=num;i++)
			{
				temp=a+b;
				a=b;
				b=temp;
				System.out.println(b);
			}
			
			
		}
		
		public static void main(String[] args) {
			
			
			Fibonacci f=new Fibonacci();
			f.input();
		

	}

}
