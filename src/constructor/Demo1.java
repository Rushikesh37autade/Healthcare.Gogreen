package constructor;

public class Demo1 {
	public static void main(String[] args) {
		Demo D=new Demo();
		D.test();
		
		
		
		System.out.println("=========================================");
		Demo D1=new Demo(20, "abc");
		D1.test();
		
		
		System.out.println("=========================================");
		Demo D2=new Demo("dfghj", 1000);
		D2.test();
	}

}
