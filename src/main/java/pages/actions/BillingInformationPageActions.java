package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.BillingInformationPageLocators;
import pages.locators.ContactInformationPageLocators;
import utils.SeleniumDriver;


import java.util.List;

public class BillingInformationPageActions {

	BillingInformationPageLocators BillingInfoPageLocators =null;
	public BillingInformationPageActions()
	{
		
		this.BillingInfoPageLocators =new BillingInformationPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), BillingInfoPageLocators);
	}

	public void enterCreditCardNumber(String number){
//		SeleniumDriver.getDriver().findElement(By.xpath("//button[@class=\"awsccc-u-btn awsccc-u-btn-primary\"]")).click();

		BillingInfoPageLocators.enterCreditCardNumber.sendKeys(number);
	}
	public void clickMonthDropdown(){
		BillingInfoPageLocators.clickMonthDropdown.click();
	}

	public void selectMonth(String month){
		BillingInfoPageLocators.selectMonthValue.click();
	}
	public void clickYearDropdown(){
		BillingInfoPageLocators.clickYearDropdown.click();
	}

	public void selectYear(String year){
		BillingInfoPageLocators.selectYearValue.click();
	}

	public void enterCardHolderName(String name){
		BillingInfoPageLocators.accountHolderName.sendKeys(name);
	}


	public void enterCVVNumber(String number){
		BillingInfoPageLocators.enterCVV.sendKeys(number);
	}
	public void selectNoToPan() throws InterruptedException {

		BillingInfoPageLocators.selectNoPan.click();
//		Thread.sleep(10000);
	}
	public void clickContinueOnBillingPage(){
		BillingInfoPageLocators.clickBillPageContinue.click();
	}

	public void selectExpiryMonth(String month){
		Select se = new Select(SeleniumDriver.getDriver().findElement(By.cssSelector("#expMonth")));
		se.selectByValue(month);
	}
	public void selectExpiryYear(String year){
		Select se = new Select(SeleniumDriver.getDriver().findElement(By.cssSelector("#expYear")));
		se.selectByValue(year);
	}
	public void enterAtmPin(String  number){
		BillingInfoPageLocators.enterPin.sendKeys(number);
	}
	public void clickSubmit(){
		BillingInfoPageLocators.clickSubmit.click();
	}

	public void enterVerificationCode(String  code){
		BillingInfoPageLocators.enterVerificationCode.sendKeys(code);
	}

	public void selectExistingAddress() throws InterruptedException {

		WebElement radioBtn1 = SeleniumDriver.getDriver().findElement(By.xpath("//div[@class=\"awsui-radio-button\"]//label[@id=\"awsui-radio-button-1-label\"]"));
		((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("arguments[0].checked = true;", radioBtn1);

//		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), 20);
//
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"awsui-radio-button-styled-button\"]")));
////		Thread.sleep(3000);
//		List<WebElement> inputRadioBtn = SeleniumDriver.getDriver().findElements(By.xpath("//div[@class=\"awsui-radio-button-styled-button\"]"));
	Thread.sleep(3000);
//		inputRadioBtn.get(0).click();
		//input[@value="Existing"]
		SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='awsui-radio-button-content']//div[@class='awsui-radio-button-description']//p"));
		//span[text()='Use my contact address']")).click();
	//	SeleniumDriver.getDriver().findElement(By.xpath("//input[@value='Existing']")).click();
	//	BillingInfoPageLocators.selectExistingAddress.click();
//		BillingInfoPageLocators.selectExistingAddress.click();
	}
	public void clickOnVerify(){
		BillingInfoPageLocators.clickOnVerify.click();
	}


}
