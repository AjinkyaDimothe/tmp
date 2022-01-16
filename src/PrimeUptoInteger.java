import java.util.Scanner;

public class PrimeUptoInteger {
	
	  public static void main (String[] args)
	   {		
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter number upto which find prime numbers: ");
	      int num=sc.nextInt();
	      
	    
	      
	      for(int i=1;i<=num;i++)
	      {
	    	  int flag=1;
	    	  
	    	  for(int j=2;j<i;j++)
	    	  {
	    		  if(i%j==0)
	    		  {
	    			  flag=0;
	    			  break;
	    		  }
	    	 
	    	  }
	    	  
	    	  if(flag==1)
	    	  {
	    		  System.out.println(i);
	    	  }
	      }
	     
	   }
	}

		
		