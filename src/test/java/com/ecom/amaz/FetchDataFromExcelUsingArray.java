package com.ecom.amaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelUsingArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/main/resources/Data/Exceldata.xlsx");
		Workbook Workbook = WorkbookFactory.create(fis);
		Sheet sheet = Workbook.getSheet("product");
		int lastRowNumber = sheet.getLastRowNum();//return index=>index
		short lastcellNumber = sheet.getRow(0).getLastCellNum();//return count/size==>count
		//declarartion
		String [][]arr=new String[lastRowNumber][lastcellNumber];
		//intilalization
		for(int i=0;i<lastRowNumber;i++) {
			//arr[i][j]=sheet.getRow(i+1).getCell(j).toString();
			for(int j=0;j<lastcellNumber;j++) {
				arr[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		//Utilization
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
 
	}

}
