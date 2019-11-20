package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoIbibo {
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
	driver.get("https://www.goibibo.com/"); //open url
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='get_sign_in']")).click();
	driver.switchTo().frame("authiframe");
	driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("9446487891");
	//close is not part of frame so we have to switch the driver ref back to default
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@class='fr icon-close font12Lt popClose']")).click();
	driver.quit();
}
}
