package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ContactInformationPageLocators;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class ContactInformationPageActions {

	ContactInformationPageLocators ContactInfoPageLocators =null;
	public ContactInformationPageActions()
	{
		
		this.ContactInfoPageLocators =new ContactInformationPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ContactInfoPageLocators);
	}

	public void enterFullName(String name){
		ContactInfoPageLocators.enterFullName.sendKeys(name);
	}
	public void enterOrgName(String name){
		ContactInfoPageLocators.enterOrgName.sendKeys(name);
	}

	public void selectPlan(){
		ContactInfoPageLocators.clickPlan.click();
	}

	public void enterContactNumber(String number){
		ContactInfoPageLocators.enterMobileNumber.sendKeys(number);
	}
	public void enterAddress(String address){
		ContactInfoPageLocators.enterAddress.sendKeys(address);
	}

	public void enterCityName(String city){
		ContactInfoPageLocators.enterCity.sendKeys(city);
	}
	public void enterStateName(String state){
		ContactInfoPageLocators.enterState.sendKeys(state);
	}
	public void enterPinCode(String code){
		ContactInfoPageLocators.enterPinCode.sendKeys(code);
	}

	public void acceptAgreement(){
		ContactInfoPageLocators.acceptAgreement.click();
	}

	public void clickOnContactPageContinue() throws InterruptedException {
		ContactInfoPageLocators.clickContactPageContinue.click();
		Thread.sleep(2000);
	}

	public void selectCountry(){
      ContactInfoPageLocators.clickOnSelectCountry.click();

	}


}
