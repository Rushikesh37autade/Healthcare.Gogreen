package overloading;

public class ConstructorOverload {
	//constructors
	ConstructorOverload(){
		System.out.println("Zero argument constructor");
	}
	ConstructorOverload(int a){
		System.out.println("Zero argument constructor with one argument");
	}
	ConstructorOverload(int a,int b){
		System.out.println("Zero argument constructor with two argument int int");
	}
	ConstructorOverload(int a,double b){
		System.out.println("Zero argument constructor with two argument int-double");
	}
	
	// main method
	public static void main(String[] args) {
		ConstructorOverload c=new ConstructorOverload();
		ConstructorOverload c1=new ConstructorOverload(10);
		ConstructorOverload c2=new ConstructorOverload(5, 5.5);
		ConstructorOverload c3= new ConstructorOverload(10, 10);
				
		
	}
	
	
	
}
