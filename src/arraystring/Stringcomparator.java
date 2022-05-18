package arraystring;

public class Stringcomparator {
	//String comparator
public static void main(String[] args) {
	

    String s="velocity";
    String s1="VELOCITY";
    String s2="veloc";
    
    		// equal to (case sensitive
    System.out.println(s.equals(s1));// false
    // equalsignorcase
    System.out.println(s.equalsIgnoreCase(s1));// true
    		
    //contains(case sensitive)
    System.out.println(s.contains(s2));// true
    
    
    //empty
    System.out.println(s.isEmpty());//false
    
    // start from (case sensitive)
    System.out.println(s.startsWith(s2));// True
    
    // ends with
    System.out.println(s.endsWith("y"));//true
    
    // concats (merg to string)
    
    String s3="Rushikesh";
    String s4= "Autade";
    
    System.out.println(s3.concat(" ") .concat(s4));
    
    
    //replace
    String s5=" java is easy langauge";
    System.out.println(s5.replace("java", "python"));
    
    // substring with start index only
    System.out.println(s3.substring(5));
    // substring with start and end index
    
    System.out.println(s3.substring(0, 5));
    
    
    // split
    String s7 ="i am on work";
    String words[]=s7.split(" ");
    
    
    for(int i=0; i<words.length; i++) {
    	System.out.print(words[i]+" ");
    

    
    
    
    }
  
    
}
}
