package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;
import pages.GmailLoginPage;
public class GmailLoginPage {
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public GmailLoginPage(WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
	}

	@FindBy(xpath="//div[@class=\"T-I T-I-KE L3\"]")
	private WebElement composeButton;

	@FindBy(xpath ="//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")
	private WebElement passwordNextButton;
	
	
	@FindBy(xpath="//input[@aria-label=\"Email or phone\"]")
	private WebElement emailinput;
	
	@FindBy(xpath="//a[@data-action=\"sign in\"]")
	private WebElement signinbutoon;
	
	@FindBy(xpath="//div[@class=\"aYF\"]")
	private WebElement passwordinput;

	@FindBy(css="#identifierNext > div > button > span")
	private WebElement nextbutton;
	

	public  GmailLoginPage clickonSignInbutton() {
		
		 elementUtils.clickOnElement(signinbutoon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
	    
		return new GmailLoginPage(driver);
	}
		public  void enteremailaddress() {
			
			elementUtils.typeTextIntoElement(emailinput, "chaudharishubham61@gmail.com", CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			
		    
			
		
	}
		
     public  GmailLoginPage clickonNextButton() {
			
	   elementUtils.clickOnElement(nextbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		    
			return new GmailLoginPage(driver);}
   
    public  void enterpassword(){
		
	   elementUtils.typeTextIntoElement(passwordinput, "mslkjlsadlkjs", CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		    
    }
   public  GmailLoginPage PasswordPageNextButton() {
		
	   elementUtils.clickOnElement(passwordNextButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		    
			return new GmailLoginPage(driver);}
		
	public GmailLoginPage elementpresent(){
		
		elementUtils.waitForVisibilityOfElement(passwordNextButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new GmailLoginPage(driver);
	}
	
	
}
