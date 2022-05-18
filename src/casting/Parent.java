package casting;

public class Parent {
	// Method hiding
	// non static method
	public void m1() {
		System.out.println("This is method m1 from parent class");
	}
	
	// static method
	public static void m2() {
		System.out.println("This is method m2 from parent class");
	}

}
