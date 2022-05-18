package globlization;

public class Test {
	public static void main(String[] args) {
		// airtel
		System.out.println("Airtel feature=========================");
		Airtel a= new Airtel();
		a.calling();
		a.sms();a.internet();
		
		System.out.println("Jio feature================================");
		Jio j=new Jio();
		j.calling();
		j.sms();
		j.internet();
		
		System.out.println("Idea Feature=================================");
		Idea i=new Idea();
		i.calling();
		i.sms();
		i.internet();
	}


}
