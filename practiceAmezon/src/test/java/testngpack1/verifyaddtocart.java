package testngpack1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practicepack.addtocart;
import practicepack.mobilelist;
import practicepack.search;

public class verifyaddtocart {
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
	    
	    search.sendsearchName("mobile");
	    search.clinkonsearchbutton();
	    
	 }
	@Test
	 public void verifymobilename()
	 {
           mobilelist  mobilelist=new  mobilelist(driver); 
           mobilelist.clinkonmobileName();
           ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
     	   driver.switchTo().window(addr.get(1));
	   
		    String actualTitle=driver.getTitle();
		    String actualUrl=driver.getCurrentUrl();
		    		    		   
		    if(actualTitle.equals("Samsung Galaxy A14 5G (Light Green, 6GB, 128GB Storage) | Triple Rear Camera (50 MP Main) | Upto 12 GB RAM with RAM Plus | Travel Adapter to be Purchased Separately") ) {
		    	System.out.println("Test pass");
		    }
		    else 
		    {
		    	System.out.println("Test Fail");
		    }
	 }
	@Test
	 public void verifyaddtocartbutton()
	 {
          addtocart   addtocart =new   addtocart (driver); 
          addtocart.clinkonaddtocardbutton();
          ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
    	   driver.switchTo().window(addr.get(1));
	   
		    String actualTitle=driver.getTitle();
		    String actualUrl=driver.getCurrentUrl();
		    		    		   
		    if(actualTitle.equals("Samsung Galaxy A14 5G (Light Green, 6GB, 128GB Storage) | Triple Rear Camera (50 MP Main) | Upto 12 GB RAM with RAM Plus | Travel Adapter to be Purchased Separately") ) {
		    	System.out.println("Test pass");
		    }
		    else 
		    {
		    	System.out.println("Test Fail");
		    }
	 }
	 @AfterMethod
     public void goBackToMainPage() {
	 
	 }
		    
		    @AfterClass
		    public void closeBrowser() {
		  //  driver.quit();
		    }
	 }



