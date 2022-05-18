package methods;

public class StaticKey {
	int empid;
	String empname;
	static int empdept;
	
	public void Display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empdept);
		
		
	}
	public static void main(String[] args) {
		StaticKey emp1=new StaticKey();
		emp1.empid=100;
		emp1.empname="abc";
		emp1.empdept=8;
		emp1.Display();
		System.out.println("=========================================");
		StaticKey emp2=new StaticKey();
		emp2.empid=101;
		emp2.empname="pqr";

		emp2.Display();
		
	}

}
