package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.seldemo1;
import utils.CommonUtils;

public class Seldemo {

	public WebDriver driver;
    public seldemo1 seldemo1;
	@Given("user is on home page")
	public void userpage() {
	driver = DriverFactory.getDriver();
	seldemo1  =new seldemo1(driver);
		//driver.get("https://demo.seleniumeasy.com/table-records-filter-demo.html");
		
		seldemo1.greenbuttonclick();
	}

	@When("user clicks on green button")
	public void clicks_on_green_button() throws Exception {
		
		seldemo1.greenbuttonclick();
		Thread.sleep(1000);
		
	}
	
	@Then("we get list of green filter records")
	public void we_get_list_of_green_filter_records()
{
		seldemo1.successfullygetgreenrows();
	}
}
