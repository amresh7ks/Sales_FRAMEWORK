package com.coredoredrop.objectRepositroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.GenericUtility.WebDriverUtility;

public class AddProductpage {
	@FindBy(xpath="//span[text()='Product']")
	private WebElement product;
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement icon;
	@FindBy(xpath ="//input[@placeholder='Product Code']" )
	private WebElement productCode;
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement productName;
	//@FindBy(Xpath="//"h5[.='Add Product]/../following::div[@class='form-group']/child::textare\"]")
	@FindBy(xpath = "//h5[.='Add Product]/../following::div[@class='form-group']/child::textare]")
	private WebElement desc;
	@FindBy(xpath = "//input[@placeholder='Quantity']")
	private WebElement Quant;
	@FindBy(xpath="//input[@placeholder='On Hand']")
	private WebElement onhand;
	@FindBy(xpath="//input[@name='price']")
	private WebElement price;
	@FindBy(name="category")
	private WebElement category;
	@FindBy(name="supplier")
	private WebElement supplier;
	@FindBy(xpath="//input[@placeholder='Date Stock In']")
	private WebElement stock;
	@FindBy(xpath="//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")
	private WebElement Save;
	public AddProductpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	/**
	 * this method is used  to add product code
	 * 
	 */
	public void ClickonAddIconForProduct() {
	icon.click();
	}
	public void pcode(String actualId) {
		productCode.sendKeys(actualId);
	}
	public void pName(String productName) {
		this.productName.sendKeys(productName);		
	}
	public void pdDescription(String  description) {
		desc.sendKeys(description);


	}
	public void pQuant(String qnt) {
		Quant.sendKeys(qnt);
	}
	public void inHand(String onHand) {
		this.onhand.sendKeys(onHand);

	}
	/**
	 * this method is used to price of product
	 */
	public void  pprice(String Price) {
		price.sendKeys(Price);

	}
	public void pcategory(WebDriverUtility webDriverUtility,String text) {
		webDriverUtility.select(category, text);

	}
	public void pSupplier(WebDriverUtility webDriverUtility,String text) {
		webDriverUtility.select(supplier, text);
		
	}
	public void ScrollToBottomPOfpage() {
		
	}
	
	//public void Date Stock In()
	public  void Stock(String value) {
		stock.sendKeys(value);
		
	}
	public void save() {
		Save.click();
		
	}
	
}
