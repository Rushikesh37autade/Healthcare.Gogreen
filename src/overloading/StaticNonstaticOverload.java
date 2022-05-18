package overloading;

public class StaticNonstaticOverload {
	//Static method
	public static void add() {
		System.out.println("this is zero argument method ");
	
	}
	public static void add(int a) {
		System.out.println("this is one argument method");
	}
	public static void add(int a,int b) {
		System.out.println("This is two argument method int-int");
	}
	public static void add(int a,double b) {
		System.out.println("This is two argument method int-double");
	}
	// non static method
	
	
	public  void add(int a,int b, int c) {
		System.out.println("This is three argument method int-int-int");
	}
	public  void add(double a,double b, double c) {
		System.out.println("This is three argument method double-D-D");
	}
	
	// main method
	public static void main(String[] args) {
		// call static method
		StaticNonstaticOverload.add();
		StaticNonstaticOverload.add(10);
		StaticNonstaticOverload.add(10, 10.5);
		StaticNonstaticOverload.add(10,5);
		
		
		System.out.println("==================================================");
		
		// call non static method 
		StaticNonstaticOverload s=new StaticNonstaticOverload();
		s.add(2.5, 2.5, 2.5);
		s.add(5, 5, 5);
	}
	
	
	
	
	
	
	
	
	
}
