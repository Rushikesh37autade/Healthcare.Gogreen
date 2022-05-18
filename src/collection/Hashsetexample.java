package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {
	public static void main(String[] args) {
		
	
	// declare hashset
	HashSet h=new HashSet();
	
	h.add("one");
	h.add("Two");
	h.add("three");
	h.add("four");
	// can not store duplicate value
	// accept only one null value
	// Random order of insertion
	// index basis methods not used
	
	
	h.add("three");
	h.add("four");
	
	System.out.println(h);
	//h.add(20);
	h.remove(20);
	System.out.println(h);
	System.out.println(h.isEmpty());
	System.out.println(h.contains(20));
	System.out.println();
	// reading with iterator only
	Iterator itr=h.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}

	
	
	
	}
}
