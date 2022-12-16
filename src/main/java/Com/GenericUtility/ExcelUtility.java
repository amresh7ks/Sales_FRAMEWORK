package Com.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility { 
	private static final String Sheet1 = null;
	private FileInputStream fis=null;
	private Workbook wb=null;
	private Object  Sdata;
	public String getExcelData(String excelpath,int row,int cell) throws IOException {
		try {
			fis=new FileInputStream(excelpath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();	
		}
		try {
		}
		catch ( EncryptedDocumentException e) {
			e.printStackTrace();	
		}
		
		DataFormatter df=new DataFormatter(); 
		 String data = df.formatCellValue(wb.getSheet(Sheet1).getRow(row).getCell(cell));
		 return data;
		
	}
	public void closeExcel(){
		try {
			wb.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();	

		}
		try {
			fis.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public void getExceldataUsingkey(String excelpath,String sheetName,String testcaseName) throws IOException{
		String data="";
		try {
			fis=new FileInputStream(excelpath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
	try{
	wb=WorkbookFactory.create(fis);
	
	}
	catch(EncryptedDocumentException e) {
		e.printStackTrace();
	}
	}
}


