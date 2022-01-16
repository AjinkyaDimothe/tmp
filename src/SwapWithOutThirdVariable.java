import java.util.Scanner;

public class SwapWithOutThirdVariable {
	
	
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First number  ");
			int num1=sc.nextInt();
			
			System.out.println("Enter Second number  ");
			int num2=sc.nextInt();
			
			swap(num1,num2);
		}
		
		void swap(int num1,int num2)
		{
			
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
			display( num1,num2);
		}
	
		void display(int num1,int num2)
		{
			System.out.println("After Swapping");
			System.out.println("Fist number: "+num1);
			System.out.println("Second number: "+num2);
		}
		
		public static void main(String[] args)
		{
			SwapWithOutThirdVariable s=new SwapWithOutThirdVariable();
			s.input();
		}

}
