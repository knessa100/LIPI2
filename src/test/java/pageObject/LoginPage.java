package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static base.Config.driver;

public class LoginPage {
    @FindBy(name = "email")
    WebElement username;
    @FindBy(name ="password")
    WebElement password;
    ////*[@id="login_form"]/input[3]
    @FindBy(xpath = "//*[@id=\"login_form\"]/input[3]")
    WebElement loginButton;
    //*[@id="profile_form"]/legend
    @FindBy(xpath = "//*[@id=\"profile_form\"]/legend")
    WebElement welcome;
    private WebElement incorrectCredentialMessage;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    public void validateHomePage() {
        Assert.assertEquals(driver.getTitle(), "Sign In");
    }
    public void enterUsername(String userid) {
        username.sendKeys(userid);
    }

    public void enterPassword(String pw) {
        password.sendKeys(pw);
    }


    public void clickloginButton() {
        loginButton.click();
    }


    public void loginSuccess() {
        Assert.assertTrue(welcome.isDisplayed());
    }
    public void userEnterInvalidEmailAddress() {
    }
    public void invalidCredentials(String EMSG) {
        String error=incorrectCredentialMessage.getText();
        error=error.substring(error.indexOf('➥')+1);
        System.out.println("Error message:"+error);
        Assert.assertEquals(error,EMSG);
    }


}




