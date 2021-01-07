package com.orangehrm.step_definitions;

import com.orangehrm.pages.AdminJobTitlesPage;
import com.orangehrm.pages.PayGradesPage;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class PayGradesStepDef {

    PayGradesPage payGradesPage = new PayGradesPage();

    @When("the user should be able to click on Job and Pay Grades")
    public void the_user_should_be_able_to_click_on_Job_and_Pay_Grades() {
        AdminJobTitlesPage adminJobTitlesPage = new AdminJobTitlesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(adminJobTitlesPage.Job).build().perform();
        actions.click((payGradesPage.PayGradeButton)).build().perform();


    }

    @When("the user clicks add Pay Grades and assign currency")
    public void the_user_clicks_add_Pay_Grades_and_assign_currency() {

    }

    @And("the user edits {string} and assign  <min> - <max> Salary")
    public void theUserEditsAndAssignMinMaxSalary(String arg0) {
    }


    @Then("the user verify that selected currency and Salary values")
    public void the_user_verify_that_selected_currency_and_Salary_values() {


    }


}
