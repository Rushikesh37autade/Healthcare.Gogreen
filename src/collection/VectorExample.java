package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// declaration of vectorlist
		Vector v=new Vector();
		v.add(15);
		v.add("Rushi");
		v.add('b');
		v.add(15);
		System.out.println(v);
		//add element
		v.add(2, "XYZ");
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		System.out.println("====================");
		v.set(1, "rushi");
	System.out.println(v);
	System.out.println(v.contains(15));
	System.out.println(v.isEmpty());
	System.out.println(v.size());
	System.out.println(v.capacity());
	System.out.println("==============================");
	System.out.println(v.indexOf(15));
	System.out.println(v.lastIndexOf(15));
	System.out.println(v.get(3));
    System.out.println("enum===============================");
    // ennumration
    Enumeration en= v.elements();
    while(en.hasMoreElements()) {
    	System.out.println(en.nextElement());
    }
System.out.println("======================================================");


	// iterator 
	Iterator itr=v.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		// assending order
	Vector vr=new Vector();
	vr.add(10);
	vr.add(20);
	vr.add(25);
	vr.add(30);
	
	// sorting 
	Collections.sort(vr);
	System.out.println(vr);
	Collections.sort(vr,Collections.reverseOrder());
	System.out.println(vr);
	
	
	
	
	
	}
	

}
