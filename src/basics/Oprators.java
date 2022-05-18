package basics;

public class Oprators {
public static void main(String[] args) {
	//arithmatic operators(-,+,*,/,%)
	
	int a=10;
	int b=20;
	
	System.out.println("sum of a & b is "+(a+b));
	System.out.println("diff bet a&b is "+(a-b));
	System.out.println("mult of a & b is  "+(a*b));
	System.out.println("dive of a& b is "+(b/a));
	System.out.println("mod of a&b is "+(b%a));
	
	
	//relation (comparasion operators
	System.out.println(a==b);  //false
	System.out.println(a>b);  //false
	System.out.println(a>=b);  //false
	System.out.println(a<b);  //true
	System.out.println(a<=b);  //true
	System.out.println(a!=b);  //true
	
	 
	//logic operators
	
	boolean x= true;
	boolean y= false;
	System.out.println(x&&y);  //false
	System.out.println(x||y);  //true
	System.out.println(!y);    //true
	System.out.println(!x);    // false
	
	//incrimental and decrimental
	
	a=10;
	a++;  //incrimental  a+1;
	b--;  //decrimental    b-1;
	
	System.out.println(a);
	System.out.println(b);
	
	//assignment operator
	
int d=50;
System.out.println(d);
	
	
	
			
	
	  
	
	
	
}
}
