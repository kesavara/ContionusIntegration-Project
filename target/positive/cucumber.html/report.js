$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/OpenChromedevtool.feature");
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 11,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 12,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 13,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 14,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 15,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 16,
      "value": "#    Then user click on continue"
    },
    {
      "line": 17,
      "value": "#   #Step2"
    },
    {
      "line": 18,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 19,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 21,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 24,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 25,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 26,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 27,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 28,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 29,
      "value": "#   #Step3"
    },
    {
      "line": 30,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 33,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 34,
      "value": "#    And user select no to pan"
    },
    {
      "line": 35,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 36,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 37,
      "value": "#    #Step4"
    },
    {
      "line": 38,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 39,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 40,
      "value": "#    And user click on send sms"
    },
    {
      "line": 41,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 42,
      "value": "#    #Step5"
    },
    {
      "line": 43,
      "value": "#    And user complete the account sign up"
    },
    {
      "line": 44,
      "value": "#    Then user receives a email notification"
    }
  ],
  "line": 46,
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
      "line": 47,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;1"
    },
    {
      "cells": [
        "https://www.amazon.in/",
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
      "line": 48,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1766349,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"https://www.amazon.in/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 46
    }
  ],
  "location": "SignupSteps.userIsOnSignupPageOfAwsconsoleWebsite(String)"
});
formatter.result({
  "duration": 5362219151,
  "status": "passed"
});
formatter.match({
  "location": "SignupSteps.userOpensTheChromeDevTool()"
});
formatter.result({
  "duration": 48774,
  "status": "passed"
});
formatter.after({
  "duration": 325518,
  "status": "passed"
});
formatter.uri("src/test/resources/FeatureFiles/OpenChromedevtool.feature");
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 11,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 12,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 13,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 14,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 15,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 16,
      "value": "#    Then user click on continue"
    },
    {
      "line": 17,
      "value": "#   #Step2"
    },
    {
      "line": 18,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 19,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 21,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 24,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 25,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 26,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 27,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 28,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 29,
      "value": "#   #Step3"
    },
    {
      "line": 30,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 33,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 34,
      "value": "#    And user select no to pan"
    },
    {
      "line": 35,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 36,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 37,
      "value": "#    #Step4"
    },
    {
      "line": 38,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 39,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 40,
      "value": "#    And user click on send sms"
    },
    {
      "line": 41,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 42,
      "value": "#    #Step5"
    },
    {
      "line": 43,
      "value": "#    And user complete the account sign up"
    },
    {
      "line": 44,
      "value": "#    Then user receives a email notification"
    }
  ],
  "line": 46,
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
      "line": 47,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;1"
    },
    {
      "cells": [
        "https://www.amazon.in/",
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
      "line": 48,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 102101,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"https://www.amazon.in/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 46
    }
  ],
  "location": "SignupSteps.userIsOnSignupPageOfAwsconsoleWebsite(String)"
});
formatter.result({
  "duration": 4808617836,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d111.0.5563.110)\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027147dda0bd3f2.ant.amazon.com\u0027, ip: \u0027192.168.29.127\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.5\u0027, java.version: \u00271.8.0_362\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.110, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: /var/folders/mz/z9w4gc5x02j...}, goog:chromeOptions: {debuggerAddress: localhost:49455}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 39b64403984c2865188f9ba0a259a6c2\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:329)\n\tat utils.SeleniumDriver.OpenChromeDriver(SeleniumDriver.java:69)\n\tat steps.SignupSteps.userIsOnSignupPageOfAwsconsoleWebsite(SignupSteps.java:64)\n\tat ✽.Given user is on signup page of awsconsole website \"https://www.amazon.in/\"(src/test/resources/FeatureFiles/OpenChromedevtool.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignupSteps.userOpensTheChromeDevTool()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 501699,
  "error_message": "java.lang.NullPointerException\n\tat steps.AfterActions.tearDown(AfterActions.java:20)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:295)\n\tat org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:84)\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:90)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\n",
  "status": "failed"
});
formatter.uri("src/test/resources/FeatureFiles/OpenChromedevtool.feature");
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 11,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 12,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 13,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 14,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 15,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 16,
      "value": "#    Then user click on continue"
    },
    {
      "line": 17,
      "value": "#   #Step2"
    },
    {
      "line": 18,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 19,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 21,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 24,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 25,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 26,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 27,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 28,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 29,
      "value": "#   #Step3"
    },
    {
      "line": 30,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 33,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 34,
      "value": "#    And user select no to pan"
    },
    {
      "line": 35,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 36,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 37,
      "value": "#    #Step4"
    },
    {
      "line": 38,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 39,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 40,
      "value": "#    And user click on send sms"
    },
    {
      "line": 41,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 42,
      "value": "#    #Step5"
    },
    {
      "line": 43,
      "value": "#    And user complete the account sign up"
    },
    {
      "line": 44,
      "value": "#    Then user receives a email notification"
    }
  ],
  "line": 46,
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
      "line": 47,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;1"
    },
    {
      "cells": [
        "https://www.amazon.in/",
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
      "line": 48,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 96029,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"https://www.amazon.in/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 46
    }
  ],
  "location": "SignupSteps.userIsOnSignupPageOfAwsconsoleWebsite(String)"
});
formatter.result({
  "duration": 3658451751,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d111.0.5563.110)\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027147dda0bd3f2.ant.amazon.com\u0027, ip: \u0027192.168.29.127\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.5\u0027, java.version: \u00271.8.0_362\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 111.0.5563.110, chrome: {chromedriverVersion: 111.0.5563.64 (c710e93d5b63..., userDataDir: /var/folders/mz/z9w4gc5x02j...}, goog:chromeOptions: {debuggerAddress: localhost:49541}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 7f6859e90f4765cb9b7d857a9cc1221d\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:329)\n\tat utils.SeleniumDriver.OpenChromeDriver(SeleniumDriver.java:69)\n\tat steps.SignupSteps.userIsOnSignupPageOfAwsconsoleWebsite(SignupSteps.java:64)\n\tat ✽.Given user is on signup page of awsconsole website \"https://www.amazon.in/\"(src/test/resources/FeatureFiles/OpenChromedevtool.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignupSteps.userOpensTheChromeDevTool()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 311168,
  "error_message": "java.lang.NullPointerException\n\tat steps.AfterActions.tearDown(AfterActions.java:20)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\n\tat org.testng.TestRunner.run(TestRunner.java:632)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\n\tat org.testng.TestNG.run(TestNG.java:1064)\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:295)\n\tat org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:84)\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:90)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\n",
  "status": "failed"
});
formatter.uri("src/test/resources/FeatureFiles/OpenChromedevtool.feature");
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 11,
      "value": "#    Given user enters root user email adress \"\u003caddress\u003e\" and aws account name \"\u003cname\u003e\""
    },
    {
      "line": 12,
      "value": "#    When user clicks on verify email address"
    },
    {
      "line": 13,
      "value": "#    Then user enter the verification code received in the users mailbox \"\u003cfolder\u003e\" and click on verify"
    },
    {
      "line": 14,
      "value": "#    And on successful verification user enters root user password \"\u003cencrypt\u003e\""
    },
    {
      "line": 15,
      "value": "#    And user enters reenter the password to confirm \"\u003cencrypt\u003e\""
    },
    {
      "line": 16,
      "value": "#    Then user click on continue"
    },
    {
      "line": 17,
      "value": "#   #Step2"
    },
    {
      "line": 18,
      "value": "#    And user click on business plan to use aws"
    },
    {
      "line": 19,
      "value": "#    And user fill contact details by entering user full name \"\u003cFullName\u003e\""
    },
    {
      "line": 20,
      "value": "#    Then user enter organization name \"\u003cOrgName\u003e\""
    },
    {
      "line": 21,
      "value": "#    Then user enter contact number \"\u003cContactNumber\u003e\""
    },
    {
      "line": 22,
      "value": "#    Then user select the country \"\u003cCountry\u003e\""
    },
    {
      "line": 23,
      "value": "#    And user enter the contact address \"\u003cAddress\u003e\""
    },
    {
      "line": 24,
      "value": "#    Then user enter the city \"\u003cCity\u003e\""
    },
    {
      "line": 25,
      "value": "#    And user enter the state \"\u003cState\u003e\""
    },
    {
      "line": 26,
      "value": "#    And user enter the pincode \"\u003cPincode\u003e\""
    },
    {
      "line": 27,
      "value": "#    Then user agree to the terms of the AWS Customer Agreement"
    },
    {
      "line": 28,
      "value": "#    And user click on continue in the contact page"
    },
    {
      "line": 29,
      "value": "#   #Step3"
    },
    {
      "line": 30,
      "value": "#    Then user enter the credit or debit card number in the billing information page \"\u003ccreditcardNumber\u003e\""
    },
    {
      "line": 31,
      "value": "#    And user enter the expiration month and year of the card added \"\u003cmonth\u003e\" \"\u003cyear\u003e\""
    },
    {
      "line": 32,
      "value": "#    And user enter the cardholder name \"\u003ccardHolderName\u003e\""
    },
    {
      "line": 33,
      "value": "#    And user enter the CVV \"\u003ccvvNumber\u003e\""
    },
    {
      "line": 34,
      "value": "#    And user select no to pan"
    },
    {
      "line": 35,
      "value": "#    Then Update the created account in the project test data management sheet \"\u003caddress\u003e\" \"\u003cCountry\u003e\""
    },
    {
      "line": 36,
      "value": "#    Then user click on continue in the billing page"
    },
    {
      "line": 37,
      "value": "#    #Step4"
    },
    {
      "line": 38,
      "value": "#    And user choose the country \"\u003cCountry\u003e\""
    },
    {
      "line": 39,
      "value": "#    And user enter the contact number to confirm the identity \"\u003cmobileNumber\u003e\""
    },
    {
      "line": 40,
      "value": "#    And user click on send sms"
    },
    {
      "line": 41,
      "value": "#    Then user click on verify button"
    },
    {
      "line": 42,
      "value": "#    #Step5"
    },
    {
      "line": 43,
      "value": "#    And user complete the account sign up"
    },
    {
      "line": 44,
      "value": "#    Then user receives a email notification"
    }
  ],
  "line": 46,
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
      "line": 47,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;1"
    },
    {
      "cells": [
        "https://www.amazon.in/",
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
      "line": 48,
      "id": "automatic-creation-of-test-accounts-on-prod.;new-aws-account-creation-on-prod;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 112285,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
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
    }
  ],
  "line": 8,
  "name": "user is on signup page of awsconsole website \"https://www.amazon.in/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    Given Open browser"
    }
  ],
  "line": 10,
  "name": "user opens the chrome dev tool",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.in/",
      "offset": 46
    }
  ],
  "location": "SignupSteps.userIsOnSignupPageOfAwsconsoleWebsite(String)"
});
