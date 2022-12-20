package com.coredoredrop.objectRepositroy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.GenericUtility.ExcelUtility;
import Com.GenericUtility.FileUtility;
import Com.GenericUtility.IConstantPath;
import Com.GenericUtility.JavaUtiltiy;
import Com.GenericUtility.PropertyFileKeys;
import Com.GenericUtility.SheetName;
import Com.GenericUtility.WebDriverUtility;

public class InventoryTestpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create object for generic utility
				ExcelUtility excelUtility=new  ExcelUtility();
				FileUtility fileUtility=new FileUtility();
				JavaUtiltiy javaUtiltiy=new JavaUtiltiy();
				WebDriverUtility weDriverUtility=new WebDriverUtility();
				//read the  data common data  for the property  file
		  		String browser = fileUtility.getDataFromPropertyfile(PropertyFileKeys.BROWSER.convertoString(),IConstantPath.PROPERTY_FILE_PATH);
		  		String url = fileUtility.getDataFromPropertyfile(PropertyFileKeys.URL.convertoString(),IConstantPath.PROPERTY_FILE_PATH);
		  		String username = fileUtility.getDataFromPropertyfile(PropertyFileKeys.USERNAME.convertoString(),IConstantPath.PROPERTY_FILE_PATH);
		  		String password = fileUtility.getDataFromPropertyfile(PropertyFileKeys.PASSWORD.convertoString(),IConstantPath.PROPERTY_FILE_PATH);
		  		Long Timeout = (Long) javaUtiltiy.stringToAnyDataType(fileUtility.getDataFromPropertyfile(PropertyFileKeys.TIMEOUT.convertoString(),IConstantPath.PROPERTY_FILE_PATH), "long");
		  		//read data from excel file
		  		String actualID = excelUtility.getExcelData(SheetName.prodcut.toString(),  2, 1);
		  		//webDriver driver=webDriverutility.luanchApplication(browser,timeout1,longurl);
		  		String pName = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 2);
		  		String description = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 3);
		  		String qnt = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 4);
		  		String onhand = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 5);
		  		String price = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 6);
		  		//excelUtility.getExcelData(SheetName.Product, 2, 8);
		  		String supplier = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 7);
		  		String datastockIn = excelUtility.getExcelData(SheetName.prodcut.toString(), 2, 8);
		  		//open the browser
		  		WebDriver driver = weDriverUtility.lauchApplicatio(browser, Timeout, url);
		  		//login app
		  		//create the obj for pom classes
		  		LoginPage login=new LoginPage(driver); 
		  		CommonPage commonPage=new CommonPage(driver);

	}

}
