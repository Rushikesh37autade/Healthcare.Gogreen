package arraystring;

public class ReverseString {
	public static void main(String[] args) {
		String s="Velocity_123";
		String s1="";
	
		//Read reverse array
		for (int i=s.length()-1; i>=0; i--) {
			s1=s1+s.charAt(i);
		}
			System.out.println(s1);
		
		// String is palindrom or not
			
			if (s.equals(s1)) {
				System.out.println("The given string is palindrom  ");
			}
			else {System.out.println("The given string not is palindrom");
	}

}
}