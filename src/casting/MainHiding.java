package casting;

public class MainHiding {
	public static void main(String[] args) {
		System.out.println("Parent class object========================");
		Parent p=new Parent();
		p.m1();
		Parent.m2();
		System.out.println(" chid class object============================");
		Child c= new Child();
		c.m1();
		Child.m2();
		System.out.println("up casting=========================");
		Parent pp= new Child();
		pp.m1();
		Parent.m2();   //method hiding
		
	}
}
