package com.sales.product;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductTest {

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
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//span[text()='Product']")).click();
	    driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		//driver.findElement(By.xpath("//div[@class='card-header py-3']")).click();
		//driver.findElement(By.name("Product Code")).sendKeys("2001");
	    driver.findElement(By.xpath("//input[@placeholder='Product Code']")).sendKeys("2008");
		//driver.findElement(By.xpath("Ja//input[@name='name']")).click();
		driver.findElement(By.name("name")).sendKeys("Keyboard");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.
		driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@placeholder='On Hand']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys("180");
		WebElement cat = driver.findElement(By.name("category"));
		Select s=new Select(cat);
		s.selectByVisibleText("Keyboard");
		WebElement sup = driver.findElement(By.name("supplier"));
		Select s1=new Select(sup);
		s1.selectByVisibleText("apple");
		//driver.findElement(By.name("Date Stock In")).click();
		//driver.findElement(By.name("Date Stock In")).sendKeys("22112022");
		//driver.findElement(By.xp//ath(""));
		driver.findElement(By.xpath("//input[@placeholder='Date Stock In']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Date Stock In']")).sendKeys("22112022");
		driver.findElement(By.xpath("//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")).click();

		
		
		
			
		
		
	}
	

}
