package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class PersonalInfoPage extends TestBase {

	public PersonalInfoPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from personnel information page

	@FindBy(xpath = "//h5[contains(text(),'Personal Information')]")
	WebElement personalInfoTitle;

	@FindBy(xpath = ".//*[@id='nav-personal']/div/div[2]/div[1]/div[2]/h6")
	WebElement applicationId;

	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='middlename']")
	WebElement middlename;

	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastname;
	@FindBy(xpath = "//input[@type='radio' and @value='Male']")
	// gender radio btn change value=Female, Male, Other
	WebElement gender;
	WebElement VisaFees;// li[@id='1']
	@FindBy(xpath = "//input[@id='passport_number']")
	WebElement passport_number;
	@FindBy(xpath = "//input[@id='date_of_issued']")
	WebElement date_of_issued;
	@FindBy(xpath = "//input[@id='passport_expiry']")
	WebElement date_of_expiry;
	@FindBy(xpath = "//input[@id='birth_place']")
	WebElement birth_place;
	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//button[text()='Cancel']")
	WebElement cancel;
	@FindBy(xpath = "//button[@id='applicant_personal_info_form_btn']")
	WebElement saveAndContinue;

	public String getTextPersonalInfoPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		return personalInfoTitle.getText();

	}

	public String getApplicantPageTitle() {
		return driver.getTitle();
	}

	public String getApplicationId() {
		return applicationId.getText().substring(16);
	}

	public void passFirstName(String firstName) {
		firstname.sendKeys(firstName);
	}
	public String getTextFromFirstName() throws InterruptedException {
		return firstname.getAttribute("value");
	}

	public void passMiddleName(String middleName) {
		middlename.sendKeys(middleName);
	}
	public String getTextFromMiddleName() throws InterruptedException {

		return middlename.getAttribute("value");
	}
	
	
	public void passLastName(String lastName) {
		lastname.sendKeys(lastName);
		// return lastname.getText();
	}
	public String getTextFromLastName() throws InterruptedException {

		return lastname.getAttribute("value");
	}
	public void passPassportNumber(String passportNumber) {
		passport_number.sendKeys(passportNumber);
	}
	public String getTextFrompassPortNumber() throws InterruptedException {

		return passport_number.getAttribute("value");
	}
	public void clickOnGender() {
		TestUtil.actionClassMethod(gender);
	}

	public void verifiedGenderSelected() throws InterruptedException {

		genderRadioButton = gender.isSelected();
		System.out.println("genderRadioButton==>" + genderRadioButton);
	}

	public void selectPassIssueDate(String PassIssueDate) throws InterruptedException {
	
		//TestUtil.actionClassMethod(date_of_issued);
		TestUtil.clickOnElement(date_of_issued);
		date_of_issued.sendKeys(PassIssueDate); // Enter date in required format
	}

	public String getTextFromPassIssueDate() throws InterruptedException {
		return date_of_issued.getAttribute("value");
	}
	public void selectPassExpiryDate(String PassExpiryDate) throws InterruptedException {

		//TestUtil.actionClassMethod(date_of_expiry);
		TestUtil.clickOnElement(date_of_expiry);
		date_of_expiry.sendKeys(PassExpiryDate); // Enter date in required
													// format
	}
	public String getTextFromPassExpiryDate() throws InterruptedException {

		return date_of_expiry.getAttribute("value");
	}
	public void passPlaceOfBirth(String birthPlace) {
		birth_place.sendKeys(birthPlace);
	}
	public String getTextFromPassPlaceOfBirth() throws InterruptedException {

		return birth_place.getAttribute("value");
	}
	public void clickOnSaveAndContinue() {
		saveAndContinue.click();
	}

}