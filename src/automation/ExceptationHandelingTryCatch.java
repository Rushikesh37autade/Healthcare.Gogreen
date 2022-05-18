package automation;

public class ExceptationHandelingTryCatch {
	public static void main(String[] args) {
		
		// arithemetic exception
//		System.out.println("Start of programm");
//		try {
//		int a=100;
//		System.out.println(a/0);
//	}catch(Exception e) {
//		e.printStackTrace();
//		System.out.println("catch loop executed");
//	}
//		System.out.println("end of programm");

		// example 2 null pointer exception 
//		String s=null;
//		try{System.out.println(s.length());
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Catch block");
//		}
//		finally {
//			System.out.println("finally block");
//		}
		
		// outofbound exception
		
//		int a[]=new int[5];
//		try {
//			System.out.println(a[6]);
//			System.out.println("try block");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Catch block");
//		}
	
		
		//numberformat exception
		String s="1583sdfg";
		try {
			int i=Integer.parseInt(s);
			System.out.println(i);
			System.out.println("try block");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("catch block");
		}
		
		
}
}