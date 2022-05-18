package hirerachicalinheritance;

public class LoanMain {
	public static void main(String[] args) {
		// user for Home loan
		HLoan H=new HLoan();
		H.username("ABC PQR XYZ");
		H.address("asdfgh");
		H.accno(123456);
		H.intrestrate();
		System.out.println("===============================================");
		
		// User for vehicle loan
		VLoan V=new VLoan ();
		V.username("ABC");
		V.address("mumbai");
		V.accno(789456123);
		V.fourwheeler();
		
		System.out.println("===================================================");
		
		
		
		//user for personal loan
		PLoan p=new PLoan();
		p.username("REQ");
		p.address("Pune");
		p.accno(12345);
		p.bankstate();
	
		
		
		
		
		
		
		
	}
}
