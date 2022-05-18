package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelBasics {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// add  apachi poi jar files
		// create excel file data
		// create object of an fileinputstream (it will accept  the path of excel sheet as a parameter)
		// to open excel sheet we need to call create() method from workbookfactory
		// choose the sheet from excel we need to call getsheet() method.
		// choose the row from excel we need to call getrow(int) method.
		// choose the cell from excel we need to call getcell(int) method.
		// to read the data we need to call the method getstringcellvalue().
		
		FileInputStream file= new FileInputStream("C:\\Users\\Rushi\\Desktop\\Mydata.xlsx\\");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
		//String number = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		//System.out.println(number);
		
	}

}
