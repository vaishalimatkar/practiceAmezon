package practicepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createacc {
	
	 @FindBy (xpath= "//input[@id='ap_email']")
	  private WebElement emailname;
	 
	 @FindBy (xpath= "//a[@id= 'createAccountSubmit']")
	   private WebElement createamazonaccbutton;
	 
	 @FindBy (xpath= " ( //a[@class='a-link-normal'])[4]")
	   private WebElement Conditonofuselink;
	 
	 @FindBy (xpath= " ( //a[@class='a-link-normal'])[5]")
	   private WebElement  PrivacyNoticelink ;
	 
	 @FindBy (xpath= "( //a)[11]")
	   private WebElement Helplink;
	    
	    
	  private Actions act;
	    	   
	    public createacc(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	   	act=new Actions(driver);
	    }
	    
	    public void sendemailName(String user) {
	    	emailname.sendKeys(user);
	    }	    
	   	  
	    public void clinkoncreateamazonaccbutton() {
	    	createamazonaccbutton.click();
	    }
	    public void clinkonConditonofuselink() { 
	    	Conditonofuselink.click();
	    }
	    		    	
	     public void clinkonPrivacyNoticelink() {
	    	 PrivacyNoticelink.click();
	     }
	 	    	
	     public void clinkonHelplink() {
	    	 Helplink.click();
	    }
	 	    
	    }

