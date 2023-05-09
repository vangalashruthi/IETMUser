package net.user.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.user.pages.SQUserPage;
import net.user.utility.BrowserOpen;


public class SQ_User_StepDef {


	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	SQUserPage squserpage;
	
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		 squserpage = new SQUserPage(driver);
		
		
	    
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		squserpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		squserpage.clickSubmit();
		
	   
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String securityquestions) throws InterruptedException {
		
	   Thread.sleep(2000);
		squserpage.clickSecurityQuestions();
		
	}
	@Then("user is to verify the Question1 textbox")
	public void user_is_to_verify_the_question1_textbox() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.question1Textbox();
	    
	}
	@Then("user is to verify the Question2 textbox")
	public void user_is_to_verify_the_question2_textbox() {
		
		squserpage.question2Textbox();
	    
	}
	@Then("user is to verify the Answer1 textbox")
	public void user_is_to_verify_the_answer1_textbox() {
		
		squserpage.answer1Textbox();
	   
	}
	@Then("user is to verify the Answer2 textbox")
	public void user_is_to_verify_the_answer2_textbox() {
		
		squserpage.answer2Textbox();
	    
	}

	@Then("user is to click the Question1 textbox")
	public void user_is_to_click_the_question1_textbox() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickQuestion1();
	}
	
	@Then("user is to click the Question2 textbox")
	public void user_is_to_click_the_question2_textbox() {
		
		squserpage.clickQuestion2();
		
	}
	
	@Then("user is to click the Answer1 textbox")
	public void user_is_to_click_the_answer1_textbox() {
		
		
		squserpage.clickAnswer1();
	}
	
	@Then("user is to click the Answer2 textbox")
	public void user_is_to_click_the_answer2_textbox() {
		
		squserpage.clickAnswer2();
		
	}
	
	@Then("user is to clear the Question1 textbox")
	public void user_is_to_clear_the_question1_textbox() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clearQuestion1();
	}
	
	@Then("user is to clear the Question2 textbox")
	public void user_is_to_clear_the_question2_textbox() {
		
		squserpage.clearQuestion2();
	}
	
	@Then("user is to clear the Answer1 textbox")
	public void user_is_to_clear_the_answer1_textbox() {
		
		squserpage.clearAnswer1();
	}
	
	@Then("user is to clear the Answer2 textbox")
	public void user_is_to_clear_the_answer2_textbox() {
		
		squserpage.clearAnswer2();
	}
	
	@Then("user is to click the submit button")
	public void user_is_to_click_the_submit_button() {
		
		squserpage.clickSubmitButton();
	}
	
	@Then("user is to enter the value in Question1 textbox")
	public void user_is_to_enter_the_value_in_question1_textbox() {
		
	}
	
	@Then("user is to enter the value in Question2 textbox")
	public void user_is_to_enter_the_value_in_question2_textbox() {
		
	}
	
	@Then("user is to enter the value in Answer1 textbox")
	public void user_is_to_enter_the_value_in_answer1_textbox() {
		
	}
	
	@Then("user is to clear the value in Answer2 textbox")
	public void user_is_to_clear_the_value_in_answer2_textbox() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clearAnswer2();
	}
		
	
	@Then("user is to click the submit1 button")
	public void user_is_to_click_the_submit1_button() {
		
		squserpage.clickSubmitButton();
	}
	
	@Then("user is to clear and enter the value in Question1 textbox")
	public void user_is_to_clear_and_enter_the_value_in_question1_textbox() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.enterQuestion1();
		
	}
	
	@Then("user is to clear and enter the value in Question2 textbox")
	public void user_is_to_clear_and_enter_the_value_in_question2_textbox() {
		
		squserpage.enterQuestion2();
		
	}
	
	@Then("user is to clear and enter the value in Answer1 textbox")
	public void user_is_to_clear_and_enter_the_value_in_answer1_textbox() {
		
		squserpage.enterAnswer1();;
		
	}
	
	@Then("user is to clear and enter the value in Answer2 textbox")
	public void user_is_to_clear_and_enter_the_value_in_answer2_textbox() {
		
		squserpage.enterAnswer2();
		
	}
	
	@Then("user is to click the submit2 button")
	public void user_is_to_click_the_submit2_button() {
		
		squserpage.clickSubmitButton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickHomeButton();
	}
	
	@Then("user is to click the Security Questions")
	public void user_is_to_click_the_security_questions() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickSecurityQuestions();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickBackwardButton();
	}
	
	@Then("user is to click the Security Questions1")
	public void user_is_to_click_the_security_questions1() throws InterruptedException {
		
		//Thread.sleep(1000);
		squserpage.clickSecurityQuestions();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() throws InterruptedException {
		
		//Thread.sleep(1000);
		squserpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		squserpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	}
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() throws InterruptedException {
		
		Thread.sleep(1000);
		squserpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() throws InterruptedException {
		
		squserpage.clickLogoutButton();
		Thread.sleep(1000);
		squserpage.clickNoButton();
		
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() throws InterruptedException {
		
		squserpage.clickLogoutButton();
		Thread.sleep(1000);
		squserpage.clickYesButton();
	}
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
}
