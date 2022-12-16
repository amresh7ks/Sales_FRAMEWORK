package com.web.table;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crm {

	public static void main(String[] args) 
	{
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://rmgtestingserver:8888/index.php?action=Login&module=Users");

	}

}
