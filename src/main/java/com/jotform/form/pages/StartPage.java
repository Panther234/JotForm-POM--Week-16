package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {

    public StartPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy (id = "jfCard-welcome-start")
    WebElement clickStart;

    public void startForm(){
        clickOnElement(clickStart);
        CustomListeners.test.log(Status.PASS, "Click Start");
        Reporter.log("Click Start : " + clickStart.getText() + "<br>");
    }

}
