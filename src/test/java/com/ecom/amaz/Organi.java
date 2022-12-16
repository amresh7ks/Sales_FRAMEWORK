package com.ecom.amaz;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Organi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new WebDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Calendar']")).click();
		driver.findElement(By.xpath("//img[@title='Open Calendar...']")).click();
		//driver.findElement(By.xpath("//td[text()='January 2023']")).click();
		WebElement element = driver.findElement(By.xpath("//td[@class='calHdr']/a/following-sibling::a/b"));
		String allMonthYear = driver.findElement(By.xpath("//td[@class='calHdr']/a/following-sibling::a/b")).getText();
		String allMonth = allMonthYear.split("")[0];
		String allYear = allMonthYear.split("")[1];
		String reqMonth = "April";
		String reqYear = "2024";
		String reqD999ay = "20";
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visi)
		
		while(!(allMonth.equals(reqMonth)&&  allYear.equals(reqYear))) {
			driver.findElement(By.xpath("//img[@title='Open Calendar...']")).click();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//td[@class='calHdr']//b"), allMonthYear));
			
			
		}


	}

}
