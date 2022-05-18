package methods;

public class RuleToCallMethod {
	static int a=10;
	 int b=20;
	public static void m1 () {
		System.out.println(" This is static method m1");
	}
	public void m2() {
		System.out.println("This is non ststic method m2");
	}

	// rule 3:-Non static methods can access static and non static  members directly
	public void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
		
	}
	
	//Call method 
	
	// Rule 1 :- static methods can access static members directly
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		// Rule 2 :-  static methods can access  Non static members with reference of object only
		
		RuleToCallMethod r1=new RuleToCallMethod();
		System.out.println(r1.b);
		r1.m2();
		
		
		RuleToCallMethod R3=new RuleToCallMethod();
		R3.m3();
		
		
		
	}

	
	
	
	
	
	
	
}
