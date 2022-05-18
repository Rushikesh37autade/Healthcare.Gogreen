package methods;


public class NoParameterReturn {
	// case 2:- Method does not change parameter and gives return value
	int i=30;
	int j=40;
	public int case2() {
		System.out.println(i+j);
		int z=i+j;
		return (z);
	
		
	}
	public static void main(String[] args) {
		
		NoParameterReturn sum=new NoParameterReturn();
		sum.case2();
		
	}

}
