package collection;

import java.util.TreeSet;

public class Treesetexample {
	public static void main(String[] args) {
		
	
	// declare of treeset
	// output in decending order
		// not accepet null value
		
		
		TreeSet tr=new TreeSet();
		tr.add(100);
		tr.add(10);
		tr.add(20);
		tr.add('b');
		System.out.println(tr);
		// first and last value
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		// get  higher and lower value of specific element
		int i=20;
		System.out.println(tr.higher(i));
		System.out.println(tr.lower(i));
		// remove first and last
		
		tr.pollFirst();
		System.out.println(tr);
		
		tr.pollLast();
		System.out.println(tr);
		

}
}