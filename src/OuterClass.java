
public class OuterClass {
	static int a=10;
	int b=20;

	class Innerclass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		
		OuterClass o= new OuterClass();
		System.out.println(o.b);
	}

}
}
