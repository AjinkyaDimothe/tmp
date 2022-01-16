import java.util.Scanner;
import java.lang.*;

public class PalindromeStr {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter String");
			
			String a=sc.nextLine();
			
			String b="";
			
			for(int i=a.length()-1;i>=0;i--)
			{
				b=b+a.charAt(i);
			}
			
			System.out.println(b);
			
			if(a.equalsIgnoreCase(b))
			{
				System.out.println("String is palindrome......");
			}
			
			else
				System.out.println("String is not Palindrome......");
		
			String []c=a.split(" ");
			
			for(String s:c)
			{
				System.out.println(s);
			}
		}
		
		
}
