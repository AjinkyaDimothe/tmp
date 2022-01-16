import java.util.Scanner;

public class Fact {
	public static void main(String[] args)
	{
		int fact=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number for Factorial: ");
		
		int number=sc.nextInt();
		
		
		for(int i=1;i<=number;i++)
		{
			fact=i*fact;
		}
		
		System.out.println("Factorial of "+number +" is: " + fact);
		
	}
}
