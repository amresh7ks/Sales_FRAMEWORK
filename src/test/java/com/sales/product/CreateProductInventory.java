package com.sales.product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductInventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("please enter vaild browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("unguardable");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.name("btnlogin")).click();
	//	driver.findElement(By.name("btnlogin")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//span[text()='Inventory']")).click();
		//<a type="button" class="btn btn-warning bg-gradient-warning" href="inv_edit.php?action=edit &amp; id=2112">
		//driver.findElement(By.xpath("//table/tbody/tr/td[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td[7]/a")).click();
		driver.findElement(By.xpath("//a[@class='c']")).click();
	}

}
