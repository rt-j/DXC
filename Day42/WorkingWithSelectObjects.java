package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSelectObjects {
	public WebDriver driver;
	public String Browser="chrome";
	@Test
public void testIbibo(){
	SoftAssert st=new SoftAssert();
	if(Browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//we do this instead of setting system variables
		driver=new ChromeDriver(); //OpenBrowser
	}else if(Browser.equalsIgnoreCase("mozilla")){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		 driver=new FirefoxDriver();
	}else if(Browser.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	}
	driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME"); //open url
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.xpath("//select[@id='curLocation']"));
	Select s=new Select(ele);
	//s.selectByIndex(4);
	s.selectByVisibleText("Anand");
	//s.selectByValue("175200");
	//or select chennai xpath and use send keys
	
	
}
	}
