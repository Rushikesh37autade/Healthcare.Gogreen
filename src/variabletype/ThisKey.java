package variabletype;

public class ThisKey {
	int a=10;
	public void test() {
		int a=20;
		System.out.println(a);// 20 for Local Variable
		System.out.println(this.a);  //10 for global variable
	}

}
