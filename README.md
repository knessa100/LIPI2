# LIPI2
Java, Selenium WebDriver, TestNG, Cucumber, JVM Report, Git, Jenkins etc

# How to run the test
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@smoke"



@And("User enter invalid password")
public void userEnterInvalidPassword() {
loginPage.enterPassword(TestData.invalidPassword);
}

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String errorMessage) {
        loginPage.invalidCredentials(errorMessage);
    }

    @And("User enter invalid email address")
    public void userEnterInvalidEmailAddress() {
        loginPage.enterUsername(TestData.invalidUsername);{

        }
