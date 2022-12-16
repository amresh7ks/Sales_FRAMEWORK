package com.ecom.amaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/main/resources/commondata.properties");
		// Properties p=new Properties(fis);
		Properties p=new Properties();
		p.load(fis);
		//String Url = p.getProperty("url");
		String Uname = p.getProperty("Username");
		String pwd = p.getProperty("password");
		
		System.out.println(Uname);
		System.out.println(pwd);
		//System.out.println(Pwd);



	}

}
