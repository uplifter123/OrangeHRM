package com.orangehrm.pages;

import com.orangehrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//td[@class='cursor-pointer']//span[.='IT Manager']")
public WebElement ItManagerJobTitle;

    @FindBy(xpath= "//input[@class='select-dropdown']")
    public WebElement selectDropdown;











}
