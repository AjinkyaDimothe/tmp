import java.util.Scanner;

public class Prime {
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		prime(num);
	}
	
	void prime(int num)
	{
		int flag=1;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{	
				System.out.println(num+" is prime")	;
				return;
			}
		}
		
			System.out.println(num+ " is not prime");
	}
	
	
	public static void main(String[] args)
	{
		Prime p=new Prime();
		
		p.input();
			
		}
	}


