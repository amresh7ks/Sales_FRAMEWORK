package com.ecom.amaz;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Org {
	public class FectchDataProperty {

	}

	public static void main(String[] arg) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\Data\\Exceldata.xlsx");			
	Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");	
		
		Row s = sh.getRow(0);
		String data = s.getCell(0).getStringCellValue();
		System.out.println(data);
	











	}

}
