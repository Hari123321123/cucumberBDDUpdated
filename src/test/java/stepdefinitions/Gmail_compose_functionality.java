package stepdefinitions;

import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonUtils;
import pages.GmailLoginPage;
import pages.gmailcomposePage;

public class Gmail_compose_functionality {
	WebDriver driver;

	private gmailcomposePage gmailcomposePage;
	
	@Given("User is on the Gmail homepage")
	public void user_is_on_the_gmail_homepage() {
        driver = DriverFactory.getDriver();
		GmailLoginPage p=new GmailLoginPage(driver);
		
		 p.enteremailaddress();
		 p.clickonNextButton();
		
	}

	@When("User clicks on the compose button")
	public void user_clicks_on_the_button(String string) {
		
		gmailcomposePage.clickOncomposeButton();
	    
	}
	@When("User clicks on the Send button")
	public void user_clicks_on_the_send_button() {
		gmailcomposePage.clickOnsendButton();
	}

	@Then("User should see a new email composing window")
	public void user_should_see_a_new_email_composing_window() {
	   
		gmailcomposePage.composewindowelementpresent();
	}

	@Then("User should be able to enter email recipients, subject, message body, and attachments")
	public void user_should_be_able_to_enter_email_recipients_subject_message_body_and_attachments() {
	    
	    
	}

	@Then("User should see options to add Cc and Bcc recipients")
	public void user_should_see_options_to_add_cc_and_bcc_recipients() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User should be able to close the compose window without sending the email")
	public void user_should_be_able_to_close_the_compose_window_without_sending_the_email() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("User is composing a new email")
	public void user_is_composing_a_new_email() {
	   
	    
	}

	@When("User enters recipient, subject, and message body")
	public void user_enters_recipient_subject_and_message_body() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The email should be saved as a draft in the Drafts folder")
	public void the_email_should_be_saved_as_a_draft_in_the_drafts_folder() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User should be able to access the saved draft later")
	public void user_should_be_able_to_access_the_saved_draft_later() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("User has composed a new email")
	public void user_has_composed_a_new_email() {
	    
	}

	@Then("The email should be sent successfully")
	public void the_email_should_be_sent_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User should see a confirmation message")
	public void user_should_see_a_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User adds attachments of {string}")
	public void user_adds_attachments_of(String string) {
	    
	}


	@Then("The attachments should be successfully attached to the email")
	public void the_attachments_should_be_successfully_attached_to_the_email() {
	    
	}

	@Then("User should be able to send the email with attachments")
	public void user_should_be_able_to_send_the_email_with_attachments() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User leaves the email composing window")
	public void user_leaves_the_email_composing_window() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The email content should be auto-saved periodically")
	public void the_email_content_should_be_auto_saved_periodically() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User should see the auto-saved version when returning to compose the email")
	public void user_should_see_the_auto_saved_version_when_returning_to_compose_the_email() {
	    // Write code here that turns the phrase above into concrete actions
	}

}
