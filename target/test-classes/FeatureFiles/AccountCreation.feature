@AccountCreation
Feature: Automatic creation of test accounts on prod.
  In order to reduce the manual effort in creating external aws account creation, we run the below feature file for automatic creation

  @AccountCreation
  Scenario Outline: New aws account creation on prod
    #Step1
#    Given user is on signup page of awsconsole website "<url>"
#    Given user enters root user email adress "<address>" and aws account name "<name>"
#    When user clicks on verify email address
#    Then user enter the verification code received in the users mailbox "<folder>" and click on verify
#    And on successful verification user enters root user password "<encrypt>"
#    And user enters reenter the password to confirm "<encrypt>"
#    Then user click on continue
#   #Step2
#    And user click on business plan to use aws
#    And user fill contact details by entering user full name "<FullName>"
#    Then user enter organization name "<OrgName>"
#    Then user enter contact number "<ContactNumber>"
#    Then user select the country "<Country>"
#    And user enter the contact address "<Address>"
#    Then user enter the city "<City>"
#    And user enter the state "<State>"
#    And user enter the pincode "<Pincode>"
#    Then user agree to the terms of the AWS Customer Agreement
#    And user click on continue in the contact page
#   #Step3
#    Then user enter the credit or debit card number in the billing information page "<creditcardNumber>"
#    And user enter the expiration month and year of the card added "<month>" "<year>"
#    And user enter the cardholder name "<cardHolderName>"
#    And user enter the CVV "<cvvNumber>"
#    And user select no to pan
#    Then Update the created account in the project test data management sheet "<address>" "<Country>"
#    Then user click on continue in the billing page
#    #Step4
#    And user choose the country "<Country>"
#    And user enter the contact number to confirm the identity "<mobileNumber>"
#    And user click on send sms
#    Then user click on verify button
#    #Step5
#    And user complete the account sign up
    Then user receives a email notification

    Examples:
      | url                                                       | address        | name         | encrypt    | Country | FullName | OrgName | ContactNumber | Address           | City    | State     | Pincode | creditcardNumber | month | year | cardHolderName | cvvNumber | code | folder | mobileNumber |
      | https://portal.aws.amazon.com/billing/signup#/start/email | hackathontest1 | test account | amazon@123 | India   | testUser | amazon  | +919790946197 | 01 amazon chennai | Chennai | TamilNadu | 600001  | 4160211517807021 | 12    | 23   | kesavarao      | 280       | 000  | INBOX  | 9790946197   |
