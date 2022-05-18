package pattern8To;

public class Pattern16 {
	public static void main(String[] args) {
		//11111
		//2222-
		//333--
		//44---
		//5----
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print(i);
			}
			for (int k=1; k<=i; k++) {
				System.out.print("-");
			}
			System.out.println("");
		}
	}

}
