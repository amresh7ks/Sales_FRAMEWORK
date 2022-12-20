package com.coredoredrop.objectRepositroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	@FindBy(xpath="//span[text()='Inventory']")

	private WebElement Inventorys;
	@FindBy(xpath="//*[@id=\"dataTable\"]/tbody/tr[1]/td[4]/a")
	private WebElement  view;
	public  InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	/**
	 * this method is used  to show  inventory  code
	 * @return 
	 * 
	 */
	public void Inventorys() {
		Inventorys.click();
	}
	public void view()
	{
		view.click();
	}
}
