package methods;

public class ParameterNoReturm {
	// case 3:- This method give changes in parameter but not give value return
	public void case3(int x, int y) {
		System.out.println(x+y);
	}
public static void main(String[] args) {
	ParameterNoReturm case3=new ParameterNoReturm();
	case3.case3(30, 40);
}
}
