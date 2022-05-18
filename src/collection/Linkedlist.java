package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
    	LinkedList ll=new LinkedList();
    	ll.add("ABC");
    	ll.add('B');
    	ll.add("suraj");
    	ll.add('B');
    	ll.add(15);
    	
    	// add element 
    	ll.add(2, 18);
    	System.out.println(ll);
    	
    	// remove
    	ll.remove(2);
    	System.out.println(ll);
    	// get last value
    	System.out.println(ll.getLast());
    	// get first
    	System.out.println(ll.getFirst());
    	
    	// remove first
    	ll.removeFirst();
    	System.out.println(ll);
    	
    	// remove last
    	ll.remove();
    	System.out.println(ll);
    	
    	// add first
    	ll.addFirst("ABC");
    	System.out.println(ll);
    	
    	// add last
    	ll.addLast("ABC");
    	System.out.println(ll);
    	
    	
    	Iterator i=ll.iterator();
    	while (i.hasNext()) {
    		System.out.println(i.next());
    	}
    			
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    			
	
}
	


}
