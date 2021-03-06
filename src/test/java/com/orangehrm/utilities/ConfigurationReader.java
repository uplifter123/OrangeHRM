package com.orangehrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    //selam
    static Properties properties;
    static{
        String path = "configuration.properties";
        try{
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
        }catch (Exception e){

        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void jobTitleHoverClick(String jbTitle){
        //td[@name='listField.name']//span[contains(text(),'IT Manager')]
        String beforeXpath="//td[@name='listField.name']//span[contains(text(),'";
        String afterXpath="')]";
        WebElement viewButton= Driver.getDriver().findElement(By.xpath(beforeXpath + jbTitle + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(viewButton).click().perform();

    }

    public static void currencyHoverClick(String currencyName){
        //span[.='EUR - Euro']
        String beforeXpath="//span[.='";
        String afterXpath="']";
        WebElement viewButton= Driver.getDriver().findElement(By.xpath(beforeXpath + currencyName + afterXpath));
        Driver.wait(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(viewButton).click().perform();

    }




    public static void payGradeHoverClick(String payGrade){
        //span[.='aaa']/parent::*/parent::*/following-sibling::td[2]
        String beforeXpath="//span[.='";
        String afterXpath="']/parent::*/parent::*/following-sibling::td[2]";
        WebElement viewButton= Driver.getDriver().findElement(By.xpath(beforeXpath + payGrade + afterXpath));
        //hover Element
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(viewButton).click().perform();

    }

    public static WebElement payGradeCurrency(String payGrade){
        //span[.='aaa']/parent::*/parent::*/following-sibling::td[2]
        String beforeXpath="//span[.='";
        String afterXpath="']";
        WebElement viewButton= Driver.getDriver().findElement(By.xpath(beforeXpath + payGrade + afterXpath));
        //hover Element
        return viewButton;

    }

}
