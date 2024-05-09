package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.CommonUtils;
import utils.ElementUtils;




public class gmailcomposePage {
	WebDriver driver;
	private ElementUtils elementUtils;

	public gmailcomposePage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
	}
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement composeButton;
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement sendButton;
		
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement AddattachmentButton;
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement closeButton;
		
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement undoButton;
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement viewmessageButton;
		@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
		private WebElement composewindow;
		
		public  gmailcomposePage clickOncomposeButton() {
			
			 
		    elementUtils.clickOnElement(composeButton ,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			return new gmailcomposePage(driver);
			
		}
		public gmailcomposePage elementpresent(){
			
			elementUtils.waitForVisibilityOfElement(composeButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			return new gmailcomposePage(driver);
		}
    public gmailcomposePage composewindowelementpresent(){
			
			elementUtils.waitForVisibilityOfElement(composewindow, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			return new gmailcomposePage(driver);
		}
		public  gmailcomposePage clickOnsendButton() {
			
			 
		    elementUtils.clickOnElement(sendButton ,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			return new gmailcomposePage(driver);
			
		}
		
		public  gmailcomposePage clicksaddfileButton() {
			
			 
		    elementUtils.clickOnElement(AddattachmentButton ,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			return new gmailcomposePage(driver);
			
		}	
		
		public  gmailcomposePage closeButtonclick() {
			
			 
		    elementUtils.clickOnElement(closeButton ,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			return new gmailcomposePage(driver);
		}
			
			public  gmailcomposePage undoButtonclick() {
				
				 
			    elementUtils.clickOnElement(undoButton ,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
				return new gmailcomposePage(driver);	
			
		}	
		
			public  gmailcomposePage viewmessageButtonclick() {
				
				 
			    elementUtils.clickOnElement(viewmessageButton ,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
				return new gmailcomposePage(driver);	
			
		}	
		
		
	}

