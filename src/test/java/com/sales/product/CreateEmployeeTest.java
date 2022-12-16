package com.sales.product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateEmployeeTest {

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
		driver.findElement(By.xpath("//span[text()='Employee']")).click();
		//driver.findElement(By.xpath("//h4[@class='m-2 font-weight-bold text-primary']")).click();
		driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		//driver.findElement(By.xpath("//input[@name='firstname']")).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h5[.='Add Employee']")));
		//driver.findElement(By.name("firstname")).sendKeys("rohit");
		//driver.findElement(By.xpath("//input[@placeholder='First Name' and @name='firstname']")).sendKeys("tgfvmb");
		driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@name='firstname']")).sendKeys("amreh");
		driver.findElement(By.xpath("//div[@id='employeeModal']/descendant::input[@name='lastname']")).sendKeys("kk");
		driver.findElement(By.xpath("//select[ @class='form-control'and@name='gender']")).sendKeys("m");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ksamreshthakur@gnail.com");
		driver.findElement(By.xpath("//h5[text()='Add Employee']/../following-sibling::div/descendant::div/input[@name='phonenumber']")).sendKeys("123455");
		//driver.findElement(By.name("//input[@name='phonenumber']")).sendKeys("55555555");
		WebElement emp = driver.findElement(By.xpath("//select[@name='jobs']"));
		Select ep=new Select(emp);
		ep.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='FromDate']")).click();
		driver.findElement(By.xpath("//input[@id='FromDate']")).sendKeys("01012022");
		driver.findElement(By.xpath("//select[@id='province']")).click();
		driver.findElement(By.xpath("//select[@id='province']")).sendKeys("Bohol");
		driver.findElement(By.xpath("//select[@id='city']")).click();
		driver.findElement(By.xpath("//select[@id='city']")).sendKeys("catarman");
	driver.findElement(By.xpath("//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")).click();
//		driver.findElement(By.xpath("//i[@class='fa fa-check fa-fw']")).sendKeys("save");
		//driver.findElement(By.xpath("//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='reset' and @class='btn btn-danger']")).click();
		
	
	}

}
