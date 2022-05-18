package arraystring;

public class StringOperation {
	public static void main(String[] args) {
		String s="velocity";
		String s1="veloviity";
		String s2= "welcome to home";
		// to calculate length
		System.out.println("The length of string is "+s.length());
		
		
		// convert in to upper case
		System.out.println(" The upper case is "+s.toUpperCase());
		
		// to lower case
		System.out.println(" The upper case is "+s.toLowerCase());
		
		// to character at specific index
		System.out.println("the character of index 4 is "+s.charAt(4));
		
		
		//index of specific index
		System.out.println("index of  i is "+s.indexOf("y"));
		
		//last index
		System.out.println("last index of i is "+s1.lastIndexOf("i"));
		
		// trim to space delete
		System.out.println(" trim s2 is "+s2.trim());
		
		
		
		
		
		
		
		
		
		
		
	}


}
