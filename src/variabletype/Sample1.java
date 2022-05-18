package variabletype;

public class Sample1 extends Sample {
	int a=20;
	public void Display() {
		int a=30;
		System.out.println(a);     // local variable 30
		System.out.println(this.a);  // global variable within class 20
		System.out.println(super.a); // Global variable from parrent class
		
		// arthematic operation   
		
		System.out.println(a+this.a);  //20+30
		System.out.println(this.a+super.a); // 20+10
		System.out.println(a+super.a);    // 30+10
		
		
		
	}

}
