package com.orangehrm.step_definitions;

import com.orangehrm.pages.AdminJobTitlesPage;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

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

    @And("the user find {string} from the table")
    public void theUserFindFromTheTable(String title) {


       /*Select select = new Select(adminJobTitlesPage.selectDropdownlistButton);
        Driver.wait(2);
        select.selectByValue("10");
        System.out.println("Secili Kisim : "+ select.getFirstSelectedOption().getText());

        */

       Driver.wait(10);

       Driver.hoverClick(adminJobTitlesPage.ItManagerJobTitle);



        //Driver.scrollToElement(adminJobTitlesPage.ItManagerJobTitle);




        //adminJobTitlesPage.ItManagerJobTitle.click();

//
//
//        String expectedTitle=title;

//        WebElement table= Driver.getDriver().findElement(By.xpath("//*[@id=\"jobTitlesDiv\"]/crud-panel/div/div/list/table"));
//        System.out.println(table.getText());
//
//        String jobTable = table.getText();
//        Assert.assertTrue(jobTable.contains(title));



    }

}
