
public class TimerUsingThreds extends Thread{
	
	public static void main(String[] args) {
		
		TimerUsingThreds timer=new TimerUsingThreds();
		timer.setName("Timer");
		timer.start();
	}
	
	public void run()
	{
		try {
			System.out.println(Thread.currentThread().getName()+"Start Timer");
			for(int i=0;i<101;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
		}catch(InterruptedException e){
			System.out.println("Timer not set....");
		}
	}
}
