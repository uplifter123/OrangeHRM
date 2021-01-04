package com.orangehrm.step_definitions;

import com.orangehrm.pages.AdminJobTitlesPage;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;

public class AdminJobTitleSearchStepDef {
    AdminJobTitlesPage adminJobTitlesPage =new AdminJobTitlesPage();

    @When("the user enter admin button")
    public void theUserEnterAdminButton() {
        AdminJobTitlesPage adminJobTitlesPage =new AdminJobTitlesPage();
        adminJobTitlesPage.adminButton.click();


    }

    @Then("the user should be able to click on Job and Jobtitle")
    public void theUserShouldBeAbleToClickOnJobAndJobtitle() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(adminJobTitlesPage.Job).click(adminJobTitlesPage.JobTitlesButton).build().perform();

    }


    @And("the user find IT Manager from the table")
    public void theUserFindFromTheTable() {


        Driver.wait(10);
        Driver.hoverClick(adminJobTitlesPage.selectDropdown);
        Driver.wait(2);
        System.out.println(adminJobTitlesPage.ItManagerJobTitle.isDisplayed());
        adminJobTitlesPage.selectDropdownOpti10.click();
        Driver.wait(2);

        System.out.println(adminJobTitlesPage.ItManagerJobTitle.isDisplayed());



      //  adminJobTitlesPage.ItManagerJobTitle
       /* try{
            while (!adminJobTitlesPage.ItManagerJobTitle.isDisplayed()){

Driver.hoverClick(adminJobTitlesPage.clcknext);

        }}
        catch(NoSuchElementException e)
        {
        adminJobTitlesPage.ItManagerJobTitle.click();
        }

        */

    }

}