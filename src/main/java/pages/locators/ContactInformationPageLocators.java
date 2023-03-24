package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ContactInformationPageLocators {

	@FindBy(how=How.LINK_TEXT,using="WEATHER")
	public WebElement weatherSection;

	@FindBy(how=How.XPATH,using="//input[@name='address.fullName']")
	public WebElement enterFullName;

	@FindBy(how=How.XPATH,using="//input[@name='address.company']")
	public WebElement enterOrgName;

	@FindBy(how=How.ID,using="awsui-radio-button-1")
	public WebElement clickPlan;

	@FindBy(how=How.XPATH,using="//input[@name='address.phoneNumber']")
	public WebElement enterMobileNumber;

	@FindBy(how=How.CSS,using="#awsui-select-1-textbox > .awsui-select-trigger-label")
	public WebElement clickOnSelectCountry;

	@FindBy(how=How.CSS,using=".awsui-button-variant-primary > span")
	public WebElement clickContinue;

	@FindBy(how=How.XPATH,using="//input[@name='address.addressLine1']")
	public WebElement enterAddress;
	@FindBy(how=How.XPATH,using="//input[@name='address.city']")
	public WebElement enterCity;

	@FindBy(how=How.XPATH,using="//input[@name='address.state']")
	public WebElement enterState;

	@FindBy(how=How.XPATH,using="//input[@name='address.postalCode']")
	public WebElement enterPinCode;

	
	@FindBy(how=How.XPATH,using="//input[@name='agreement']")
	public WebElement acceptAgreement;

	@FindBy(how=How.CSS,using=".awsui-button")
	public WebElement clickContactPageContinue;


	@FindBy(how=How.XPATH,using="//*[@id='map_canvas']/div[1]/div[6]/div/div[1]/div/div/span[4]/b")
	public WebElement getTempofCity;
}
