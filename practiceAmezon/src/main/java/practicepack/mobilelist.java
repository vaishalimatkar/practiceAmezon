package practicepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobilelist {
	   @FindBy (xpath="(//div[@data-index=\"3\"]//span)[11]")
	    private WebElement mobileName;
	   
	  	   
	    
	    public mobilelist(WebDriver driver) {
	    	PageFactory.initElements(driver,this);
	    }
	  
	    public void clinkonmobileName() {
	    	mobileName.click();
	    }
	    
	   
}
