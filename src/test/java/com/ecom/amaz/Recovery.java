package com.ecom.amaz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Recovery {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");
		// WebElement bu = driver.findElement(By.name("button")).click();
		//WebElement but = driver.findElement(By.name("button")).click();
		//Object but = driver.findElement(By.xpath("//button")).click();
		//WebElement button = driver.findElements(By.name("//button")).clear();
		/**	WebElement hhh = driver.findElement(By.xpath("//input[@name='email']"));
		int width = hhh.getSize().getWidth();
		int height = hhh.getSize().getHeight();
		WebElement hh = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 int width1 = hh.getSize().getWidth();
		int  height1=hh.getSize().getWidth();
		if((width==width1) && (height==height1)){
			System.out.println("height and width same");
		}
		else {
			System.out.println("height and width not same");

		}
		 **/

		//driver.get("https://demo.actitime.com/login.do");
		/**driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ksamreshthakur@gmail.com	");
		WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new  Select(mon);
		s.selectByIndex(2);
		s.selectByValue("5");
		s.selectByVisibleText("Sep");
		**/
		/**driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ksamreshthakur@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
        Recovery f=new Recovery();
        **/
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	


}
