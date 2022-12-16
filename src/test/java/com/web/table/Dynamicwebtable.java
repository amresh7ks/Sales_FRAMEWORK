package com.web.table;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("SubmitButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[text()='Organizations']")).click();
		String expectedoergName="tcs40";
		//*driver.findElement(By.xpath(""))*//
		 java.util.List<WebElement> listorg = driver.findElements(By.xpath("//table[@class=lvt small']/tbody/tr/td[3]"));
		 for(int i=1;i<listorg.size();i++) {
			 String actualorgName=listorg.get(i).getText();
			 System.out.println(actualorgName);
			 if(actualorgName.equals(expectedoergName)) {
				 driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+(i+2)+"]/td/input")).click();
				 break;
				 
			 }
 		 }
		

	}

}
