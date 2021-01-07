package com.orangehrm.step_definitions;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.utilities.ConfigurationReader;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep_Def {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("orange_Url"));

    }

    @Then("the user should be able to login as admin")
    public void the_user_should_be_able_to_login_as_admin() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();


    }



}
