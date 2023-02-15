package testngpack1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import practicepack.search;

public class veifyHomePage {
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
	    
	  //  search.sendsearchName("mobile");
	  //  search.clinkonsearchbutton();
	    
	 }
	
	@Test
	 public void verifySearchbutton()
	 {
		search search=new search(driver);
		search.sendsearchName("mobile");
	   
		   String actualTitle=driver.getTitle();	    
		   String actualUrl=driver.getCurrentUrl();
		   
		    String exceptedTitle="Amazon.in:mobile";
		    String exceptedUrl="https://www.amazon.in/s?k=mobile&ref=nb_sb_noss"; 
		    if(actualTitle.equals(exceptedTitle) && actualUrl.equals(exceptedUrl)) {
		    	System.out.println("Test pass");
		    }
		    else 
		    {
		    	System.out.println("Test Fail");
		    }
	 }
	@Test
	 public void verifySigninbutton()
	 {
		 search search=new search(driver);
		 search.clinkonaccAndList();
		 search.clinkonsignbutton();
	   
		   String actualTitle=driver.getTitle();
		    System.out.println(actualTitle);
		    
		    String actualUrl=driver.getCurrentUrl();
		    System.out.println(actualUrl);
		    
		    String exceptedTitle="Amazon Sign In";
		    String exceptedUrl="https://www.amazon.in/ap/signin?"; 
		    if(actualTitle.equals(exceptedTitle) && actualUrl.equals(exceptedUrl)) {
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


