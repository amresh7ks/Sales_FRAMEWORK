package com.ecom.amaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src\\main\\resources\\Data\\Exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(1);
		cell.setCellValue("fail");
		//FileInputStream fs=new FileInputStream("./src/main/resources/commondata.properties");
		FileOutputStream  fos=new FileOutputStream("./src\\main\\resources\\Data\\Exceldata.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("update succesfull");


	}

}
