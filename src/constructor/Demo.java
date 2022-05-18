package constructor;

public class Demo {
	// Declration
	int a;
	String str;
	Demo(){
		System.out.println("This is Zero agrument constructor ");
	
	// initialization
		a=10;
		str="Velocity";
		
	}	
		Demo(int c,String d ){
		System.out.println("This is with agrument constructor" );
	
		a=c;
		str=d;
		}
		Demo(String d,int c){
			
			System.out.println("This in with agrument constructor" );
			
			a=c;
			str=d;
			
		}
	public void test() {
		System.out.println(a);
		System.out.println(str);
	}
}
