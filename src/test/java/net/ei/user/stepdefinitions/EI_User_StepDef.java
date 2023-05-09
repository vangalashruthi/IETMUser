package net.ei.user.stepdefinitions;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.user.pages.EIUserPage;
import net.user.utility.BrowserOpen;


public class EI_User_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	EIUserPage eiuserpage;
	
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	    eiuserpage = new EIUserPage(driver);
		
	}
	
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	}
	
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		eiuserpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		eiuserpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		eiuserpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String enterIETM) {
		
		eiuserpage.clickEnterIETM();	
	}
	
	@Then("user is to click General Information module")
	public void user_is_to_click_general_information_module()
	{
		eiuserpage.clickGeneralnformationModule();
	}
	
	@Then("user is to click the Abbreviations content")
	public void user_is_to_click_the_abbreviations_content()
	{
		eiuserpage.clickAbbreviationsContent();
	}
	
	@Then("user is to click the videos used in this IETM content")
	public void user_is_to_click_the_videos_used_in_this_ietm_content()
	{
		eiuserpage.clickVideosUsedContent();
	}
	
	@Then("user is to click the Terms and Definitions content")
	public void user_is_to_click_the_terms_and_definitions_content()
	{
		eiuserpage.clickTermsandDefinitions();
	}
	
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		eiuserpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		eiuserpage.clickPreviousButton();
	}
	
	@Then("user is to click the Related Content button")
	public void user_is_to_click_the_related_Content_button()
	{
		eiuserpage.clickRelatedContentButton();
	}
	
	@Then("user is to click the Demo in Related content dropdown")
	public void user_is_to_click_the_demo_in_related_content_dropdown()
	{
		eiuserpage.clickDemo();
	}
	
	
	@Then("user is to click the Search Textbox")
	public void user_is_to_click_the_search_textbox()
	{
		eiuserpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the Search Textbox")
	public void user_is_to_clear_the_search_textbox()
	{
		eiuserpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the Search Textbox")
	public void user_is_to_enter_the_search_textbox()
	{
		eiuserpage.enterSearchTextBox();
	}
	
	@Then("user is to verify the related text")
	public void user_is_to_verify_the_related_text()
	{
		eiuserpage.verifyRelatedText();
	}
	
	@Then("user is to click the Feedback to Administrator action")
	public void user_is_to_click_the_feedback_to_administrator_action() throws InterruptedException
	{
		Thread.sleep(1000);
		eiuserpage.clickFeedbackToAdministrator();
	}
	
	@Then("user is to close the Feedback to Administrator action")
	public void user_is_to_close_the_feedback_to_administrator_action() throws InterruptedException 
	{
		Thread.sleep(1000);
		eiuserpage.clickCloseFeedback();
	}
	
	@Then("user is to click the Notes action")
	public void user_is_to_click_the_notes_action() 
	{
		eiuserpage.clickNotes();
	}
	
	@Then("user is to close the Notes action")
	public void user_is_to_close_the_notes_action()
	{
		eiuserpage.clickcloseNotes();
	}
	
	@Then("user is to click the Zoom dropdown action")
	public void user_is_to_click_the_zoom_dropdown_action()
	{
		eiuserpage.clickZoomDropdown();
	}
	
	@Then("user is to click the Increase")
	public void user_is_to_click_the_increase()
	{
		eiuserpage.clickIncrease();
	}
	
	@Then("user is to click the Decrease")
	public void user_is_to_click_the_decrease() 
	{
		eiuserpage.clickDecrease();
	}
	
	@Then("user is to click the Slider")
	public void user_is_to_click_the_slider() 
	{
		eiuserpage.clickSlider();
	}
	
	@Then("user is to click the Reset")
	public void user_is_to_click_the_reset()
	{
		eiuserpage.clickReset();
	}
	
	@Then("user is to click the FullScreen action")
	public void user_is_to_click_the_fullscreen_action()
	{
		eiuserpage.clickFullScreen();
	}
	
	@Then("user is to click the Escape key in keyboard")
	public void user_is_to_click_the_escape_key_in_keyboard() throws AWTException
	{
		eiuserpage.clickEscape();
	}
	
	@Then("user is to click the Bookmark action")
	public void user_is_to_click_the_bookmark_action()
	{
		eiuserpage.clickBookmarkAction();
	}
	
	@Then("user is to close the Bookmark action")
	public void user_is_to_close_the_bookmark_action()
	{
		eiuserpage.closeBookmarkAction();
	}
	
	@Then("user is to click the Search action")
	public void user_is_to_click_the_search_action()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='lni lni-search']")));
		eiuserpage.clickSearchAction();
	}
	
	@Then("user is to click the Back navigation button")
	public void user_is_to_click_the_back_navigation_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@title,' Back')]")));
		eiuserpage.clickBackButton();
	}
	
	@Then("user is to click the Manuals button")
	public void user_is_to_click_the_manuals_button()
	{
		eiuserpage.clickManualsButton();
	}
	
	@Then("user is to click the Drawings button")
	public void user_is_to_click_the_drawings_button()
	{
		eiuserpage.clickDrawingsButton();
	}
	
	@Then("user is to click the Glossary button")
	public void user_is_to_click_the_glossary_button()
	{
		eiuserpage.clickGlossarybutton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		eiuserpage.clickHomeButton();
	}
	
	@Then("user is to click the Enter IETM")
	public void user_is_to_click_the_enter_ietm()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' ENTER IETM ']")));
		eiuserpage.clickEnterIETM();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		eiuserpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		eiuserpage.clickBackwardButton();
	}
	
	@Then("user is to click the Enter IETM1")
	public void user_is_to_click_the_enter_ietm1() throws InterruptedException {
		
	//	Thread.sleep(6000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
    //	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' ENTER IETM ']")));
		eiuserpage.clickEnterIETM();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		eiuserpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		eiuserpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	    eiuserpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		eiuserpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		eiuserpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		eiuserpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()   {
		
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[last()]")));
		eiuserpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		eiuserpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		eiuserpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		eiuserpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='YES'])[last()]")));
		eiuserpage.clickYesButton();
	}
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
