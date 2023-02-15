package practicepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search {
	 @FindBy (xpath= "//input[@type='text']")
	    private WebElement searchbox;
	    
	    
	    @FindBy (xpath= "//input[@id='nav-search-submit-button']")
	    private WebElement searchbutton;
	    
	    @FindBy (xpath= "//span[text()='Account & Lists']")
	    private WebElement accAndList;
	    
	    @FindBy (xpath= "(//span[text()='Sign in'])[1]")
	    private WebElement signinbutton;
	    
	    
	  //private Actions act;
	    	   
	    public search(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    	act=new Actions(driver);
	    }
	    
	    public void sendsearchName(String user) {
	    	searchbox.sendKeys(user);
	    }	
	            
	   	  
	    public void clinkonsearchbutton() {
	    	searchbutton.click();
	    }
	    
	    public void clinkonaccAndList() {
	    	//accAndList.click();
	    }
	    public void clinkonsignbutton() {
	    	act.moveToElement(accAndList).moveToElement(signinbutton).click().build().perform();
	    }
	    
	    
	    }	


