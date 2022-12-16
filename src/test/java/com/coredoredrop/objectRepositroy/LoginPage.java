package com.coredoredrop.objectRepositroy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom design pattern->classname should be same as pagename and end with page;
public class LoginPage {
	//only for static elements
	@FindBy(name="user")
	private WebElement userNameTextWebElement;
	@FindBy(name="password")
	private WebElement passwordTextField;
	//@FindBy(id="name(\"btnlogin\")")
	@FindBy(name="btnlogin")
	private WebElement loginbutton;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
// business libaray
	public void enterUserName(String username,String password) {
		userNameTextWebElement.sendKeys(username);
		
	}
	public void enterpassword(String password ) {
		passwordTextField.sendKeys(password);
		
	}
	public void clickLogin() {
		loginbutton.click();
	}
	public void loginAction1(String username, String password) {

		userNameTextWebElement.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginbutton.click();
		
	}
	public void loginAction(String username, String password) {
		// TODO Auto-generated method stub
		
	}

}
