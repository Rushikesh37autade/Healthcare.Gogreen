package VaribleinitialTyoe;

public class Student {
	// initialization of variable
	
	
	
	// declration of variable useing class
	int rollnumber;
	String Name;
	char Grade;
	
   // use of method 
	// dose not return any value and allow to change parameters
	
	public void getstdDetail(int rn, String sn, char sg) {
		rollnumber=rn;
		Name=sn;
		Grade=sg;
	}

	// use  constructor
	// argument constructor
	
	Student(int RN,String SN,char SG){
		rollnumber=RN;
		Name=SN;
		Grade=SG;
	}
	
	
	
	
	
	
	
	
	public void display() {
		System.out.println("The student roll number is "+rollnumber);
		System.out.println("The student  name is "+Name);
		System.out.println("The student roll grade is "+Grade);
		
	}
	
	
	
	
	
	

}
