package com.jotform.form.testbase;

import com.jotform.form.utility.Utility;
import com.jotform.form.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"sanity","smoke","regression"})
    public void tearDown(){
        closeBrowser();
    }
}
