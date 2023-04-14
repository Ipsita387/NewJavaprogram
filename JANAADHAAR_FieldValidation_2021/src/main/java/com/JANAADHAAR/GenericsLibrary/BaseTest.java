package com.JANAADHAAR.GenericsLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	public int row;
	
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(loginurl);
		row=2;
	}
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}
