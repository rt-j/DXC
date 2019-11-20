package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UploadingFile {
	public WebDriver driver;
	public String Browser="chrome";
	@Test
public void testIbibo() throws FindFailed{
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
	driver.get("https://jpg2png.com/"); //open url
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
	Pattern p1=new Pattern("C:\\Users\\rthomas80\\Desktop\\FileNAme.PNG");
	Pattern p2=new Pattern("C:\\Users\\rthomas80\\Desktop\\Open.PNG");
	Screen s1 = new Screen();
	s1.type(p1, "C:\\Users\\rthomas80\\Documents\\Dxc-Html\\Day2,3\\Ball.jpg");
	s1.click(p2);
	}
	}
