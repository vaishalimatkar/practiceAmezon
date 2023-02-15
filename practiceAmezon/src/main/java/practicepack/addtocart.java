package practicepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	 @FindBy (xpath="//span[@id='wishListMainButton']")
	   private WebElement addtocardbutton;
	    
	   
	    
	    public addtocart(WebDriver driver) {
	    	PageFactory.initElements(driver,this);
	    }
	  
	   
	    public void clinkonaddtocardbutton() {
	    	addtocardbutton.click();
	    }
	   
}
