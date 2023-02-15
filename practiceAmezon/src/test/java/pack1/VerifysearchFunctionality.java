package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practicepack.search;

public class VerifysearchFunctionality {
	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\autiomation selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		 search search=new search(driver); 
		    
		    search.sendsearchName("mobile");
		    search.clinkonsearchbutton();
		    

		    String actualTitle=driver.getTitle();
		    System.out.println(actualTitle);
		    
		    String actualUrl=driver.getCurrentUrl();
		    System.out.println(actualUrl);
		    
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
	}
