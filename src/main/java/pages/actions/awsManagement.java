package pages.actions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class awsManagement {

    @FindBy(how = How.XPATH, using = "//button[@id='nav-usernameMenu']")
    static
    WebElement menu;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Billing Dashboard']")
    static
    WebElement billingDashboard;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Bills']")
    static
    WebElement bills;


    public static void awsManagement() throws Throwable {

    }

    public static void goToBillingConsole() {
    }

    public static void billingConsole() throws Throwable {

        menu.click();
        System.out.println("you are in MENU Page");
        billingDashboard.click();
        System.out.println("you are in billingDashboard Page");
        bills.click();
        System.out.println("you are in Bills Page");

    }

     /*

    public boolean isElementPresentCheckUsingJavaScriptExecutor(WebElement element) {

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        try {
            Object obj = jse.executeScript(("return typeof(arguments[0]) != 'undefined' && arguments[0] != null;", element);
            if (obj.toString().contains("true")) {
                System.out.println("isElementPresentCheckUsingJavaScriptExecutor: SUCCESS");
                return true;
            } else {
                System.out.println("isElementPresentCheckUsingJavaScriptExecutor: FAIL");
            }

        } catch (NoSuchElementException e) {
            System.out.println("isElementPresentCheckUsingJavaScriptExecutor: FAIL");
        }
        return false;
    } */
}
