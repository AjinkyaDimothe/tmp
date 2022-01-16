import java.util.Scanner;





public class SplitStr {
	
	
		String[] split(String a,char b)
		{
			String []str=new String[10];
			String c="";
			int j=0;
			
			for(int i=0;i<a.length();i++)
			{	
				
				if(a.charAt(i)==b)
				{
					str[j]=c;
					j++;
					c="";
					continue;
				}
				
				c=c+a.charAt(i);
				
				if(i==a.length()-1)
				{
					str[j]=c;
				}
				
			}
			
			for(int i=0;i<=j;i++)
			{
				System.out.println(str[i]);
			}
			
			return str;
		}

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter String :");
			
			String a=sc.nextLine();
			
			System.out.println("Enter char where you want to split: ");
			
			char b=sc.next().charAt(0);
			
			//new SplitStr().split(a,b);
			SplitStr str=new SplitStr();
			String []op=str.split(a,b);
			
			System.out.println("Splitted String is: ");
			for(int i=0;i<op.length;i++)
			{
				System.out.println(op[i]);
			}
		}
}