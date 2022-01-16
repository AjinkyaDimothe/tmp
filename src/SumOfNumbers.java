import java.util.Scanner;

public class SumOfNumbers {
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which addition to be done:  ");
		int num=sc.nextInt();
		sum(num);
		
	}
	
	void sum(int num)
	{
		int add=0;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 || i%5==0)
			{
				add=add+i;
			}
		}
		
		display(add);
	}

	void display(int add)
	{
		System.out.println("Addtion of numbers which are divisible by 3 or 5 : "+add);
	}
	public static void main(String[] args) {
		
		SumOfNumbers s=new SumOfNumbers();
		s.input();

	}

}
