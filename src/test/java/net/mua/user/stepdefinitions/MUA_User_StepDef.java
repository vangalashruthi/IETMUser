package net.mua.user.stepdefinitions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.user.pages.MUAUserPage;
import net.user.utility.BrowserOpen;


public class MUA_User_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	MUAUserPage  muauserpage;
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	   muauserpage = new MUAUserPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		muauserpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		muauserpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		muauserpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageUserActivity) {
		
		muauserpage.clickManageUserActivity();	
	}
	
	@Then("user is to click the From Date Textbox")
	public void user_is_to_click_the_from_date_textbox()
	{
		muauserpage.clickFromDate();
	}
	
	@Then("user is to clear the From Date Textbox")
	public void user_is_to_clear_the_from_date_textbox()
	{
		muauserpage.clearFromDate();
	}
	
	@Then("user is to click the To Date Textbox")
	public void user_is_to_click_the_to_date_textbox()
	{
		muauserpage.clickToDate();
	}
	
	@Then("user is to clear the To Date Textbox")
	public void user_is_to_clear_the_to_date_textbox()
	{
		muauserpage.clearToDate();
	}
	
	@Then("user is to click the year on the From Date textbox calender menu")
	public void user_is_to_click_the_year_on_the_from_date_textbox_calender_menu()
	{
		muauserpage.clickFromDate();
		muauserpage.clickYearFromDate();
	}
	
	@Then("user is to select a year on the From Date textbox calendar menu")
	public void user_is_to_select_a_year_on_the_from_date_textbox_calendar_menu()
	{
		muauserpage.selectYearFromDate();
	}
	
	@Then("user is to select a month on the From Date textbox calendar menu")
	public void user_is_to_select_a_month_on_the_from_date_textbox_calendar_menu()
	{
		muauserpage.selectMonthFromDate();
	}
	
	@Then("user is to click the next arrow on the From Date textbox calendar menu")
	public void user_is_to_click_the_next_arrow_on_the_from_date_textbox_calendar_menu()
	{
		muauserpage.clickNextArrowFromDate();
	}
	
	@Then("user is to click the previous arrow on the From Date textbox calendar menu")
	public void user_is_to_click_the_previous_arrow_on_the_from_date_textbox_calendar_menu()
	{
		muauserpage.clickPreviousArrowFromDate();
	}
	
	@Then("user is to select a date on the From Date textbox calendar menu")
	public void user_is_to_select_a_date_on_the_from_date_textbox_calendar_menu()
	{
		muauserpage.selectDateFromDate();
	}
	
	@Then("user is to click the year on the To Date textbox calender menu")
	public void user_is_to_click_the_year_on_the_to_date_textbox_calender_menu()
	{
		muauserpage.clickToDate();
		muauserpage.clickYearToDate();
	}
	
	@Then("user is to select a year on the To Date textbox calendar menu")
	public void user_is_to_select_a_year_on_the_to_date_textbox_calendar_menu()
	{
		muauserpage.selectYearToDate();
	}
	
	@Then("user is to select a month on the To Date textbox calendar menu")
	public void user_is_to_select_a_month_on_the_to_date_textbox_calendar_menu()
	{
		muauserpage.selectMonthToDate();
	}
	
	@Then("user is to click the next arrow on the To Date textbox calendar menu")
	public void user_is_to_click_the_next_arrow_on_the_to_date_textbox_calendar_menu()
	{
		muauserpage.clickNextArrowToDate();
	}
	
	@Then("user is to click the previous arrow on the To Date textbox calendar menu")
	public void user_is_to_click_the_previous_arrow_on_the_to_date_textbox_calendar_menu()
	{
		muauserpage.clickPreviousArrowToDate();
	}
	
	@Then("user is to select a date on the To Date textbox calendar menu")
	public void user_is_to_select_a_date_on_the_to_date_textbox_calendar_menu()
	{
		muauserpage.selectDateToDate();
	}
	
	@Then("user is to click the checkmark button")
	public void user_is_to_click_the_checkmark_button()
	{
		muauserpage.clickCheckmarkButton();
	}
	
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows()
	{
		muauserpage.clickEntries();
	}
	
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list()
	{
		muauserpage.verifyEntries();
	}
	
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list()
	{
		muauserpage.clickEntriesOptions();
	}
	
	@Then("user is to click the Filter icon button")
	public void user_is_to_click_the_filter_icon_button()
	{
		muauserpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Document Access History action")
	public void user_is_to_click_the_document_access_history_action()
	{
		muauserpage.clickDocumentAccessHistory();
	}
	
	@Then("user is to click the Filter icon button1")
	public void user_is_to_click_the_filter_icon_button1()
	{
		muauserpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Account Security Questions action")
	public void user_is_to_click_the_account_security_questions_action()
	{
		muauserpage.clickAccountSecurityQuestions();
	}
	
	@Then("user is to click the Filter icon button2")
	public void user_is_to_click_the_filter_icon_button2()
	{
		muauserpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Annotations History action")
	public void user_is_to_click_the_annotations_history_action()
	{
		muauserpage.clickAnnotationsHistory();
	}
	
	@Then("user is to click the Filter icon button3")
	public void user_is_to_click_the_filter_icon_button3()
	{
		muauserpage.clickFilterIconButton();
	}
	
	@Then("user is to click the All action")
	public void user_is_to_click_the_all_action()
	{
		muauserpage.clickAllAction();
	}
	
	@Then("user is to click the search textbox")
	public void user_is_to_click_the_search_textbox()
	{
		muauserpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the search textbox")
	public void user_is_to_clear_the_search_textbox()
	{
		muauserpage.clearSearchTextbox();
	}
	
	@Then("user is to enter the page name in the search textbox")
	public void user_is_to_enter_the_page_name_in_the_search_textbox()
	{
		muauserpage.enterPageName();
	}
	
	@Then("user is to verify the User activities related to page name")
	public void user_is_to_verify_the_User_activities_related_to_page_name()
	{
		muauserpage.userActivities();
	}
	
	@Then("user is to click the search textbox1")
	public void user_is_to_click_the_search_textbox1()
	{
		muauserpage.clearSearchTextbox();
	}
	
	@Then("user is to clear the search textbox1")
	public void user_is_to_clear_the_search_textbox1()
	{
		muauserpage.clearSearchTextbox();
	}
	
	@Then("user is to enter the user name in the search textbox")
	public void user_is_to_enter_the_user_name_in_the_search_textbox()
	{
		muauserpage.enterSearchUserName();
	}
	
	@Then("user is to verify the User activities related to user name")
	public void user_is_to_verify_the_User_activities_related_to_user_name()
	{
		muauserpage.userActivities();
	}
	
	@Then("user is to click the Sorting icons")
	public void user_is_to_click_the_Sorting_icons()
	{
		muauserpage.clickSortingIcons();
	}
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_Next_button()
	{
		muauserpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_Previous_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		muauserpage.clickPreviousButton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		muauserpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage User Activity")
	public void user_is_to_click_the_manage_user_activity()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USER ACTIVITY']")));
		muauserpage.clickManageUserActivity();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		muauserpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		muauserpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage User Activity1")
	public void user_is_to_click_the_manage_user_activity1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USER ACTIVITY']")));
		muauserpage.clickManageUserActivity();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		muauserpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		muauserpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
	    muauserpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		muauserpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		muauserpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		muauserpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		muauserpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		muauserpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		muauserpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		muauserpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		muauserpage.clickYesButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
}
