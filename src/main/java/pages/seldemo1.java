package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;


public class seldemo1 {
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public seldemo1(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);
		
	   }
	
	@FindBy(xpath="//button[@data-target=\"pagado\"]")
	private WebElement greenButton;
	
	@FindBy(xpath="//div/h4/span[@class=\"pull-right pagado\"]")
	private List<WebElement> rows;
	
	public seldemo1 greenbuttonclick() {
		
		
		elementUtils.clickOnElement(greenButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new seldemo1(driver);
	}
	public void successfullygetgreenrows() {
        String value = "(Green)";
    	
       System.out.println(rows.get(0).getText());
		for(int i=0;i <rows.size();i++) {
			
			if (rows.get(i).getText().equals(value)) {
				
				System.out.println(rows.get(i).getText()+"      green rows selected" );
			}
			else 
				
			{System.out.println("No green rows selected");
		}
		
	}
	}}
