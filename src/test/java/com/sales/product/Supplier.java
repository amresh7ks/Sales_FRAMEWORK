package com.sales.product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Supplier {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//span[.='Supplier']")).click();
		//a[@class='nav-link']/i[@class='fas fa-fw fa-cogs']/following-sibling::span[text()='Supplier']
		//span[.='Supplier']
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h5[text()='Add Supplier']"))));
		driver.findElement(By.xpath("//input[@name='companyname']")).sendKeys("apple");
		WebElement provi = driver.findElement(By.xpath("//select[@class='form-control' and @placeholder='Province']"));
		provi.click();
		Select s=new Select(provi);
		s.selectByVisibleText("Abra");
		
		//Thread.sleep(2000);
		WebElement cti = driver.findElement(By.xpath("//select[@id='city' and @name='city']"));
	
		Select s1=new Select(cti);
		//driver.findElement(By.xpath("//div[@class='modal-content']/div/following-sibling::div/form/div[3]/select/option[4]")).click();
		
		s1.selectByVisibleText("La Paz");
		driver.findElement(By.name("phonenumber")).sendKeys("997776666");
		//cti.click();
		
		driver.findElement(By.xpath("//h5[text()='Add Supplier']/../../descendant::button[@class='btn btn-success']")).click();
		

	}

}
