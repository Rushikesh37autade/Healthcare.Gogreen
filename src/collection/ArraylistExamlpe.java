package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class ArraylistExamlpe {
	public static void main(String[] args) {
		
	
	// declare arraylist
	
	ArrayList al= new ArrayList();
	
	al.add(15);
	al.add("ABC");
	al.add('b');
	al.add(12.7);
	al.add(15);
	al.add('b');
	
	// read whole array
	System.out.println(al);
	
	// size of array
	System.out.println("size of array is "+al.size());
	
	// add element at specific index(shift indexing towards right)
	
	al.add(2, " XYZ");
	System.out.println(al);
	
	// remove element ( shift indexing towards left)
	al.remove(2);
	System.out.println(al);
	
	// contins or not
	
	System.out.println(al.contains(15));  // true
	
	// is empty
	System.out.println(al.isEmpty());  // false
	
	// index of element
	System.out.println(al.indexOf(15));
	
	// lastindex of element
	System.out.println(al.lastIndexOf(15));
	
	// element at specific index
	System.out.println(al.get(3));
	
//	// replacement of element
//	al.set(2, "PQR");
//	System.out.println(al);
	
	
	// retrive of array
	//1.regular for loop
	//2.advance for loop
	// 3. iterator 
	// 4.list iterator
	
//	for (int i=0; i<al.size(); i++) {
//	
//	System.out.println(al.get(i));
//	}
	System.out.println(" advance for loop======================================");
	
	// 2. advance for loop
	for( Object value:al) {
		System.out.println(value);
	}
	
	System.out.println("iterator=============================");
	
	// iterator type
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	// List iterator
	System.out.println("Listiterator===================================");
	
	ListIterator litr= al.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	
	// reverse the arraylist
	
	System.out.println("Reverse==============================");
	Collections.reverse(al);
	System.out.println(al);
	
	
	//reverse out of square braces(for further use of element need to remove out of brackets)
	Iterator r= al.iterator();
while(r.hasNext()) {
	System.out.print(" "+r.next());
}
	
	
	
	
	

	

	
	

	

	
	

	
	
	}
}
