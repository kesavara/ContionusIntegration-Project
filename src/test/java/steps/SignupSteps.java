package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.ResultsStorage.ResultsStorage;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import static io.restassured.RestAssured.given;


public class SignupSteps extends ResultsStorage {


	public Response resp;
	public static double ApiTemperature;
	public static  double TemperatureFromNDTVWeather;
	public Boolean ComaprisonOutput;
	public String shortId="";

	public static double getphase1Temp() {
		return ApiTemperature ;
	}

	public static double getphase2Temp() {
		return TemperatureFromNDTVWeather ;
	}


	HomePageActions homePageActions = new HomePageActions();

	@Given("^I am on the Home Page \"([^\"]*)\" of awsconsole website$")
	public void i_am_on_the_Home_Page_of_awsconsole_website(String webSiteURL) throws InterruptedException {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}
	@Given("^user is on signup page of aws-console website \"([^\"]*)\"$")
	public void user_is_on_signup_page_of_awsconsole_website(String arg0) throws Throwable {
		SeleniumDriver.openPage(arg0);
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}


	@Given("^user is on signup page of awsconsole website \"([^\"]*)\"$")
	public void userIsOnSignupPageOfAwsconsoleWebsite(String url) throws Throwable {
//		SeleniumDriver.openPage(url);
		SeleniumDriver.OpenChromeDriver();
		// Write code here that turns the phrase above into concrete actions
//		throw new PendingException();
	}


