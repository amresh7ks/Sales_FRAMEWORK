package Com.GenericUtility;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.sql.Date;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
private WebDriver driver; 
private WebDriverWait wait;
private Actions act;
public WebDriver lauchApplicatio(String browser,long timeout,String url) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	else if(browser.equals("ie")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	else {
		System.out.println("please enter vaild browser name");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get("http://rmgtestingserver/domain/Sales_And_Inventory_System/pages/login.php");
	driver.get(url);
	return driver;
}
private void intiallizeActions() {
	act=new Actions(driver);
	
}
private void IintiallizeExplicitWait(long timeout) {
	wait=new WebDriverWait(driver, timeout);
	
}
 public void acceptAlert() {
	 driver.switchTo().alert().dismiss();
	 
 }
 public void dismissAlert() {
	 driver.switchTo().alert().getText();
 }
public String getTextAlert() {
	return driver.switchTo().alert().getText();
}
public int getRanDomNumber() {
	Random random=new Random();
	int intRandom = random.nextInt();
	return intRandom;
}
public String getSystemDateAndtime() {
	//Date date=new Date(date)
	Date date=new Date(0);
	return date.toString();
}
public void Select( WebDriver driver,WebElement element,String text) {
	//Select sel=new Select(Element); 
	Select s=new Select(element);
	s.selectByVisibleText(text);
	
	
}
public void job(WebDriverUtility driver,WebElement element) {
	Select s=new Select(element);
	s.selectByValue("cashier");
	
}
public void Select1(WebDriver driver,WebElement element,String text) {
	
	Select s =new Select(element) ;
	s.selectByValue("1");
	
	
}
public void gender(WebDriver driver,WebElement element) {
	Select m=new Select(element);
	m.deselectByValue("Male");
}


public void mouseOveronElemente(WebDriver driver,WebElement element) {
	Actions  act=new  Actions(driver);
	act.contextClick(element).perform();
	
}
public void righClickOnElement(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.contextClick(element).click();
	
}
public Object switchToAlertWindowAndAccept(WebDriver driver) {
	driver.switchTo().alert().dismiss();
	return driver;
	
	
}
public  String getTextAlert1() {
	return driver.switchTo().alert().getText();
	
	
}
public  String  acceptAlert1() {
//return switchto().alert().
	return driver.switchTo().alert().getText();
}
public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
	
}
public void switchTOAlertWindowAndAccpect(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void switchTOAlertWindowAndCancel(WebDriver driver) {
	driver.switchTo().alert().dismiss();
	
}
public void switchToFrame(WebDriver driver,String id_name_attribute) {
	driver.switchTo().frame(id_name_attribute);
}
public void select(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
			
	
}
public void ScrollToBottomPage() {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	//j.executeAsyncScript("window.s", args)
}
public void waitAndClick(WebElement element) throws InterruptedException {
	int count=0;
	while(count<20)
	{
		try {
			element.click();
			break;
			
		}
		catch(Throwable e) {
			Thread.sleep(2000);
			count++;
		}
	}
}
	public void takeScreenShot(WebDriver driver, String ScreenShotName) throws IOException	{
		TakesScreenshot t=(TakesScreenshot) driver;
		java.io.File src=t.getScreenshotAs(OutputType.FILE);
	File dest=new  File("./ScreenShot/"+ScreenShotName+".png");
	FileUtils.copyFile(src, dest);
	}
	
	
	public void  passEnterKey(WebDriver driver) {
		Actions  act=new Actions(driver);
		//act.sendKeys(key.Enter);
		act.sendKeys(Keys.ENTER);	
	}
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	}
	public void waitForPageToLoadForjsElement(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
	
	public void waitForElemnetToBeClickAble(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));


}
	public void  switchTo_Alert_Accept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void switchTo_Alert_Dismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	//public void  ScrollToBottomofpage() {
		//JavascriptExecutor j=(JavascriptExecutor)driver {
		//	j.executeScript(script, args);
			
			public Object executeScript(String script, Object... args) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object executeAsyncScript(String script, Object... args) {
				// TODO Auto-generated method stub
				return null;
			}
	//	};=
	}//

	
