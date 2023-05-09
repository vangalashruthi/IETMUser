package net.user.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EIUserPage {
	
	WebDriver driver;
	
	public EIUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' ENTER IETM ']")
	WebElement enterIetm;
	
	@FindBy(how = How.XPATH ,using= "//h5[text()='General Information']")
	WebElement generalInformationModule;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Abbreviations']")
	WebElement abbreviationsContent;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Videos used in this IETM']")
	WebElement videosUsedInThisIetmContent;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Terms and Definitions']")
	WebElement termsAndDefinitions;
	
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Next Topic']")
	WebElement nextButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Previous Topic']")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' Related Content ']")
	WebElement relatedContentButton;
	
	@FindBy(how = How.XPATH ,using= "//a[@title='demo']")
	WebElement demo;
	
	
	@FindBy(how = How.ID ,using= "localsearch")
	WebElement searchTextBox;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='Extra']")
	WebElement relatedText;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Feedback to Administrator']")
	WebElement feedbackToAdministrator;
	
	@FindBy(how = How.XPATH ,using= "//button[@aria-label='Close']")
	WebElement closeFeedback;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-notepad']")
	WebElement notes;
	
	@FindBy(how = How.XPATH ,using= "//button[@aria-label='Close']")
	WebElement closeNotes;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Zoom']")
	WebElement zoomDropdownAction;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Increase']")
	WebElement increase;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Decrease']")
	WebElement decrease;
	
	@FindBy(how = How.XPATH ,using= "//div[contains(@class,'min-slider')]")
	WebElement slider;
	
	@FindBy(how = How.XPATH ,using= "//i[@title='Reset']")
	WebElement reset;
	
	@FindBy(how = How.ID ,using= "fullscreen-trigger")
	WebElement fullScreen;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-bookmark']")
	WebElement bookmarkAction;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[last()]")
	WebElement closeBookmark;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-search']")
	WebElement searchAction;
	
	@FindBy(how = How.XPATH ,using= "//button[contains(@title,' Back')]")
	WebElement backButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Manuals']")
	WebElement manualsButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Drawings']")
	WebElement drawingsButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Glossary']")
	WebElement glossaryButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Home']")
	WebElement homeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Modules']")
	WebElement modulesButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-arrow-left']")
	WebElement backwardButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-arrow-right']")
	WebElement forwardButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Help']")
	WebElement helpButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='About IETM']")
	WebElement aboutIetm;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='How to Use IETM?']")
	WebElement howToUseIetm;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Version & Revision History']")
	WebElement versionHistory;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Logout']")
	WebElement logoutButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[last()]")
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' NO']")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[text()='YES'])[last()]")
	WebElement yesButton;
	
	public void enterUserName()
	{
		username.click();
		username.sendKeys("shruthi");
	}
	
	public void enterPassword()
	{
		password.click();
		password.sendKeys("12345");
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	public void clickEnterIETM()
	{
		enterIetm.click();
	}
	
	public void clickGeneralnformationModule()
	{
		generalInformationModule.click();
	}
	
	public void clickVideosUsedContent()
	{
		videosUsedInThisIetmContent.click();
	}
	
	public void clickAbbreviationsContent()
	{
		abbreviationsContent.click();
	}
	
	public void clickTermsandDefinitions()
	{
		termsAndDefinitions.click();
	}
	
	
	public void clickNextButton()
	{
		nextButton.click();
	}
	
	public void clickPreviousButton()
	{
		previousButton.click();
	}
	
	public void clickRelatedContentButton()
	{
		relatedContentButton.click();
	}
	
	public void clickDemo()
	{
		demo.click();
	}
	
	
	public void clickSearchTextbox()
	{
		searchTextBox.click();
	}
	
	public void clearSearchTextBox()
	{
		searchTextBox.clear();
	}
	
	public void enterSearchTextBox()
	{
		searchTextBox.sendKeys("extra");
	}
	
	public void verifyRelatedText()
	{
		relatedText.isDisplayed();
	}
	
	public void clickFeedbackToAdministrator()
	{
		feedbackToAdministrator.click();
	}
	
	public void clickCloseFeedback()
	{
		closeFeedback.click();
	}
	
	public void clickNotes()
	{
		notes.click();
	}
	public void clickcloseNotes()
	{
		closeNotes.click();
	}
	public void clickZoomDropdown()
	{
		zoomDropdownAction.click();
	}
	public void clickIncrease()
	{
		increase.click();
	}
	public void clickDecrease()
	{
		decrease.click();
	}
	public void clickSlider()
	{
		slider.click();
	}
	public void clickReset()
	{
		reset.click();
	}
	public void clickFullScreen()
	{
		fullScreen.click();
	}
	public void clickEscape() throws AWTException
	{
		Robot rb = new Robot();
		
	  rb.keyPress(KeyEvent.VK_ESCAPE);
	  rb.keyRelease(KeyEvent.VK_ESCAPE);
	  
	}
	public void clickBookmarkAction()
	{
		bookmarkAction.click();
	}
	public void closeBookmarkAction()
	{
		closeBookmark.click();
	}
	public void clickSearchAction()
	{
		searchAction.click();
	}
	public void clickBackButton()
	{
		backButton.click();
	}
	public void clickManualsButton()
	{
		manualsButton.click();
	}
	public void clickDrawingsButton()
	{
		drawingsButton.click();
	}
	public void clickGlossarybutton()
	{
		glossaryButton.click();
	}
	public void clickHomeButton()
	{
		homeButton.click();
	}
	
	public void clickModulesButton()
	{
		modulesButton.click();
	}
	
	public void clickBackwardButton()
	{
		backwardButton.click();
	}
	
	public void clickForwardButton()
	{
		forwardButton.click();
	}
	
	public void clickHelpButton()
	{
		helpButton.click();
	}
	
	public void aboutIetmButton()
	{
		aboutIetm.isDisplayed();
	}
	
	public void howToUseButton()
	{
		howToUseIetm.isDisplayed();
	}
	
	public void versionHistoryButton()
	{
		versionHistory.isDisplayed();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
	
	public void clickNoButton()
	{
		noButton.click();
	}
	
	public void clickYesButton()
	{
		yesButton.click();
	}
	
	
	
	
}
