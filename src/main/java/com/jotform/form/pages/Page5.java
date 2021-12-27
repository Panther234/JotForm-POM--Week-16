package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page5 extends Utility {

    public Page5() {PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='jfDropdown-chipContainer']")
    WebElement securityQDropdown;

    @CacheLookup
//    @FindBy(xpath = "//li[@class='jfDropdown-optionListItem isSelected']")
    @FindBy(xpath = "//li[@data-value='Favourite Colour']")
    WebElement selectQuestion;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input_6_field_2']")
    WebElement securityQAnswer;

    @CacheLookup
    @FindBy(xpath = "//div[@data-type='control_mixed']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement fifthNextButton;

    public void selectSecurityQuestion() {
        clickOnElement(securityQDropdown);
        mouseHoverToElementAndClick(selectQuestion);
        CustomListeners.test.log(Status.PASS, "Select Security question");
        Reporter.log("Select Security question : " + selectQuestion.getText() + "<br>");
    }
    public void selectAnswerOfSecurityQuestion(String answer){
        sendTextToElement(securityQAnswer, answer);
        CustomListeners.test.log(Status.PASS, "Send Answer in to field");
        Reporter.log("Send Answer in to field : " + answer + securityQAnswer.getText() + "<br>");
    }
    public void clickFifthNext() {
        fifthNextButton.click();
        CustomListeners.test.log(Status.PASS, "Click Next button");
        Reporter.log("Click Next button : " + fifthNextButton.getText() + "<br>");
    }


}
