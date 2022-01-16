import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		String color=sc.nextLine();
		
		switch(color)
		{
		
		case "red":
			System.out.println("STOP");
			break;
			
		case "yellow":
			System.out.println("READY");
			break;
			
		case "green":
			System.out.println("GO");
			break;
			
		default:
			System.out.println("Wrong Button");
		}
		
	}

}
