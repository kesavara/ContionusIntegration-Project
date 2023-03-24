package utils;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.HomePageLocators;


public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
 
    //initialize webdriver
    private static WebDriver driver;
    
    //initialize timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    private  SeleniumDriver() {
//        System.setProperty("webdriver.gecko.driver",
//                "/usr/local/bin/geckodriver");
//       // System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/gecko/geckodriver");
//       // System.setProperty("webdriver.gecko.driver", "\\Users\kragi\Documents\pers\learn\my-project\Selenium\");
//    	driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//
//        waitDriver = new WebDriverWait(driver, TIMEOUT);
//        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//        String window=driver.getWindowHandle();
//        System.out.println("Window ->"+window);



//        System.setProperty("webdriver.chrome.driver", "src/gecko/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--auto-open-devtools-for-tabs");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.google.com/");
//        System.out.println(driver.getTitle());
       
    }

    public static void OpenChromeDriver(){

//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--auto-open-devtools-for-tabs");
        System.setProperty("webdriver.chrome.driver", "src/gecko/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("--auto-open-devtools-for-tabs");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        driver.findElement()
    }

    public static void openPage(String url) throws InterruptedException {
    	System.out.println(url);
    	System.out.println(driver);
        driver.get(url);

//        driver.findElement(By.id("awsui-input-0")).sendKeys("awscp-e2e-testteam+testhack2@amazon.com");
//        driver.findElement(By.id("awsui-input-1")).sendKeys("test user 1");
//        driver.findElement(By.cssSelector(".awsui-button-variant-primary")).click();
//        Thread.sleep(10000);
//        //get value from mail
//       // driver.findElement(By.id("awsui-input-2")).sendKeys("12345");
//        // driver.findElement(By.cssSelector(".awsui-button-variant-primary")).click();
//        driver.findElement(By.id("awsui-input-3")).sendKeys("amazon@123");
//        driver.findElement(By.id("awsui-input-4")).sendKeys("amazon@123");
//        driver.findElement(By.cssSelector(".awsui-button-variant-primary > span")).click();
//
//        //BCp
//        driver.get("https://billing-central.aws.a2z.com/account/062580487822/manage-payment-method");
//        driver.findElement(By.cssSelector("input#user_name_field")).sendKeys("kragi");
//        driver.findElement(By.cssSelector("input#user_name_btn")).click();
//        driver.findElement(By.cssSelector("input#password_field")).sendKeys("zxCVB@123");
//
//        //usrrname
//        //authen
//
//        driver.findElement(By.xpath("//*[@class='awsui_input_2rhyz_qzthy_7']")).sendKeys("https://sim.amazon.com/issues/D40437531");
//        driver.findElement(By.xpath("(//*[@class='awsui_content_vjswe_108wz_3'])[2]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("mui-54593")).sendKeys("awscp-e2e-testteam+testhack1@amazon.com");
//
//
//
//        Thread.sleep(3000);
//        driver.findElement(By.id("awsui-input-5")).sendKeys("test 1");
//        driver.findElement(By.id("awsui-input-13")).sendKeys("amaz1");
//        driver.findElement(By.id("awsui-radio-button-1")).click();
//
//
//

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
       if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
      
    }

    public static void tearDown() {
        if (driver != null) {
            //driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
    public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
