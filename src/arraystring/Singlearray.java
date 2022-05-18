package arraystring;

public class Singlearray {
public static void main(String[] args) {
	//Declaration of array
	
	int a[]=new int[6];
	
	// Add value in array
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	// Check length of array
	
	System.out.println("The length of array is "+a.length);
	
	
	// read one array
	System.out.println(a[2]);
	// read whole array
	for (int i=0; i<a.length; i++)
	System.out.println(a[i]);
	
	
	
	
	
	
}
}
