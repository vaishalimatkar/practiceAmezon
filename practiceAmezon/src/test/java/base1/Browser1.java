package base1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser1 {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARE TESTING\\autiomation selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	    }
		public static WebDriver openFirefoxBrowser() {
			System.setProperty("webdriver.gecko.driver","D:\\SOFTWARE TESTING\\autiomation selenium\\firefox\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			return driver;
		    }
		
		public static WebDriver openEdgeBrowser() {
			System.setProperty("webdriver.edge.driver","D:\\SOFTWARE TESTING\\autiomation selenium\\edgedriver_win64\\msedgedriver.exe");
			WebDriver  driver = new EdgeDriver();
			return driver;
		    }
}
