package interfaces;

public class PQR implements ABC {

	
	public void m1() {
		System.out.println(a);
		
	}

	
	public void m2() {
		System.out.println(a+20);
		
	}

	
	public void m3(int x, int y) {
		System.out.println("Addition of x and y is "+(x+y));
		
	}

	
	public int m4(int x, int y) {
		return (x-y);
	}
	

}
