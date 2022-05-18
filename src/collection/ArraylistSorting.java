package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistSorting { 
	public static void main(String[] args) {
	
	//array list sorting	
	ArrayList<String> v=new ArrayList<String>();
	v.add("BMB");
	v.add("Mersadies");
	v.add("Active");
	v.add("Honda");
	v.add("Audi");
	v.add("Hundai");
	v.add("Hector");
	
	// acending sorting
	Collections.sort(v);
	System.out.println(v);
	Iterator it=v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("==============================");
	
	// decending order
Collections.sort(v,Collections.reverseOrder());
System.out.println(v);


// integer sorting 
ArrayList n=new ArrayList();

n.add(20);
n.add(50);
n.add(25);
n.add(2);
n.add(10);

System.out.println(n);

// sorting by accending order
Collections.sort(n);
System.out.println(n);

Iterator i= n.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
// decending order
Collections.sort(n,Collections.reverseOrder());
System.out.println(n);
System.out.println("out of bracket===================");
Iterator ir= n.iterator();
while(ir.hasNext()) {
	System.out.println(ir.next());
}









	
	
}
}