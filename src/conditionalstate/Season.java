package conditionalstate;

public class Season {
public static void main(String[] args) {
	// season identification
	String season="summer";
	if (season=="summer") {
		System.out.println("Mar,April,May, June");
	}else if(season=="Rainy") {
		System.out.println("July,August,Sep,Oct");
	}else if (season=="winter") {
		System.out.println("Nov,Dec,Jan,Feb");
	}else {
		System.out.println("Error");
	}
}
}
