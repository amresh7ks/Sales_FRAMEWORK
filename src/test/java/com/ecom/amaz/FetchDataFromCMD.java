package com.ecom.amaz;


public class FetchDataFromCMD {
	public void test() {
		
		String url=System.getProperty("url");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println();
		System.out.println("url of website:"+url);
		System.out.println("username of app:"+username);
		System.out.println("password of app:"+password);
	}

}
