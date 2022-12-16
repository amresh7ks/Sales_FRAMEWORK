package com.ecom.amaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("src/main/resources/Data/Exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis); 
		try {
			Sheet sh = wb.getSheet("sheet");
			Row Row = sh.getRow(0);
			Cell cell = Row.getCell(2);
			String Data = cell.getStringCellValue();
			System.out.println(Data);
			}
finally {
	//workbook.close();
System.out.println("Workbook close");	

}
	}

}
