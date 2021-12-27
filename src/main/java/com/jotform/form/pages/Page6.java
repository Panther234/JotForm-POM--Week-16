package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6 extends Utility {
    public Page6() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@class='jfInput-button forSubmit form-submit-button u-right']")
    WebElement submitButton;

    public void clickSubmit() {
        submitButton.click();
        CustomListeners.test.log(Status.PASS, "Click Submit button");
//        Reporter.log("Click Submit button : " + submitButton.getText() + "<br>");
    }

}
