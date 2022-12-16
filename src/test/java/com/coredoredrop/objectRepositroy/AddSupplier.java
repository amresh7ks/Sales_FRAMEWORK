package com.coredoredrop.objectRepositroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.GenericUtility.WebDriverUtility;

public class AddSupplier {
	@FindBy(xpath ="//span[text()='Supplier']" )
	private WebElement Supplier;
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement i;
	@FindBy(xpath="//input[@name='companyname']")
	private WebElement companyname;
	//@FindBy(xpath="//select[@class='form-control' and @placeholder='Province']")
	@FindBy(xpath="//select[@class='form-control' and @placeholder='Province']")
	private WebElement  Province;
	@FindBy(xpath="//select[@id='city' and @name='city']")
	private WebElement city;
	@FindBy(xpath="//input[@name='phonenumber']")
	private WebElement phonenumber;
	
	@FindBy(xpath="//h5[text()='Add Supplier']/../../descendant::button[@class='btn btn-success']")
	private WebElement save;
	public AddSupplier (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void supplierClick() {
		Supplier.click();
		}		
	public void ClickonAddSupplier() {
		i.click();
		}
	public void companyname() {
		companyname.sendKeys("apple");
	}
	public void Province(WebDriverUtility webDriverUtility,String text) {
		webDriverUtility.select(Province, "Aklan");

	}
	public void city() {
		city.sendKeys("patna");
	}
	
	public void  phonenumber() {
		phonenumber.sendKeys("8802230210");
	}
	public void save() {
		save.click();
		
	}
	
	
	
	
}
