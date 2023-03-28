package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.actions.login;
import  pages.actions.awsManagement;


public class verifyXPath {


    WebDriver driver;

   // @BeforeTest
//    void setup() {
//        ChromeOptions options = new ChromeOptions();
//
//        options.setCapability("browserVersion", "latest-1");
//        options.addArguments("--auto-open-devtools-for-tabs");
//        WebDriver driver = new ChromeDriver();
//
//        WebDriverManager wdm = WebDriverManager.chromedriver().capabilities(options);
//        wdm.setup();
//
//    }
//
//    void login() {
//        driver.get("aws.amazon.com");
//        login.login();
//        System.out.println(driver.getTitle());
//
//    }

//    @Test(priority = 1)
    void navigateToBillsPage() {

        awsManagement.goToBillingConsole();

    }

//    @Test(priority = 2)

    public void checkLocators()
    {

        driver.findElement(By.xpath("//h3[contains(text(),'Credits')]")).isDisplayed();

//        //Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        WebElement element;
//
//
//        try {
//            Object obj = js.executeScript("return typeof(arguments[0]) != 'undefined' && arguments[0] != null;"), element);
//            if (obj.toString().contains("true")) {
//                System.out.println("isElementPresentCheckUsingJavaScriptExecutor: SUCCESS");
//                return true;
//            } else {
//                System.out.println("isElementPresentCheckUsingJavaScriptExecutor: FAIL");
//            }
//
//        } catch (NoSuchElementException e) {
//            System.out.println("isElementPresentCheckUsingJavaScriptExecutor: FAIL");
//        }
//        return false;
    }
}



