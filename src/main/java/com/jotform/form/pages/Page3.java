package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page3 extends Utility {

    public Page3() {PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//button[text()='Next'])[3]")
    WebElement thirdNextButton;

    @CacheLookup
    @FindBy(tagName = "canvas")
    WebElement signatureCanvas;

    public void clickThirdNext() {
        thirdNextButton.click();
        CustomListeners.test.log(Status.PASS, "Click Next button");
        Reporter.log("Click Next button : " + thirdNextButton.getText() + "<br>");
    }

    public void signCanvas() throws InterruptedException {
        Actions builder = new Actions(driver);
        Thread.sleep(5000);
        builder.moveToElement(signatureCanvas).build().perform();
        builder.clickAndHold(signatureCanvas).build().perform();
        builder.moveByOffset(0, 100).build().perform();
        builder.moveByOffset(50, 100).build().perform();
        builder.clickAndHold(signatureCanvas).build().perform();
        builder.moveByOffset(0, 100).build().perform();
        builder.moveByOffset(50, 50).build().perform();
        builder.clickAndHold(signatureCanvas).build().perform();
        builder.moveByOffset(0, 25).build().perform();
        builder.release().build().perform();

        Thread.sleep(5000);
    }
}
