package Com.GenericUtility;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtiltiy {
	public WebDriver WebDriverUtiltiy(String url,String browser) 
	{
	WebDriver driver=null;
	if(browser.equals("chrome")) 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browser.equals("ie")) 
	{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	else {
		System.out.println("please enter vaild browser name");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
}
	public void  switchTo_Alert_Accept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	public void switchTo_Alert_Dismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
}

