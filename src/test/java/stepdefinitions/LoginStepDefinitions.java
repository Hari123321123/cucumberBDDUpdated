package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.LoginPage1;
import utils.CommonUtils;

public class LoginStepDefinitions {

    private WebDriver driver;
    private LoginPage1 loginPage1;

/* @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
			driver = new ChromeDriver(options);		
	}
    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }}
*/
    @Given("I am on the OpenCart login page")
    public void i_am_on_the_open_cart_login_page() {
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        loginPage1 = new LoginPage1(driver);

    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        loginPage1.enterEmail("qatestertest@gmail.com");
        loginPage1.enterPassword("Test@123");
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        loginPage1.enterEmail(username);
        loginPage1.enterPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage1.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
       Assert.assertEquals(loginPage1.checkLogoutLink(), true);
    }



    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String errorMessage) {
        // Assert that an error message is displayed on the page matching the expected error message
        Assert.assertEquals( driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
    }

    @When("I click on the \"Forgotten Password\" link")
    public void i_click_on_the_forgotten_password_link() {
        loginPage1.clickForgottenPasswordLink();
    }

    @Then("I should be redirected to the password reset page")
    public void i_should_be_redirected_to_the_password_reset_page() {
        // Assert that the current URL contains the password reset page route
        Assert.assertTrue(loginPage1.getForgotPwdPageUrl().contains("account/forgotten"));
    }
}

