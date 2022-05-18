package casting;

public class PremitveCasting {
	public static void main(String[] args) {
		// premetive casting -converting information data type to another data type
		//
		// implicit casting(widing Approch)- lower data type to higher data type
		System.out.println("This is implicite casting");
		
		byte b=10;
		System.out.println(b);
		int i=b;
		System.out.println(i);
		long l=i;
		System.out.println(l);
		float f=l;
		System.out.println(f);
		double d=f;
		System.out.println(d);
		
		double dd=b;
		System.out.println(dd);
		
		// explicit casting (narrow approch)
		// - higher data type to lower data type
		// may date loss in this case so we are not using more
		
		System.out.println(" This is explicite casting");
		double x=15.694815789;
		System.out.println(x);
		float ff=(float) x;
		System.out.println(ff);
		long y=(long) ff;
		System.out.println(y);
		short ss=(short) y;
		System.out.println(ss);
		byte bb=(byte) ss;
		System.out.println(bb);
				
		
		
	}

}
