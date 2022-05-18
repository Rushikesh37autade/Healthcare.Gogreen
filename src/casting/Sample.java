package casting;

public class Sample {
	public static void main(String[] args) {
		// Parent class object
		Demo d=new Demo();  //call 3 methods
		d.car();
		d.home();
		d.cash();   // 100$
		
		
		// Child class object
		System.out.println("==============================");
		Demo1 dd=new Demo1();
		dd.home();
		dd.car();
		dd.cash();   //50$
		dd.bike();
		
		System.out.println("Upcasting==============================");
		
		// up casting
		Demo D= new Demo1();
		D.home();
		D.car();
		D.cash();   // 50$
	}

}
