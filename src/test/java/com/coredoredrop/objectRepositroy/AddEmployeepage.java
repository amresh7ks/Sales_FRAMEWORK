package com.coredoredrop.objectRepositroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.GenericUtility.WebDriverUtility;

public class AddEmployeepage {

	//public static void main(String[] args) {
	// TODO Auto-generated method stub
	@FindBy(xpath="//span[text()='Employee']")
	private WebElement Emp;
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement icon;
	@FindBy(xpath="//h5[.='Add Employee']")
	private WebElement Addemp;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@name='firstname']")
	private WebElement Firstname;
	@FindBy(xpath="//div[@id='employeeModal']/descendant::input[@name='lastname']")
	private WebElement Lastname;
	@FindBy(xpath="//select[ @class='form-control'and@name='gender']")
	private WebElement Gender;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//h5[text()='Add Employee']/../following-sibling::div/descendant::div/input[@name='phonenumber']")
	private WebElement phonenumber;
	 @FindBy(xpath="//select[@name='jobs']")
	 private WebElement job;
	 @FindBy(xpath="//input[@id='FromDate']")
	 private WebElement fromdate;
	 @FindBy(xpath="//select[@id='province']")
	 private WebElement province;
	 @FindBy(xpath="//select[@id='city']")
	 private WebElement city;
	 @FindBy(xpath="//h5[text()='Add Employee']/../following-sibling::div/descendant::button[@type='submit' and @class='btn btn-success']")
	 private WebElement save;
	 public AddEmployeepage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 /**
		 * this method is used  to add Emp code
		 * 
		 */
	 public void emp() {
		 Emp.click();
	 }
	 public void icon() {
		 icon.click();
	 }
	 public void firstname(String string) {
		 Firstname.sendKeys("amresh");
	 }
	 public void Lastname(String string) {
		 Lastname.sendKeys("kumar");
	 }
	 public void  gender(WebDriver driver,WebElement element,String text)	 
{//
  // Select s=new Select(Gender);
//s.deselectByValue("M");
}
	 

public void email() {
	email.sendKeys("ksamreshthakur@gmail.com");
} 
public void  phonenumber() {
	phonenumber.sendKeys("8802190210");
}
public void job(WebDriverUtility driver,WebElement element,String text ) {
Select j=new Select(element);
j.selectByValue(text);
}
public void province() {
	province.sendKeys("");
	
}
public void city() {
	city.sendKeys("");
}
public void save() {
	save.click();
}

}
