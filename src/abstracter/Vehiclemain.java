package abstracter;

public class Vehiclemain {
	public static void main(String[] args) {
		Twowheeler tw= new Twowheeler();
		System.out.println(tw.getwheeler());    
		System.out.println(tw.getmade());
		System.out.println(tw.getcountry());
		
		System.out.println("====================================");

		Car c=new Car ();
		System.out.println(c.getwheeler());
		System.out.println(c.getmade());
		System.out.println(c.getcountry());
		
		System.out.println("====================================");
		
		Truck T=new Truck();
		System.out.println(T.getwheeler());
		System.out.println(T.getmade());
		System.out.println(T.getcountry());
		
	}
	

}
