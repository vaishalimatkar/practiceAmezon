package testngpack1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practicepack.createacc;
import practicepack.search;

public class vericycreateacc {
private WebDriver driver;
	
	@BeforeClass
	 public void beforeClass()
	 {
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\autiomation selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 }
	
	@BeforeMethod
	 public void beforeMethod()
	 {
	    driver.get("https://www.amazon.in/");
	    search search=new search(driver);
		 search.clinkonaccAndList();
		 search.clinkonsignbutton();
	         
	 }
	
	@Test
	 public void verifycreateamazonacc()
	 {
		 createacc createacc=new createacc(driver); 
		 createacc.sendemailName("vsm@gmail.com");
		 createacc.clinkoncreateamazonaccbutton();
		   String actualTitle=driver.getTitle();	    
		   String exceptedTitle="Amazon Registration";
		   Assert.assertEquals(actualTitle, exceptedTitle);
		   boolean result=actualTitle.equals(exceptedTitle);
	 }
	@Test(priority=1)
	 public void verifyConditonofuselink()
	 {
		 createacc createacc=new createacc(driver); 
		 createacc.clinkonConditonofuselink();
		 ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(addr.get(1));
		 
		   String actualTitle=driver.getTitle();	    
		   String exceptedTitle="Conditions of Use - Amazon Customer Service";
		   Assert.assertEquals(actualTitle, exceptedTitle);
		   boolean result=actualTitle.equals(exceptedTitle);
	 }
	
	@Test(priority=2)
	 public void verifyPrivacyNoticelink()
	 {
		 createacc createacc=new createacc(driver); 
		 createacc.clinkonPrivacyNoticelink();
		 ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(addr.get(2));
		 
		   String actualTitle=driver.getTitle();	    
		   String exceptedTitle="Amazon.in PrivacyNotice - Amazon Customer Service";
		   Assert.assertEquals(actualTitle, exceptedTitle);
		   boolean result=actualTitle.equals(exceptedTitle);
	 }
	
	@Test(priority=3)
	 public void verifyHelplink()
	 {
		 createacc createacc=new createacc(driver); 
		 createacc.clinkonHelplink();
		 ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(addr.get(3));
		 
		   String actualTitle=driver.getTitle();	    
		   String exceptedTitle="Help - Amazon Customer Service";
		   Assert.assertEquals(actualTitle, exceptedTitle);
		   boolean result=actualTitle.equals(exceptedTitle);
	 }
	 	
	 @AfterMethod
     public void goBackToMainPage() {
		 ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(addr.get(0));
		 }
	 
		    
		    @AfterClass
		    public void closeBrowser() {
		  //  driver.quit();
		    }
	 }




