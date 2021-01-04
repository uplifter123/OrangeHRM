package com.orangehrm.step_definitions;

import com.orangehrm.pages.AdminJobTitlesPage;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdminJobTitleSearchStepDef {
    AdminJobTitlesPage adminJobTitlesPage = new AdminJobTitlesPage();

    @When("the user enter admin button")
    public void theUserEnterAdminButton() {
        AdminJobTitlesPage adminJobTitlesPage = new AdminJobTitlesPage();
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
       /* Driver.hoverClick(adminJobTitlesPage.selectDropdown);
        Driver.wait(2);
        adminJobTitlesPage.selectDropdownOpti10.click();
        Driver.wait(2);
        adminJobTitlesPage.rightClick.click();*/


    }

    @And("the user click on the ItManager")
    public void theUserClickOnTheItManager()
    {
        AdminJobTitlesPage adminJobTitlesPage = new AdminJobTitlesPage();
     //   System.out.println(adminJobTitlesPage.itManager.getText());
        Driver.hoverClick(adminJobTitlesPage.itManager);
        Driver.wait(2);
        adminJobTitlesPage.checkIt.click();
        boolean checkTrue= adminJobTitlesPage.checkIt.isSelected();
        if(checkTrue){
            System.out.println("It is selected");
        }else{
            System.out.println("It is not selected");
            adminJobTitlesPage.checkIt.click();
        }

        Assert.assertTrue("Verify that the second checkbox is selected", adminJobTitlesPage.checkIt.isSelected());
        Driver.wait(2);
        String itManagerText = adminJobTitlesPage.itManager.getText();


        /*Driver.wait(5);
        Driver.hoverClick(adminJobTitlesPage.itManager);
        Driver.wait(2);*/
        Assert.assertTrue("verification of IT Manager in the page", itManagerText.contains("IT Manager"));

    }
}