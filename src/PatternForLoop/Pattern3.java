package PatternForLoop;

public class Pattern3 {
	public static void main(String[] args) {
		
	//pattern3
	//*****
	//****
	//***
	//**
	//*
for(int i=1; i<=5; i++) {
	for (int j=5; j>=i; j--) {
		System.out.print("*");
	}
	System.out.println("");
}
}
}