import java.util.Scanner;

public class EvenOdd {
	
void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		evenOdd(num);
	}

	void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is even. ");
		}
		
		else
			System.out.println(num+" is odd.");
	}
	
	public static void main(String[] args) {
		
		EvenOdd ev=new EvenOdd();
		ev.input();
		
		
		
	}

}
