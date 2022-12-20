package com.coredoredrop.objectRepositroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sales.product.Supplier;

import Com.GenericUtility.WebDriverUtility;

public class CommonPage {
	@FindBy(xpath= "//span[text()='Product']" )
	private WebElement product;
	@FindBy(xpath="//span[text()='Customer']")
	private  WebElement customer;
	@FindBy(xpath ="//span[text()='Supplier']" )
	private WebElement Supplier;
	@FindBy(xpath="//span[text()='Inventory']")
	private WebElement inventory;
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private  WebElement save;
	@FindBy (xpath="//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")
	private WebElement submit;
	public CommonPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void clickProduct() {
		product.click();
	}
	public void clickCustomer() {
		customer.click();
	}
	public void clickSupplier() {
		Supplier.click();
	}
	public void clickInventory() {
		inventory.click();
		
	}
	public void save(WebDriverUtility webDriverUtility) {
		webDriverUtility.acceptAlert();
	}




}
