package methods;

public class NoParameterNdReturn {
	int i =30;
	int j=40;
	// Case 1:- does not give parameter value and not return value
	public void case1() {
		System.out.println("sum of i and j is "+(i+j));
	
	}
	
	// call the method with in class 
	public static void main(String[] args) {
		NoParameterNdReturn sum=new NoParameterNdReturn();
		sum.case1();
		
	}

}
