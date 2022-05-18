package overriding;

public class MainBank {
	public static void main(String[] args) {
		
	
	RBI r= new RBI();
	System.out.println(r.rateofintrest());
	
	SBI s=new SBI();
	System.out.println(s.rateofintrest());
	
	HDFC h= new HDFC();
	System.out.println(h.rateofintrest());
	
	Icici i= new Icici ();
	System.out.println(i.rateofintrest());
	
	

}}
