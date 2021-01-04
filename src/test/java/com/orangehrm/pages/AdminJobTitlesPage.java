package com.orangehrm.pages;

import com.orangehrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class AdminJobTitlesPage {
    public  AdminJobTitlesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath= "//*[@id=\"menu_admin_viewAdminModule\"]/a")
    public WebElement adminButton;

    @FindBy(xpath= "//span[.='Job']")
    public WebElement Job;

    @FindBy(xpath= "//span[.='Job Titles']")
    public WebElement JobTitlesButton;

    @FindBy(id= "select-options-e2693bf9-bd0d-6f4d-4371-90a30ac641ba")  //*[@id="jobTitlesDiv"]/crud-panel/div/div/list/ul/li[2]/div/select
    public WebElement selectDropdownlistButton;

    @FindBy(xpath= "//i[.='chevron_right']")
    public WebElement arrowRightButton;

    @FindBy(xpath= "//i[.='chevron_left']")
    public WebElement arrowLeftButton;

    @FindBy(xpath= "//input[@class='select-dropdown']")
    public WebElement selectDropdown;

    @FindBy(xpath= "//span[.='10']")
    public WebElement selectDropdownOpti10;

    //li[@class='rows-per-page']

    @FindBy(xpath= "//li[@class='rows-per-page']")
    public WebElement rowsPerPage;

    @FindBy(xpath= "//a[@ng-click='list.nextPage()']//i[.='chevron_right']")
    public WebElement rightClick;

    @FindBy(xpath= "//a[@ng-click='list.prevPage()']//i[.='chevron_left']")
    public WebElement leftPageClick;

    @FindBy(xpath ="//table/tbody//td[2]")  //span['""']  //table/tbody//td[2]/ng-include/span
    public List<WebElement> allJobTitles;

    @FindBy(id ="note")
    public WebElement jobTitleNoteTextBox;

    @FindBy(xpath = "//a[@form-name='jobTitlesModalForm']")
    public WebElement jobTitleSaveButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement successfullyMessage;







    
    
}
