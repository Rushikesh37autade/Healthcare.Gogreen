package multilevelinheritance;

public class MasterMain {
	public static void main(String[] args) {
		
		// single inheritance
		// on parent reference you can call only parent class methods
		Parent p= new Parent ();
		p.m1();
		
		
		//on child reference you call parent class as well as child class methods and variables
		
		Child c=new Child();
		c.m1();
		c.m2();
		
		//multilevel inheritance
		GrandSon GS=new GrandSon();
		GS.m1();
		GS.m2();
		GS.m3();
	}

}
