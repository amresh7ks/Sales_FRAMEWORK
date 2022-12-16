package com.ecom.amaz;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FectchPriceOfProduct {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB 
		 Redmi 10A (Charcoal Black, 4GB RAM, 64GB Storage) | 2 Ghz Octa Core Helio G25 | 5000 mAh Battery | Finger Print Sensor | Upto 5GB RAM with RAM Booster
		 */
		ArrayList<String> ProductList=new ArrayList<String>();
		ProductList.add("Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB ");
		ProductList.add("Redmi 10A (Charcoal Black, 4GB RAM, 64GB Storage)");
		ProductList.add("OPPO A31 (Mystery Black, 128 GB)  (6 GB RAM)\r\n" + "");
		ProductList.add("OPPO A74 5G BLACK (Fluid Black, 128 GB)  (6 GB RAM)\r\n" + "");
		for(String productname:ProductList) {
		   String price = driver.findElement(By.xpath("//p[text()='Our pink']/ancestor::div[@class='content-block__content horizontal-align-start justify-start ']/descendant::span[text()='Shop Now']")).getText();
		   System.out.println(price);
		} 
	}

}
