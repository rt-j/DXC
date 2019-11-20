package com.alert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HashSetMSN {
	public WebDriver driver;
	public String Browser="chrome";
	@Test
public void testMSN() throws IOException {
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
	driver.get("https://www.msn.com/en-in/"); //open url
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Go to SKYPE
	driver.findElement(By.xpath("//h3[contains(text(),'Skype')]")).click();
	//Now 
	Set<String> windowHandles = driver.getWindowHandles();
	Iterator<String> iterator = windowHandles.iterator();
	String msn=iterator.next();
	String skype=iterator.next();
	driver.switchTo().window(skype);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("DAMNIT");
	driver.switchTo().window(msn);
	driver.findElement(By.xpath("//li[@class='amazon sponsored']//h3[contains(text(),'Amazon')]")).click();
	File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshotAs, new File("Pic.jpg"));
	
}
}
