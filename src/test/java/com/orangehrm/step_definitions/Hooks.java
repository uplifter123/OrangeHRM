package com.orangehrm.step_definitions;

import com.orangehrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // Her senaryodan once çalışır.
    @Before //  Burasi cok onemli importu io.cucumber.java.Before dan yapmali
    public void setUp(){
        // System.out.println("setUp methodu çalıştı.");
    }

    // TestNG'deki AfterMethod gibi çalışır.
    // Her senaryodan sonra çalışır.
    @After
    public void tearDown(Scenario scenario){// Scenerio yazmak gerekiyor. parametre olarak almak icin


        // Ekran görüntüsü almak için kullanılıyor. Ezbere gerek yok
//        final byte[] screenshot =  ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//        if(scenario.isFailed()){ //scenario basarisizsa calissin
//            scenario.embed(screenshot , "image/png");
//        }

        //  Driver.closeDriver();
    }



}