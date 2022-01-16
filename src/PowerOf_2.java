import java.util.Scanner;

public class PowerOf_2 {

	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		isPowerOf_2(num);
		
	}
	
	void isPowerOf_2(int num)
	{
		int flag=0;
		int temp=num;
		if(num==0)
		{
			System.out.println(num+" is not power of 2");
			return;
		}
		
		while(num!=1)
		{
			if(num%2!=0)
			{
				System.out.println(num+" is not power of 2");
				return;
			}
			
			num=num/2;
		}
		System.out.println(temp+" is power of 2");
		
		
	}
	public static void main(String[] args) {
		
		PowerOf_2 p=new PowerOf_2();
		p.input();
		
	}
}
