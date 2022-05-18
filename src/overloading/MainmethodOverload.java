package overloading;

public class MainmethodOverload {
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		MainmethodOverload.main(10);
		MainmethodOverload.main(10, 20);
	}

}
