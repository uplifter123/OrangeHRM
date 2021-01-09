package com.orangehrm.step_definitions;

import com.orangehrm.pages.AdminJobTitlesPage;
import com.orangehrm.pages.PayGradesPage;
import com.orangehrm.utilities.ConfigurationReader;
import com.orangehrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PayGradesStepDef {
    PayGradesPage payGradesPage = new PayGradesPage();

    @When("the user should be able to click on Job and Pay Grades")
    public void the_user_should_be_able_to_click_on_Job_and_Pay_Grades() {
        AdminJobTitlesPage adminJobTitlesPage = new AdminJobTitlesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(adminJobTitlesPage.Job).build().perform();
        actions.click((payGradesPage.PayGradeButton)).build().perform();
    }

    @When("the user clicks add Pay Grades and assign currency as {string}")
    public void the_user_clicks_add_Pay_Grades_and_assign_currencya_as(String name) {
        PayGradesPage payGradesPage = new PayGradesPage();
        payGradesPage.PlusSign.click();
        payGradesPage.addPayGradesTextBox.sendKeys(name);
        payGradesPage.SaveButton.click();
        Driver.getDriver().navigate().refresh();

        Driver.wait(5);
        ConfigurationReader.payGradeHoverClick(name);
        Driver.hoverClick(payGradesPage.assignCurrency);

    }

    @And("the user edits {string} and assign {string} ve {string} Salary")
    public void theUserEditsAndAssignVeSalary(String currency, String minSalary, String maxSalary) {
            payGradesPage.assignCurrencyClick.click();
            ConfigurationReader.currencyHoverClick(currency);
            payGradesPage.minSalaryTextBox.sendKeys(minSalary);
            Driver.wait(1);
            payGradesPage.maxSalaryTextBox.sendKeys(maxSalary);
            payGradesPage.SaveButton.click();

    }

    @Then("the user verify that selected currency and Salary values")
    public void theUserVerifyThatSelectedCurrencyAndSalaryValues() {



    }

}