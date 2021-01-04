package com.orangehrm.step_definitions;

import com.orangehrm.pages.AdminJobTitlesPage;
import com.orangehrm.utilities.ConfigurationReader;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @And("the user find job Title {string} from the table")
    public void theUserFindJobTitleFromTheTable(String jbTitle) {

        Driver.wait(10);
        Driver.hoverClick(adminJobTitlesPage.selectDropdown);
        Driver.wait(2);
        adminJobTitlesPage.selectDropdownOpti10.click();
        Driver.wait(2);

        while (adminJobTitlesPage.rightClick.isDisplayed()) {
                  List<WebElement> jobTitles = adminJobTitlesPage.allJobTitles;
                  List<String> titles = new ArrayList<String>();

            for (WebElement jobTitle : jobTitles) {
                 titles.add(jobTitle.getText());
                // System.out.println(titles);
            }
            Driver.wait(2);
            if (titles.contains(jbTitle.trim())) {
                Driver.wait(2);
                ConfigurationReader.jobTitleHoverClick(jbTitle);

                adminJobTitlesPage.jobTitleNoteTextBox.sendKeys("You typed it in the Textbox.");
                Driver.hoverClick(adminJobTitlesPage.jobTitleSaveButton);
                Driver.waitForVisibility(adminJobTitlesPage.successfullyMessage,3);
                Assert.assertEquals("Successfully Updated",adminJobTitlesPage.successfullyMessage.getText());

                break;
            }
            Driver.waitAndClick(adminJobTitlesPage.rightClick, 2);
            Driver.wait(2);
        }



    }
}
