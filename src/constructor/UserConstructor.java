package constructor;

public class UserConstructor {
int a;
String str;

// constructor name is as same as class name 
// constructor without argument
UserConstructor(){
	System.out.println(" This is zero argument constructor ");
a=10;
str="velocity";
	
}
// constructor with argument
UserConstructor(int c, String d){
	System.out.println(" This is argument constructor ");
	a=c;
	str=d;
	
}
UserConstructor(String d,int c){
	System.out.println( "This is argument constructor" );
	a=c;
	str=d;
}
public void test() {
	System.out.println(a);
	System.out.println(str);
}
}


