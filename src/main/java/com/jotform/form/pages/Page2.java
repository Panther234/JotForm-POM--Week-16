package com.jotform.form.pages;

import com.aventstack.extentreports.Status;
import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Page2 extends Utility {

    public Page2() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Browse Files']")
    WebElement browseFiles;

    public void uploadFile(String filePath) throws AWTException, InterruptedException {
        clickOnElement(browseFiles);
        Thread.sleep(2000);
        Robot rb = new Robot();
        StringSelection obj = new StringSelection("JotForm.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(7000);
    }

//    public void uploadFile() throws AWTException, InterruptedException {
//        doClickOnElement(browseFilesButton);
//        Thread.sleep(2000);
//
//        // creating object of Robot class
//        Robot rb = new Robot();
//
//        // copying File path to Clipboard
//        StringSelection str = new StringSelection("New.txt");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//
//        // press Contol+V for pasting
//        rb.keyPress(KeyEvent.VK_CONTROL);
//        rb.keyPress(KeyEvent.VK_V);
//
//        // release Contol+V for pasting
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//
//        // for pressing and releasing Enter
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);
//
//        Thread.sleep(7000);
//    }

    @CacheLookup
    @FindBy(xpath = "(//button[text()='Next'])[2]")
    WebElement secondNextButton;

    public void clickSecondNext() {
        secondNextButton.click();
        CustomListeners.test.log(Status.PASS, "Click Next button");
        Reporter.log("Click Next button : " + secondNextButton.getText() + "<br>");
    }
}
