package Praticecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Hashmap extends Hashmapdata {


//	public static void main(String args[]) throws InterruptedException
//	{
		@Test(priority= 1)
		public void applyforgrievance() throws InterruptedException
		{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\seleniujm\\chromedriver_win32 (5)\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.get("http://192.168.10.75/bsscl/Website/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //span[@class='rounded-pill']")).click();
		driver.findElement(By.linkText("Citizen Login")).click();
//		HashMap<String,String> ar=new HashMap<String,String>();
		ar.put("Username","ipsita1992");
		ar.put("Password","Admin@123");
	
	    driver.findElement(By.xpath("//input[@id='uId']")).sendKeys(ar.get("Username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(ar.get("Password"));
	    driver.findElement(By.xpath(("//button[contains(text(),'Submit')]"))).click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait( driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@routerlink,'../dashboard')]")));
		driver.findElement(By.xpath("//*[contains(@routerlink,'../citizensupport')]")).click();
		driver.findElement(By.xpath("//body/app-root[1]/app-citizen-portal[1]/div[1]/app-citizenservice[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(8000);
		
		LC.put("PhoneNo","7008532423");
		LC.put("Category","Service Passbook");
		LC.put("Sub Category","Service Passbook");
		driver.findElement(By.xpath("//input[@id='ctrl_02012023024838']")).sendKeys( LC.get("PhoneNo"));
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ctrl_02012023034316']")));
		s.selectByVisibleText(LC.get("Category"));
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='ctrl_02022023060110']")));
		s1.selectByVisibleText(LC.get("Sub Category"));
		Thread.sleep(5000);
		
	}
		@Test(priority= 2)	
		public void checkstatus() throws InterruptedException
		{
			
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "D:\\seleniujm\\chromedriver_win32 (5)\\chromedriver.exe");
		  driver=new ChromeDriver();
			driver.get("http://192.168.10.75/bsscl/Website/home");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath(" //span[@class='rounded-pill']")).click();
			driver.findElement(By.linkText("Citizen Login")).click();
//			HashMap<String,String> ar=new HashMap<String,String>();
			ar.put("Username","ipsita1992");
			ar.put("Password","Admin@123");
		     driver.findElement(By.xpath("//input[@id='uId']")).sendKeys(ar.get("Username"));
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(ar.get("Password"));
			driver.findElement(By.xpath(("//button[contains(text(),'Submit')]"))).click();
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait( driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@routerlink,'../dashboard')]")));
			driver.findElement(By.xpath("//*[contains(@routerlink,'../citizensupport')]")).click();
			driver.findElement(By.linkText("Check Status")).click();
			Thread.sleep(5000);
			LC.put("token","BSSCL/GMS/050420231800");
			driver.findElement(By.xpath("//label[contains(text(),'Complaint Token No.')]/following::*[2]")).sendKeys(LC.get("token"));
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
			Thread.sleep(3000);
		   String x=	driver.findElement(By.xpath("//th[contains(text(),'Phone Number')]/following::*[13]")).getText();
		    checkstatus.put("PhoneNo",x);
		    boolean equal=LC.entrySet().containsAll(checkstatus.entrySet());
		    if(equal)
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		}
	
}
