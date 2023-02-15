package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practicepack.addtocard;
import practicepack.mobilelist;
import practicepack.search;


public class verifymobilename {
	public static void main (String args[]) {
    	System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\autiomation selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
        search search=new search(driver); 
	    
	    search.sendsearchName("mobile");
	    search.clinkonsearchbutton();
	    
    mobilelist  mobilelist=new  mobilelist(driver); 
    mobilelist.clinkonmobileName();
	 }
	    
	}    

