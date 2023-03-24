package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HomePageLocators {


	@FindBy(how=How.ID,using="awsui-input-0")
	public WebElement enterUserEmailAdress;

	@FindBy(how=How.ID,using="awsui-input-1")
	public WebElement enterAccountName;

	@FindBy(how=How.CSS,using=".awsui-button-variant-primary")
	public WebElement clickVerifyEmail;

	@FindBy(how=How.ID,using="awsui-input-3")
	public WebElement enterUserPassword;

	@FindBy(how=How.ID,using="awsui-input-4")
	public WebElement reEnterPassword;

	@FindBy(how=How.CSS,using=".awsui-button-variant-primary > span")
	public WebElement clickContinue;

}
