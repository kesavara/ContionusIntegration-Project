package pages.actions;


//import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign In to the Console')]")
    WebElement signIn;

    @FindBy(how = How.XPATH, using = "//input[@id='resolving_input']")
    WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    WebElement password;


    @FindBy(how = How.XPATH, using = "//button[@id='next_button']")
    WebElement nextButton;

    public static void login() {
    }


    public void logIn(String uname, String pwd) throws Throwable {

        signIn.click();
        email.sendKeys("awscp-e2e-testteam+common_sor_prod01@amazon.com");
        nextButton.click();
        password.sendKeys("Trailblazers@123");
        signIn.click();

    }
}
