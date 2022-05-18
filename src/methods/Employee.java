package methods;

public class Employee {
	// inition of variable using ststic method
int empid;
String empname;
double empsal;
String empjob;
char empgrade;

//Use of variable 
public void display() {
	System.out.println("Employee id is "+empid);
	System.out.println("Employee Name is "+empname);
	System.out.println("Employee salery is "+empsal);
	System.out.println("Employee job  is "+empjob);
	System.out.println("Employee grade is "+empgrade);
	
}
	// call class in same method
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.empid=100;
	emp.empname="Rushikesh";
	emp.empsal=85333.33;
	emp.empjob="Tester";
	emp.empgrade='A';
	emp.display();
	
	
	System.out.println("===========================================================================================");
	
	Employee emp1=new Employee();
	emp1.empid=101;
	emp1.empname="Saloni";
	emp1.empsal=95333.33;
	emp1.empjob="Tester";
	emp1.empgrade='A';
	emp1.display();
	
	
}





}
