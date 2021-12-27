package com.jotform.form.testsuite;


import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.pages.*;
import com.jotform.form.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners(CustomListeners.class)
public class JotFormTest extends TestBase {
    StartPage startPage;
    Page1 page1;
    Page2 page2;
    Page3 page3;
    Page4 page4;
    Page5 page5;
    Page6 page6;
    Page7 page7;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
        page1 = new Page1();
        page2 = new Page2();
        page3 = new Page3();
        page4 = new Page4();
        page5 = new Page5();
        page6 = new Page6();
        page7 = new Page7();
    }
    @Test
    public void verifyUserSubmitFormSuccessfully() throws InterruptedException, AWTException {
        startPage.startForm();
        page1.fillFirstNameField("Bob");
        page1.fillLastNameField("Alexa");
        page1.clickFirstNext();
        page2.uploadFile("JotForm.docx");
        page2.clickSecondNext();
        page3.signCanvas();
        page3.clickThirdNext();
        page4.fillDateField("20211230");
        page4.clickFourthNext();
        page5.selectSecurityQuestion();
        page5.selectAnswerOfSecurityQuestion("Blue");
        page5.clickFifthNext();
        page6.clickSubmit();
        page7.verifyThankYouMessage("Thank You!");
        page7.verifySubmissionMessage("Your submission has been received!");
    }


}
