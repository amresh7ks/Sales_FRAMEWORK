package com.ecom.amaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelKey {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
     FileInputStream  fis=new FileInputStream("src\\main\\resources\\Data\\Exceldata.xlsx");
    Workbook Workbook=WorkbookFactory.create(fis);
    Sheet shet = Workbook.getSheet("Sheet1");
    int LastRowNum = shet.getLastRowNum();
    short LastCellNum = shet.getRow(0).getLastCellNum();
    System.out.println(LastRowNum);
    System.out.println(LastCellNum);
    String ExceptedTestCase = "createOrg";
    String Exceptedkey = "LastName";
    String value = "";
    for(int i=0;i<LastRowNum;i++) {
    	String actualTestCase = shet.getRow(i).getCell(0).getStringCellValue();
    	if(actualTestCase.equals(ExceptedTestCase)) {
    		for(int j=1;j<LastCellNum-1;j++) {
    			String actualkey = shet.getRow(i).getCell(j).getStringCellValue();
    			if(actualkey.equals(Exceptedkey)) {
    				value=shet.getRow(i+1).getCell(j).getStringCellValue();
    				break;
    				
    			}
    		}
    		break;
    	}
    }
    System.out.println(value);
	}

}
