package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class VisaPaymentPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public VisaPaymentPageTest() throws IOException, InterruptedException {
		super();
	}
	
	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException,
			IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		signUpPage.SelectPassportType();
		signUpPage.selectNationality();
		Thread.sleep(1000);
		signUpPage.selectPortOfArrival();
		signUpPage.selectVisaType();
		signUpPage.selectVisaLocation();
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		signUpPage.enterCaptchaField();
		TestUtil.clickOnElement(signUpPage.selectOneRadioButton());
		TestUtil.clickOnElement(signUpPage.termsCheckboxselect());
		TestUtil.clickOnElement(signUpPage.clickOnSelectAll());
		signUpPage.selectDateOfBirth(TestUtil
				.readDataFromExcellString(5, 14, 0));
		signUpPage.continueBtn();

	}

	@Test(priority = 2)
	public void fillPersonalPageTest() throws InterruptedException, IOException {
		// ----------------------Personal info page //
		// Test----------------------------------//
		Thread.sleep(1000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5,
				0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6,
				0));
		personalInfoPage.passLastName(TestUtil
				.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(
				6, 8, 0));
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(
				6, 9, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil
				.readDataFromExcellString(6, 10, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6,
				11, 0));
		personalInfoPage.clickOnSaveAndContinue();
	}

	@Test(priority = 3)
	public void fillAddressinfoPageTest() throws InterruptedException,
			IOException {
		// ----------------------Address Info page //
		// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4,
				0));
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5,
				0));
		addressInfoPage
				.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		addressInfoPage
				.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		addressInfoPage.passStateName(TestUtil
				.readDataFromExcellString(7, 9, 0));
		addressInfoPage.passCountryName(TestUtil.readDataFromExcellString(7,
				10, 0));
		addressInfoPage.selectAddressType();
		addressInfoPage.clickSaveAndContinuebtn();
	}

	@Test(priority = 4)
	public void fillEmergencyPageTest() throws InterruptedException,
			IOException {
		emergencyContactPage.emergencyFirstName(TestUtil
				.readDataFromExcellString(8, 3, 0));
		emergencyContactPage.emergencyLastName(TestUtil
				.readDataFromExcellString(8, 4, 0));
		emergencyContactPage.emergencyContactNumber(TestUtil
				.readDataFromExcellString(8, 6, 0));
		emergencyContactPage.selectRelation();
		emergencyContactPage.passEmergency_profession(TestUtil
				.readDataFromExcellString(8, 7, 0));
		emergencyContactPage.passEmployerOrSchoolName(TestUtil
				.readDataFromExcellString(8, 8, 0));
		emergencyContactPage.pass_EmployerOrSchooladdress(TestUtil
				.readDataFromExcellString(8, 9, 0));
		emergencyContactPage.pass_Emergency_Pincode(TestUtil
				.readDataFromExcellString(8, 10, 0));
		emergencyContactPage.paa_Emergency_city(TestUtil
				.readDataFromExcellString(8, 11, 0));
		emergencyContactPage.pass_Emergency_State(TestUtil
				.readDataFromExcellString(8, 12, 0));
		emergencyContactPage.pass_Emergency_Country(TestUtil
				.readDataFromExcellString(8, 13, 0));
		emergencyContactPage.pass_emergency_employer_phone_number(TestUtil
				.readDataFromExcellString(8, 14, 0));
		emergencyContactPage.clickEmeContinueBtn();
	}

	@Test(priority = 5)
	public void fillTravelInfoPageTest() throws InterruptedException,
			IOException {

		travelInfoPage.passDateOfDeparture(TestUtil.readDataFromExcellString(9,
				3, 0));
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9, 5,
				0));
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickPurpose_of_journey();
		travelInfoPage.passPrimaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 8, 0));
		travelInfoPage.passPrimaryRefLastname(TestUtil
				.readDataFromExcellString(9, 9, 0));
		travelInfoPage.pass_Primary_ref_address(TestUtil
				.readDataFromExcellString(9, 10, 0));
		travelInfoPage.pass_primary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 11, 0));
		travelInfoPage.pass_primary_ref_city(TestUtil.readDataFromExcellString(
				9, 12, 0));
		travelInfoPage.pass_primary_ref_state(TestUtil
				.readDataFromExcellString(9, 13, 0));
		travelInfoPage.pass_primary_ref_country(TestUtil
				.readDataFromExcellString(9, 14, 0));
		travelInfoPage.pass_primary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 15, 0));
		travelInfoPage.passsecondaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 16, 0));
		travelInfoPage.pass_secondary_ref_lastname(TestUtil
				.readDataFromExcellString(9, 17, 0));
		travelInfoPage.pass_secondary_ref_address(TestUtil
				.readDataFromExcellString(9, 18, 0));
		travelInfoPage.pass_secondary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 19, 0));
		travelInfoPage.pass_secondary_ref_city(TestUtil
				.readDataFromExcellString(9, 20, 0));
		travelInfoPage.pass_secondary_ref_state(TestUtil
				.readDataFromExcellString(9, 21, 0));
		travelInfoPage.pass_secondary_ref_country(TestUtil
				.readDataFromExcellString(9, 22, 0));
		travelInfoPage.pass_secondary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 23, 0));
		travelInfoPage.clickOnByPhoneCheckbox();
		travelInfoPage.clickOnContinuebutton();

	}

	@Test(priority = 6)
	public void documentPageTest() throws InterruptedException, IOException {
		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		TestUtil.writeStringValue(11, 1, 1);
		Thread.sleep(1000);
	} 


	@Test(priority=7, description="Here verifying confirmation message and click on ok btn ")
	public void verifyClickOnSubmitBtnTest() throws InterruptedException, IOException{
		//visaPaymentPage.getTextsubmitBtn();	
		reviewApplicationPage.clickOnContinuebutton();
		TestUtil.writeStringValue(12, 1, 1);
		Assert.assertEquals(visaPaymentPage.getTextPaymentPageTitle(), TestUtil.readDataFromExcellString(12, 2, 0),
				"it is not navigate to payment info page");	
		TestUtil.writeStringValue(12, 2, 1);
		visaPaymentPage.clickOnCheckoutBtn();
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 3, 0),
				"it is not navigate to CCAvenue: Billing Shipping after clicking on CheckOut button");	
		TestUtil.writeStringValue(12, 3, 1);
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		TestUtil.writeStringValue(12, 4, 1);
		visaPaymentPage.clickOnMakePaymentBtn();
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 5, 0),
				"it is not navigate to Send PARes to TermUrl after clicking on MakePayment button");	
		TestUtil.writeStringValue(12, 5, 1);
		visaPaymentPage.clickOnSubmitbtn();
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 6, 0),
				"it is not navigate to Payment after clicking on Submit button");	
		TestUtil.writeStringValue(12, 6, 1);
		visaPaymentPage.clickOnOKtbtn();
		System.out.println("================================>" +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 7, 0),
				"it is not navigate to Track Application after clicking on OK button");	
		TestUtil.writeStringValue(12, 7, 1);
		visaPaymentPage.clickOnDonetbtn();
		Thread.sleep(2000);
		Assert.assertEquals(homePage.validateHomePageTitle(), TestUtil.readDataFromExcellString(5, 1, 0),
				"We are not navigate to Home page after payment");
		TestUtil.writeStringValue(12, 8, 1);
		System.out.println( "visa applicationID after payment==>" +applicationID);
		
	}

}
