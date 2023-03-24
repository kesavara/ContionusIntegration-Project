$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AccountCreation.feature");
formatter.feature({
  "line": 2,
  "name": "Automatic creation of test accounts on prod.",
  "description": "In order to reduce the manual effort in creating external aws account creation, we run the below feature file for automatic creation",
  "id": "automatic-creation-of-test-accounts-on-prod.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountCreation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "New aws account creation on prod",
  "description": "",
  "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@AccountCreation"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#Step1"
    },
    {
      "line": 8,
      "value": "#    Given user is on signup page of awsconsole website \"\u003curl\u003e\""
    },
    {
      "line": 9,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 10,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 11,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 12,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 13,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 14,
      "value": "#    Then user click on continue"
    },
    {
      "line": 15,
      "value": "#   #Step2"
    },
    {
      "line": 16,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 17,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 18,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 19,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 21,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 24,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 25,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 26,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 27,
      "value": "#   #Step3"
    },
    {
      "line": 28,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 29,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 30,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user select no to pan"
    },
    {
      "line": 33,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 34,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 35,
      "value": "#    #Step4"
    },
    {
      "line": 36,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 37,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 38,
      "value": "#    And user click on send sms"
    },
    {
      "line": 39,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 40,
      "value": "#    #Step5"
    },
    {
      "line": 41,
      "value": "#    And user complete the account sign up"
    }
  ],
  "line": 42,
  "name": "user receives a email notification",
  "keyword": "Then "
});
formatter.examples({
  "line": 44,
  "name": "",
  "description": "",
  "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;",
  "rows": [
    {
      "cells": [
        "url",
        "address",
        "name",
        "encrypt",
        "Country",
        "FullName",
        "OrgName",
        "ContactNumber",
        "Address",
        "City",
        "State",
        "Pincode",
        "creditcardNumber",
        "month",
        "year",
        "cardHolderName",
        "cvvNumber",
        "code",
        "folder",
        "mobileNumber"
      ],
      "line": 45,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;1"
    },
    {
      "cells": [
        "https://portal.aws.amazon.com/billing/signup#/start/email",
        "hackathontest1",
        "test account",
        "amazon@123",
        "India",
        "testUser",
        "amazon",
        "+919790946197",
        "01 amazon chennai",
        "Chennai",
        "TamilNadu",
        "600001",
        "4160211517807021",
        "12",
        "23",
        "kesavarao",
        "280",
        "000",
        "INBOX",
        "9790946197"
      ],
      "line": 46,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3757591933,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "New aws account creation on prod",
  "description": "",
  "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AccountCreation"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#Step1"
    },
    {
      "line": 8,
      "value": "#    Given user is on signup page of awsconsole website \"\u003curl\u003e\""
    },
    {
      "line": 9,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 10,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 11,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 12,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 13,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 14,
      "value": "#    Then user click on continue"
    },
    {
      "line": 15,
      "value": "#   #Step2"
    },
    {
      "line": 16,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 17,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 18,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 19,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 21,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 24,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 25,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 26,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 27,
      "value": "#   #Step3"
    },
    {
      "line": 28,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 29,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 30,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user select no to pan"
    },
    {
      "line": 33,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 34,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 35,
      "value": "#    #Step4"
    },
    {
      "line": 36,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 37,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 38,
      "value": "#    And user click on send sms"
    },
    {
      "line": 39,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 40,
      "value": "#    #Step5"
    },
    {
      "line": 41,
      "value": "#    And user complete the account sign up"
    }
  ],
  "line": 42,
  "name": "user receives a email notification",
  "keyword": "Then "
});
formatter.match({
  "location": "BillInfoPageSteps.userReceivesAEmailNotification()"
});
formatter.result({
  "duration": 18200896698,
  "error_message": "com.sun.mail.util.MailConnectException: Couldn\u0027t connect to host, port: localhost, 25; timeout -1;\n  nested exception is:\n\tjava.net.ConnectException: Connection refused (Connection refused)\n\tat com.sun.mail.smtp.SMTPTransport.openServer(SMTPTransport.java:2209)\n\tat com.sun.mail.smtp.SMTPTransport.protocolConnect(SMTPTransport.java:740)\n\tat javax.mail.Service.connect(Service.java:366)\n\tat javax.mail.Service.connect(Service.java:246)\n\tat javax.mail.Service.connect(Service.java:195)\n\tat javax.mail.Transport.send0(Transport.java:254)\n\tat javax.mail.Transport.send(Transport.java:124)\n\tat steps.BillInfoPageSteps.userReceivesAEmailNotification(BillInfoPageSteps.java:259)\n\tat ✽.Then user receives a email notification(AccountCreation.feature:42)\nCaused by: java.net.ConnectException: Connection refused (Connection refused)\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:607)\n\tat java.net.Socket.connect(Socket.java:556)\n\tat com.sun.mail.util.SocketFetcher.createSocket(SocketFetcher.java:359)\n\tat com.sun.mail.util.SocketFetcher.getSocket(SocketFetcher.java:238)\n\tat com.sun.mail.smtp.SMTPTransport.openServer(SMTPTransport.java:2175)\n\tat com.sun.mail.smtp.SMTPTransport.protocolConnect(SMTPTransport.java:740)\n\tat javax.mail.Service.connect(Service.java:366)\n\tat javax.mail.Service.connect(Service.java:246)\n\tat javax.mail.Service.connect(Service.java:195)\n\tat javax.mail.Transport.send0(Transport.java:254)\n\tat javax.mail.Transport.send(Transport.java:124)\n\tat steps.BillInfoPageSteps.userReceivesAEmailNotification(BillInfoPageSteps.java:259)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 711218328,
  "status": "passed"
});
formatter.uri("AccountCreation.feature");
formatter.feature({
  "line": 2,
  "name": "Automatic creation of test accounts on prod.",
  "description": "In order to reduce the manual effort in creating external aws account creation, we run the below feature file for automatic creation",
  "id": "automatic-creation-of-test-accounts-on-prod.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AccountCreation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "New aws account creation on prod",
  "description": "",
  "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@AccountCreation"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#Step1"
    },
    {
      "line": 8,
      "value": "#    Given user is on signup page of awsconsole website \"\u003curl\u003e\""
    },
    {
      "line": 9,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 10,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 11,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 12,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 13,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 14,
      "value": "#    Then user click on continue"
    },
    {
      "line": 15,
      "value": "#   #Step2"
    },
    {
      "line": 16,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 17,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 18,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 19,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 21,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 24,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 25,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 26,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 27,
      "value": "#   #Step3"
    },
    {
      "line": 28,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 29,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 30,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user select no to pan"
    },
    {
      "line": 33,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 34,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 35,
      "value": "#    #Step4"
    },
    {
      "line": 36,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 37,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 38,
      "value": "#    And user click on send sms"
    },
    {
      "line": 39,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 40,
      "value": "#    #Step5"
    },
    {
      "line": 41,
      "value": "#    And user complete the account sign up"
    }
  ],
  "line": 42,
  "name": "user receives a email notification",
  "keyword": "Then "
});
formatter.examples({
  "line": 44,
  "name": "",
  "description": "",
  "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;",
  "rows": [
    {
      "cells": [
        "url",
        "address",
        "name",
        "encrypt",
        "Country",
        "FullName",
        "OrgName",
        "ContactNumber",
        "Address",
        "City",
        "State",
        "Pincode",
        "creditcardNumber",
        "month",
        "year",
        "cardHolderName",
        "cvvNumber",
        "code",
        "folder",
        "mobileNumber"
      ],
      "line": 45,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;1"
    },
    {
      "cells": [
        "https://portal.aws.amazon.com/billing/signup#/start/email",
        "hackathontest1",
        "test account",
        "amazon@123",
        "India",
        "testUser",
        "amazon",
        "+919790946197",
        "01 amazon chennai",
        "Chennai",
        "TamilNadu",
        "600001",
        "4160211517807021",
        "12",
        "23",
        "kesavarao",
        "280",
        "000",
        "INBOX",
        "9790946197"
      ],
      "line": 46,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2"
    }
  ],
  "keyword": "Examples"
});
