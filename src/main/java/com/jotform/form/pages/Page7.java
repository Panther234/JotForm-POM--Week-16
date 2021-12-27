package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Page7 extends Utility {

    public Page7() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='jfThankYou-header form-header']")
    WebElement thankYouMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='jfThankYou-description form-subHeader']")
    WebElement submissionMessage;


    public void verifyThankYouMessage(String message) {
        String actualString = getTextFromElement(thankYouMessage);
        Assert.assertTrue(actualString.contains((message)));
        CustomListeners.test.log(Status.PASS, "Confirming Thank you message");
        Reporter.log("Confirming Thank you message: " + message + thankYouMessage.getText() + "<br>");
    }
    public void verifySubmissionMessage(String message) {
        String actualString = getTextFromElement(submissionMessage);
        Assert.assertTrue(actualString.contains((message)));
        CustomListeners.test.log(Status.PASS, "Confirming submission message");
        Reporter.log("Confirming submission message : " + message + submissionMessage.getText() + "<br>");
    }

}
