package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {
	
	HomePageLocators HomePageLocators =null;
	public HomePageActions()
	{
		
		this.HomePageLocators =new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), HomePageLocators);
	}

	public void enterUserEmail(String address){
		HomePageLocators.enterUserEmailAdress.sendKeys(address);
	}
	public void enterAccountName(String name){
		HomePageLocators.enterAccountName.sendKeys(name);
	}
	public void clickOnVerifyEmail() throws InterruptedException {
		HomePageLocators.clickVerifyEmail.click();
	}
	public void enterPassword(String password){
		HomePageLocators.enterUserPassword.sendKeys(password);
	}
	public void reEnterPassword(String name){
		HomePageLocators.reEnterPassword.sendKeys(name);
	}
	public void clickOnContinue() throws InterruptedException {
		HomePageLocators.clickContinue.click();
		Thread.sleep(2000);
	}

}