	@Given("^user enters root user email adress \"([^\"]*)\" and aws account name \"([^\"]*)\"$")
	public void userEntersRootUserEmailAdressAndAwsAccountName(String address, String name) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		shortId = RandomStringUtils.randomAlphanumeric(6);
		System.out.println("Email address is -------"+address+"+"+shortId+"@outlook.com");
		homePageActions.enterUserEmail(address+"+"+shortId+"@outlook.com");
		homePageActions.enterAccountName(name);

	}
	@Then("^Update the created account in the project test data management sheet \"([^\"]*)\"$")
	public void updateTheCreatedAccountInTheProjectTestDataManagementSheet(String address) throws Throwable {
		// Creating file object of existing excel file
		String emailAddress = "+address+"+shortId+"@outlook.com";
				File xlsxFile = new File("/Users/kragi/Documents/pers/learn/my-project/Selenium/EndToEndTestig_WeatherReportComparison-master/src/test/resources/ProjectTestData.xlsx");

		//New students records to update in excel file
		Object[][] newStudents = {
				{emailAddress, "amazon@123", "CreditCard", String.valueOf(new Date()),}
		};

		try {
			//Creating input stream
			FileInputStream inputStream = new FileInputStream(xlsxFile);

			//Creating workbook from input stream
			Workbook workbook = WorkbookFactory.create(inputStream);

			//Reading first sheet of excel file
			Sheet sheet = workbook.getSheetAt(0);

			//Getting the count of existing records
			int rowCount = sheet.getLastRowNum();

			//Iterating new students to update
			for (Object[] student : newStudents) {

				//Creating new row from the next row count
				Row row = sheet.createRow(++rowCount);

				int columnCount = 0;

				//Iterating student informations
				for (Object info : student) {

					//Creating new cell and setting the value
					Cell cell = row.createCell(columnCount++);
					if (info instanceof String) {
						cell.setCellValue((String) info);
					} else if (info instanceof Integer) {
						cell.setCellValue((Integer) info);
					}
				}
			}
			//Close input stream
			inputStream.close();

			//Crating output stream and writing the updated workbook
			FileOutputStream os = new FileOutputStream(xlsxFile);
			workbook.write(os);

			//Close the workbook and output stream
			workbook.close();
			os.close();

			System.out.println("Excel file has been updated successfully.");

		} catch (EncryptedDocumentException | IOException e) {
			System.err.println("Exception while updating an existing excel file.");
			e.printStackTrace();
		}
	}


	@When("^user clicks on verify email address$")
	public void userClicksOnVerifyEmailAddress() throws InterruptedException {
		homePageActions.clickOnVerifyEmail();
		Thread.sleep(10000);
	}

	@And("^on successful verification user enters root user password \"([^\"]*)\"$")
	public void onSuccessfulVerificationUserEntersRootUserPassword(String password) throws Throwable {
		homePageActions.enterPassword(password);
	}

	@And("^user enters reenter the password to confirm \"([^\"]*)\"$")
	public void userEntersReenterThePasswordToConfirm(String password) throws Throwable {
		homePageActions.reEnterPassword(password);
	}

	@Then("^user click on continue$")
	public void userClickOnContinue() throws InterruptedException {
		homePageActions.clickOnContinue();
	}

	@Given("^user login$")
	public void userLogin() throws InterruptedException {
		SeleniumDriver.openPage("https://portal.aws.amazon.com/billing/signup?type=resubscribe#/account");
		Thread.sleep(2000);
		SeleniumDriver.getDriver().findElement(By.id("resolving_input")).sendKeys("hackathontest1+PmMSNq@outlook.com");
		SeleniumDriver.getDriver().findElement(By.id("next_button")).click();
		Thread.sleep(20000);
		SeleniumDriver.getDriver().findElement(By.id("password")).sendKeys("amazon@123");
		SeleniumDriver.getDriver().findElement(By.id("signin_button")).click();
		Thread.sleep(5000);

	}

	@Then("^Update the created account in the project test data management sheet \"([^\"]*)\" \"([^\"]*)\"$")
	public void updateTheCreatedAccountInTheProjectTestDataManagementSheet(String address, String country) throws Throwable {
		// Creating file object of existing excel file
		String emailAddress = address+"+"+shortId+"@outlook.com";

		WebElement accountIdElement = SeleniumDriver.getDriver().findElement(By.id("accountId"));
		String accountId = accountIdElement.getAttribute("value");


		WebElement customerIdElement = SeleniumDriver.getDriver().findElement(By.id("customerId"));
		String customerId = customerIdElement.getAttribute("value");

		File xlsxFile = new File("/Users/kragi/Documents/pers/learn/my-project/Selenium/AutomaticAccountsCreation/src/test/resources/ProjectTestData.xlsx");

		Object[][] accountInfo = {
				{accountId,customerId,emailAddress, "amazon@123", "CreditCard", String.valueOf(new Date()),country,System.getProperty("user.name"),"No"}
		};

		try {
			//Creating input stream
			FileInputStream inputStream = new FileInputStream(xlsxFile);

			//Creating workbook from input stream
			Workbook workbook = WorkbookFactory.create(inputStream);

			//Reading first sheet of excel file
			Sheet sheet = workbook.getSheetAt(0);

			//Getting the count of existing records
			int rowCount = sheet.getLastRowNum();

			//Iterating new students to update
			for (Object[] student : accountInfo) {

				//Creating new row from the next row count
				Row row = sheet.createRow(++rowCount);

				int columnCount = 0;

				//Iterating student informations
				for (Object info : student) {

					//Creating new cell and setting the value
					Cell cell = row.createCell(columnCount++);
					if (info instanceof String) {
						cell.setCellValue((String) info);
					} else if (info instanceof Integer) {
						cell.setCellValue((Integer) info);
					}
				}
			}
			//Close input stream
			inputStream.close();

			//Crating output stream and writing the updated workbook
			FileOutputStream os = new FileOutputStream(xlsxFile);
			workbook.write(os);

			//Close the workbook and output stream
			workbook.close();
			os.close();

			System.out.println("Excel file has been updated successfully.");

		} catch (EncryptedDocumentException | IOException e) {
			System.err.println("Exception while updating an existing excel file.");
			e.printStackTrace();
		}
	}

	@Given("^user opens the chrome dev tool$")
	public void userOpensTheChromeDevTool() {

	}

	@Given("^Open browser$")
	public void openBrowser() {
		SeleniumDriver.OpenChromeDriver();
	}
}
