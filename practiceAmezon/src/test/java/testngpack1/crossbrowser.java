package testngpack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import base1.Browser1;
import practicepack.search;



public class crossbrowser extends Browser1 {
	private WebDriver driver;
	private search search;
	//private  mobilelist  mobilelist;
	@Parameters("browser12")
	@BeforeTest
	 public void launchBrowser(String browser)
	 {
       System.out.println("Before Class");
		
		if(browser.equals("Chrome"))
		{
			driver = openChromeBrowser();
	    }
		if(browser.equals("Firefox"))
		{
		    driver = openFirefoxBrowser();
		 }
		if(browser.equals("Edge"))
		{
		    driver = openEdgeBrowser();
		 }
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	 }
	
	@BeforeClass
	 public void createPOMObject()
	 {
		  search=new search(driver);
		// mobilelist  mobilelist=new  mobilelist(driver); 
	 }
	@BeforeMethod
	 public void beforeMethod()
	 {
		System.out.println("Before Method");
       driver.get("https://www.amazon.in/");
	    
        search.sendsearchName("mobile");
	    search.clinkonsearchbutton();
	    search.clinkonaccAndList();
		 search.clinkonsignbutton();
	 }
	
	@Test
	 public void verifySearchbutton()
	 {
		   String actualTitle=driver.getTitle();	    
		   String exceptedTitle="Amazon.in:mobile";
		   Assert.assertEquals(actualTitle, exceptedTitle);
		   boolean result=actualTitle.equals(exceptedTitle); 		   
	 }
	@Test(priority=1)
	 public void verifySigninbutton()
	 {
		    String actualTitle=driver.getTitle();
		    String exceptedTitle="Amazon Sign In";
		    Assert.assertEquals(actualTitle, exceptedTitle);
			 boolean result=actualTitle.equals(exceptedTitle); 	
	 }
	
	
	@AfterMethod
	 public void afterMethod() {
	 System.out.println("After Method");
	 System.out.println("LogOut");
	}
	
	@AfterClass
	 public void  closeBrowser() {
		search=null;
		//mobilelist =null;
	}
	
	@AfterTest
	 public void afterClass() {
		 System.out.println("After Class");
		 driver.close();
		 driver=null;
		 System.gc();
		}
	
	 }



