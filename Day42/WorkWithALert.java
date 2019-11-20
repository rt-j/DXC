package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkWithALert {
	public WebDriver driver;
	public String Browser="chrome";
	@Test
public void testAlert() throws Exception{
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
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //open url
	driver.manage().window().maximize(); //maximize browser
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	
	//ALERT
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();//OK Button
	
	/*driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	Thread.sleep(3000);*/
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("PREM");
}
}
