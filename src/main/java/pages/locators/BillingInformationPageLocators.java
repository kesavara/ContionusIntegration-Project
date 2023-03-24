package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BillingInformationPageLocators {

	@FindBy(how=How.XPATH,using="//div[@class='awsui-input-container']//input[@name='cardNumber']")
	public WebElement enterCreditCardNumber;

	@FindBy(how=How.XPATH,using="//div[@class=\"awsui-select-trigger-wrapper\"]//span[text()='Month']")
	public WebElement clickMonthDropdown;

	@FindBy(how=How.XPATH,using="//div[@class='awsui-select-dropdown-options-container']//li/div[@title='January']")
	public WebElement selectMonthValue;

	@FindBy(how=How.XPATH,using="//div[@class='awsui-select-trigger-wrapper']//span[text()='Year']")
	public WebElement clickYearDropdown;

	@FindBy(how=How.XPATH,using="//div[@class='awsui-select-dropdown-options-container']//li/div[@title='2026']")
	public WebElement selectYearValue;

	@FindBy(how=How.XPATH,using="//div[@class='awsui-input-container']//input[@name='accountHolderName']")
	public WebElement accountHolderName;

	@FindBy(how=How.XPATH,using="//div[@class='awsui-input-container']//input[@name='sor.cvv']")
	public WebElement enterCVV;


	//div[@class="awsui-radio-button"]//div[@class="awsui-radio-button-label-text"]//span[text()='Use my contact address']
	@FindBy(how=How.XPATH,using="//div[@class=\"awsui-radio-button\"]//div[@class=\"awsui-radio-button-label-text\"]//span[text()='Use my contact address']")
	public WebElement selectExistingAddress;
	@FindBy(how=How.XPATH,using="//awsui-radio-group[@id='sor.panStatus']//input[@value='No']")
	public WebElement selectNoPan;


	@FindBy(how=How.CSS,using=".awsui-button-variant-primary > span:nth-child(1)")
	public WebElement clickBillPageContinue;

	@FindBy(how=How.CSS,using="#atmpin")
	public WebElement enterPin;


	@FindBy(how=How.CSS,using="#submitId1")
	public WebElement clickSubmit;

	@FindBy(how=How.XPATH,using="//input[@class='awsui-input awsui-input-type-text']")
	public WebElement enterVerificationCode;

	@FindBy(how=How.XPATH,using="//button[@class='awsui-button awsui-button-variant-primary awsui-hover-child-icons']")
	public WebElement clickOnVerify;


	//  enter send keys
	//.awsui-button-variant-primary click button

}
