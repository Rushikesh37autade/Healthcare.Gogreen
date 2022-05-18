package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmapexample {
	public static void main(String[] args) {
		// hashmap declration
		HashMap<Integer,String> h= new HashMap<Integer,String>();
		
		// add with pair i.e value and keyword
		
		h.put(101,"ABC");
		h.put(102,"XYZ");
		h.put(103, "PQR");
		
		System.out.println(h);
		
		h.remove(102);
		System.out.println(h);
		
		h.replace(103, "MNL");
		System.out.println(h);
		
		// read the elemetnt
		for(Entry<Integer, String> m:h.entrySet()) {
			System.out.println("key:- "+m.getKey()+" Value:- "+m.getValue());
		}
		
	}

}
