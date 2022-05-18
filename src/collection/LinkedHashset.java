package collection;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {
		
	
	    // declare linked hashset
		// order of insertation on index basis
		// can use all index based methods
		// not accept duplicate element
		
		
	LinkedHashSet lk=new LinkedHashSet();
	lk.add(15);
	lk.add(20);
	lk.add('b');
	lk.add("ABC");
	lk.add(20);
	lk.add(20);
	lk.add('b');
	
	System.out.println(lk);
	lk.add(19);
	
	System.out.println(lk.contains(20));
	System.out.println(lk.isEmpty());
	lk.remove(20);
	System.out.println(lk);
	Iterator itr = lk.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	}
	
	}

