package automation;

import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		Date d=new Date();
		String name = d.toString().replace(" ", "_").replace(":", "_");
		System.out.println(name+".jpg");
		
	}

}
