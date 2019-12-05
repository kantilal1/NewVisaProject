package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class CNInterviewSchedule extends TestBase {

	public CNInterviewSchedule() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='myModal1' ]//h4[@class='modal-title'][ text()='Confirmation']")
	WebElement confrmationPopTitleFromInterview;

	@FindBy(xpath = "//input[@id='r1']")
	WebElement radioButtonOnline;

	@FindBy(xpath = "//input[@id='r2']")
	WebElement radioButtonOffline;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelButtonFromInterviewConfirpop;

	@FindBy(xpath = "//button[contains(text(),'Confirm')]")
	WebElement confirmButtonFromInterviewConfirpop;

	@FindBy(xpath = "//div[@id='myModal1']//button[@type='button'][contains(text(),'×')]")
	WebElement closeButtonFromInterviewConfirpop;

	@FindBy(id = "date1")
	WebElement dateOne;

	@FindBy(id = "date2")
	WebElement dateTwo;

	@FindBy(id = "date3")
	WebElement dateThree;

	@FindBy(id = "time1")
	WebElement timeOne;

	@FindBy(id = "time2")
	WebElement timeTwo;

	@FindBy(id = "time3")
	WebElement timeThree;


	public String getTextFromConfrmationPopTitleFromInterview() {
		TestUtil.waitForElementToVisible(confrmationPopTitleFromInterview, 60);
		return confrmationPopTitleFromInterview.getText();

	}
	public void clickOnOnline() {
		radioButtonOnline.click();

	}
	public void clickOnOffline() {
		radioButtonOffline.click();

	}
	public void cancelButtonFromInterviewConfirpop() {
		TestUtil.waitForElemenToClick(cancelButtonFromInterviewConfirpop, 60);
		cancelButtonFromInterviewConfirpop.click();

	}
	public void confirmButtonFromInterviewConfirpop() {
		TestUtil.clickOnElement(confirmButtonFromInterviewConfirpop);
	
	}
	
	public void closeButtonFromInterviewConfirpop() {
		TestUtil.waitForElemenToClick(closeButtonFromInterviewConfirpop, 60);
		closeButtonFromInterviewConfirpop.click();

	}

	
	public void passDate1(String Date) {
		TestUtil.passDateInField("date1");
		dateOne.sendKeys(Date);

	}

	public void passDate2(String Date) {
		TestUtil.passDateInField("date2");
		dateTwo.sendKeys(Date);
	}

	public void passDate3(String Date) {
		TestUtil.passDateInField("date3");
		dateThree.sendKeys(Date);
	}

	public void passTime1(String time) {
		TestUtil.passDateInField("time1");
		timeOne.sendKeys(time);
	}

	public void passTime2(String time) {
		TestUtil.passDateInField("time2");
		timeTwo.sendKeys(time);
	}
	public void passTime3(String time) {
		TestUtil.passDateInField("time3");
		timeThree.sendKeys(time);
	}

}
