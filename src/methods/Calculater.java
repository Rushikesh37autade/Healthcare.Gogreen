package methods;

public class Calculater {
	public int getsum(int x, int y) {
		return x+y;
	
}
	public int getsub(int x, int y) {
		return x-y;
	
}
	public int getmulti(int x, int y) {
		return x*y;
	
}
	public int getdiv(int x, int y) {
		return x/y;
	
}
	public static void main(String[] args) {
		Calculater cal=new Calculater();
		System.out.println(cal.getsum(10, 10));
		System.out.println(cal.getsub(10, 10));
		System.out.println(cal.getmulti(10, 2));
		System.out.println(cal.getdiv(10, 2));
		
	}
	
}