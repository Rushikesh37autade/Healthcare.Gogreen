package hirerachicalinheritance;

public class Mastermain {
	public static void main(String[] args) {
		
		// Grandson class object acquire only parent class property
		Grandson G=new Grandson ();
		G.m1();
		G.m3();
		
		System.out.println("=====================================");
		
		// child class object acquire only parent class methods
		// there is no relation between child class and grandson class
		Child c=new Child ();
		c.m1();
		c.m2();
	}

}
