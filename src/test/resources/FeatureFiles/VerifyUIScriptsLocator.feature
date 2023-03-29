@VerifyingUIScriptLocators
Feature: Verify the UI automation scripts are not breaking due to new changes on the UI.
  In order to reduce the manual effort in identifying and fixing the UI automation scripts, below test helps us to identify the test failures upfront

  @VerifyingUIScriptLocators
  Scenario Outline:Verify the UI automation scripts are not breaking due to new changes on the UI.
    #Step1
    Given user is on signup page of awsconsole website "<url>"
    Then validate if the locators used in the automation script are valid
      |//button[@data-testid='charges-by-account']|
      |//button[@data-testid='invoices']|
      |//button[@data-testid='savings']|
      |//span[normalize-space()='Payment information']|
      |//*[normalize-space()='Account ID']|
    Then Email notification is sent with the test result attached to the mailbox


    Examples:
      | url                         |
      | https://console.aws.amazon.com/console/home|