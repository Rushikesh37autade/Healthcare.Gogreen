package overloading;

public class Overloadingexamample {
	//method name should be same
	// parameter within that method is different
	
	public void sum() {
		System.out.println("This zero argument method ");
		
	}
	public void sum(int a) {
		System.out.println("this is method with one argument");
	}
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(int a,double b) {
		System.out.println(a+b);
	}
	public void sum(double a,double b,double c) {
		System.out.println(a+b+c);
	}
	// return type
	public double sum(double a,double b) {
		return (a+b);
	}

	// main method
	
public static void main(String[] args) {
	Overloadingexamample oe=new Overloadingexamample();
	oe.sum();
	oe.sum(10);
	oe.sum(10,20);
	oe.sum(10,10.5);
	oe.sum(10.5, 10.5, 10.5);
	
	// return type method
  System.out.println("This is terurn type method "+oe.sum(20.7, 20.5));
	
}
	
}
