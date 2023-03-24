package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.actions.ContactInformationPageActions;
import pages.locators.ContactInformationPageLocators;
import utils.SeleniumDriver;

public class ContactInfoPageSteps {
    ContactInformationPageActions contactInfoPageActions = new ContactInformationPageActions();
    @And("^user click on business plan to use aws$")
    public void userClickOnBusinessPlanToUseAws() {
        contactInfoPageActions.selectPlan();
    }

    @And("^user fill contact details by entering user full name \"([^\"]*)\"$")
    public void userFillContactDetailsByEnteringUserFullName(String name) throws Throwable {
       contactInfoPageActions.enterFullName(name);
    }

    @Then("^user enter organization name \"([^\"]*)\"$")
    public void userEnterOrganizationName(String orgName) throws Throwable {
        contactInfoPageActions.enterOrgName(orgName);
    }

    @Then("^user enter contact number \"([^\"]*)\"$")
    public void userEnterContactNumber(String contact) throws Throwable {
       contactInfoPageActions.enterContactNumber(contact);
    }

    @Then("^user select the country \"([^\"]*)\"$")
    public void userSelectTheCountry(String country) throws Throwable {
//        Thread.sleep(2000);


//        ((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("window.scrollBy(0,5000)");
//        Thread.sleep(Long.parseLong("5000"));
        //if present
        if(SeleniumDriver.getDriver().findElement(By.xpath("//button[@class=\"awsccc-u-btn awsccc-u-btn-primary\"]")).isDisplayed()){
            SeleniumDriver.getDriver().findElement(By.xpath("//button[@class=\"awsccc-u-btn awsccc-u-btn-primary\"]")).click();

        }
        else {
            SeleniumDriver.getDriver().findElement(By.cssSelector("span#awsui-select-1-textbox.awsui-select-trigger-textbox")).click();
            SeleniumDriver.getDriver().findElement(By.xpath("//input[@class='awsui-input awsui-input-has-icon-left awsui-input-type-text awsui-input-valid']")).sendKeys(country);
            SeleniumDriver.getDriver().findElement(By.xpath("//div[@class=\"awsui-select-dropdown-options-container\"]//li/div[@title=\"India\"]")).click();
        }
    }

    @And("^user enter the contact address \"([^\"]*)\"$")
    public void userEnterTheContactAddress(String address) throws Throwable {
       contactInfoPageActions.enterAddress(address);
    }

    @Then("^user enter the city \"([^\"]*)\"$")
    public void userEnterTheCity(String city) throws Throwable {
        contactInfoPageActions.enterCityName(city);
    }

    @And("^user enter the state \"([^\"]*)\"$")
    public void userEnterTheState(String state) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        contactInfoPageActions.enterStateName(state);
    }

    @And("^user enter the pincode \"([^\"]*)\"$")
    public void userEnterThePincode(String code) throws Throwable {
       contactInfoPageActions.enterPinCode(code);
    }

    @Then("^user agree to the terms of the AWS Customer Agreement$")
    public void userAgreeToTheTermsOfTheAWSCustomerAgreement() throws InterruptedException {
        contactInfoPageActions.acceptAgreement();
    }

    @And("^user click on continue in the contact page$")
    public void userClickOnContinueInTheContactPage() throws InterruptedException {
        contactInfoPageActions.clickOnContactPageContinue();

    }
}
