package ExcelSheetReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEq1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// create excel sheet and pass the path along with name and extension in FileObject
		File myfile= new File("F:\\Velocity Class\\ExcelSheetEq1.xlsx");
		// Using WorkBookFactory class read excel sheet
		// how to read String value
//		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(name);
		// how to read numeric value
		double number =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(number);
		// how to read char value
//		String mychar =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
//		System.out.println(mychar);
		//how to read boolean value
//		boolean myValue =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
//		System.out.println(myValue);
	}

}
