package Stepdef;

import Base.Config;
import Pageobject.Login_Page;
import io.cucumber.java.en.*;

import java.io.FileNotFoundException;


public class Login_Steps extends Config {

    Login_Page login=new Login_Page(driver);

    public Login_Steps() throws FileNotFoundException {
    }

    @Given("user at login page")
    public void userAtLoginPage() {

    }

    @And("input email in email editBox")
    public void inputEmailInEmailEditBox() {

    }

    @Then("input password in password editBox")
    public void inputPasswordInPasswordEditBox() {

    }

    @When("click on login button")
    public void clickOnLoginButton() {

    }

    @Then("User should able to logged in succefullly and able to sees the profile name")
    public void userShouldAbleToLoggedInSuccefulllyAndAbleToSeesTheProfileName() {
    }
}
