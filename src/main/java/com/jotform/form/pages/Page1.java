package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page1 extends Utility {
    public Page1() {PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='first_2']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last_2']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "(//button[text()='Next'])[1]")
    WebElement firstNextButton;

    public void fillFirstNameField(String text) {
        sendKeysToElement(firstName, text);
        CustomListeners.test.log(Status.PASS, "Add First Name");
        Reporter.log("Add First Name : " + text + firstName.getText() + "<br>");
    }

    public void fillLastNameField(String text) {
        sendKeysToElement(lastName, text);
        CustomListeners.test.log(Status.PASS, "Add Last Name");
        Reporter.log("Add Last Name : " + text + lastName.getText() + "<br>");
    }

    public void clickFirstNext() {
        firstNextButton.click();
        CustomListeners.test.log(Status.PASS, "Click  Next button");
        Reporter.log("Click Next button : " + firstNextButton.getText() + "<br>");
    }
}
