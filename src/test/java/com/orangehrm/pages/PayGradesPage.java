package com.orangehrm.pages;


import com.orangehrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayGradesPage {

    public PayGradesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "menu_admin_viewPayGrades")
    public WebElement PayGradeButton;

    @FindBy(xpath = "//i[.='add']")
    public WebElement PlusSign;

    @FindBy(id = "name")
    public WebElement addPayGradesTextBox;

    @FindBy(xpath = "//a[.='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[@id=\"payGradesDiv\"]/crud-panel/div/div/list/table/tbody")
    public WebElement tbody;
}
