package com.ecom.amaz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobile {

	public static void main(String[] args) {
		String productname="iphone13";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys(productname,Keys.ENTER);
		List<WebElement> iphoneName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> iphoneprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count = iphoneName.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = iphoneName.get(i).getText();
			String text1 = iphoneprice.get(i).getText();
			System.out.println(text+""+text1);
		}
		driver.close();

		
		
				
	}

}
