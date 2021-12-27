package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page4 extends Utility {
    public Page4() {PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "lite_mode_5")
    WebElement dateField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='calendar-new-month']")
    WebElement monthField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='calendar-new-year']")
    WebElement yearField;


    @CacheLookup
    @FindBy(xpath = "//div[@data-type='control_datetime']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement fourthNextButton;


    public void fillDateField(String date){
        dateField.sendKeys(date);
        CustomListeners.test.log(Status.PASS, "Send Date in to date field");
        Reporter.log("Send Date in to date field : " + date + dateField.getText() + "<br>");
    }

//    public void selectYear(String year) {
//        clickOnElement(By.xpath("//img[@id='input_9_pick']")); // Opens the date picker
//        while (true) {
//            String yearFieldText = yearField.getText();
//            if (yearFieldText.equalsIgnoreCase(year)) {
//                break;
//            } else {
//                clickOnElement(By.xpath("//td[text()='»']"));
//            }
//        }
//    }
//
//    public void selectMonth(String month) {
//        while (true) {
//            String monthFieldText = monthField.getText();
//            if (monthFieldText.equalsIgnoreCase(month)) {
//                break;
//            } else {
//                clickOnElement(By.xpath("//td[text()='‹']"));
//            }
//        }
//    }
//
//    public void selectDate(String date) {
//        // Date Selection
//        List<WebElement> allDates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']"));
//        for (WebElement dt : allDates) {
//            if (dt.getText().equalsIgnoreCase(date)) {
//                dt.click();
//                break;
//            }
//        }
//
//    }
    public void clickFourthNext() {
        fourthNextButton.click();
        CustomListeners.test.log(Status.PASS, "Click Next button");
        Reporter.log("Click Next button : " + fourthNextButton.getText() + "<br>");
    }
}
