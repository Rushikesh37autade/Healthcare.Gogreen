package automation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionBasics {
	public static void main(String[] args) {
		// checked exceptions
//		System.out.println("programm start");
//		try {
//			Thread.sleep(2000);
//			System.out.println("try block");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("catch block");
//			
//		}
//		System.out.println("End block");
		
		// unchecked exception
		
		System.out.println("program start");
		try {
			FileInputStream file= new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
			
			String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			System.out.println("Try block");
			System.out.println(value);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(" catch block");
		}
		System.out.println("End of programm");
		
	}

}
