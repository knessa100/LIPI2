package stepDefinition;

import base.Config;
import base.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginSteps extends Config {
    LoginPage loginPage=new LoginPage(driver);


    @Given("User in TalentTEK Homepage")
    public void userInTalentTEKHomepage() {
        loginPage.validateHomePage();
        //verify page title
    }

    @And("User enter valid email address")
    public void userEnterValidEmailAddress() {
        loginPage.enterUsername(TestData.username);

    }

    @And("User enter valid password")
    public void userEnterValidPassword() {
        loginPage.enterPassword(TestData.password);
    }

    @When("User clicks on Log In button")
    public void userClicksOnLogInButton() {
        loginPage.clickloginButton();
    }

    @Then("User should be able to successfully login")
    public void userShouldBeAbleToSuccessfullyLogin() {
        loginPage.loginSuccess();
    }


    @And("User enter invalid password")
    public void userEnterInvalidPassword() {
        
    }

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String arg0) {
        
    }

    @And("User enter invalid email address")
    public void userEnterInvalidEmailAddress() {
    }
}

