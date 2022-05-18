package pattern8To;

public class Pattern21 {
	public static void main(String[] args) {
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		int b=0;
		
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) {
				b=b+1;
				System.out.print(b+" ");
			}
			System.out.println("-");
		}
	}

}
