package objectss;

public class Demo {
	// static method 
	// non static method
	//call them
	public static void test1() {
		System.out.println("this is static method one");
	}
public static void test2() {
	System.out.println("this is static method two");
}


// non static
public  void test3() {
	System.out.println("this is non static method three");
}
public void test4() {
System.out.println("this is non static method four");
}
// calling of static and non static with in class
// static method within main method 
public static void main(String[] args) {
	System.out.println("Main mathod");
	// static method call
	Demo.test1();
	Demo.test2();
	
	// non static method
	Demo d=new Demo();// declration of an object
	
	d.test3();
	d.test4();
	
	
	Demo.test1();
	Demo.test1();
}




}
