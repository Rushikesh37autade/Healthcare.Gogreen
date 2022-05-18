package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdvance {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file;
		// multiple values in single column
		
//		for (int i=0; i<10; i++) {
//		FileInputStream file = new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
//		
//	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//	System.out.println(value);
//		
//	}

		// multiple row multiple coloumn
//		for (int i=0; i<10; i++) {
//			for(int j=0; j<2; j++) {
//		file= new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
//		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//		
//			
//			System.out.print("==>"+value);
//		}
//		System.out.println();
//}
		
		// make for loop conditions dynamic 
		//1. for row
		
		file= new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
		int Rowlenght = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
			System.out.println(Rowlenght);
			
		// 2.for column

			file= new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
			int celllenght = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
			
			System.out.println(celllenght);
		
			// dynamic script to read data from row and column
			
			for (int i=0; i<=Rowlenght; i++) {
			for(int j=0; j<celllenght; j++) {
		file= new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		
			
			System.out.print("==>"+value);
		}
		System.out.println();
}
		
		
		
		
}
}