package overriding;

public class Test {
	public static void main(String[] args) {
		Parent p=  new Parent ();
		p.property();
		p.marrige();   // arrange marrige
		
		System.out.println("===========================================");
		
		Child c =new Child();
		c.property();
		c.marrige();   //love marrige	
	}
	

}
