package arraystring;

public class MultiDimention {
	public static void main(String[] args) {
		// Declaration of array 
		int a[][]=new int [3][2];
		
		//insert values
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		
		// find out the size
		System.out.println("The size of Rows is "+a.length);
System.out.println("size of coloumn is "+a[0].length);
		
//Program to read array
for (int i=0; i<a.length; i++) {
	for (int j=0; j<a[i].length; j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
		
	}

}
