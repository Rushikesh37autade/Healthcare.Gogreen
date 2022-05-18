package finalkey;

public class Finalkey {
	 int speed=20;
	final int speed1=50; // we can not change the value of variable if we use final key word

	public static void main(String[] args) {

		Finalkey F=new Finalkey();
		F.speed=40;
		
		
		System.out.println(F.speed);
		System.out.println(F.speed1);
	}

}
