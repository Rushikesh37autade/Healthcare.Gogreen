package methods;

public class ParameterReturn {
	// Method does change parameter and gives return value
public int case4(int x,int y) {
	System.out.println(x+y);
	return (x+y);
	
}
public static void main(String[] args) {
	ParameterReturn sum=new ParameterReturn();
	sum.case4(30, 40);
	sum.case4(500, 500);
	sum.case4(50, 50);
	sum.case4(20, 50);
}

}
