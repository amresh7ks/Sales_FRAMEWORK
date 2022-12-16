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

public class CreateCustomerTest {

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
		driver.findElement(By.xpath("//span[text()='Customer']")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("amresh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kkks");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8802190210");
		//driver.findElement(By.xpath("//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")).click();
		driver.findElement(By.xpath("//h5[text()='Add Customer']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")).click();


	}

}
