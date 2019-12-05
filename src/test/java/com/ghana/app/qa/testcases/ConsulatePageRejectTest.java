package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.CNAddressInfo;

import static com.ghana.app.qa.util.TestUtil.prop;
import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.util.TestUtil;

public class ConsulatePageRejectTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ConsulatePageRejectTest() throws IOException, InterruptedException {
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

	@Test(priority=6, description="Here verifying confirmation message and click on ok btn ")
	public void documentPageAndPaymentPageTest() throws InterruptedException, IOException {

		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		TestUtil.writeStringValue(11, 1, 1);
		Thread.sleep(1000);
		reviewApplicationPage.clickOnContinuebutton();
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		System.out.println( "verifyClickOnSubmitBtnTest2");
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnSubmitbtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();

	} 

	@Test(priority = 7, description = "This test will verify login functinality with pass valid creadentials and click on Login button")
	public void loginIntoConsulate() throws InterruptedException {
		Thread.sleep(5000);		
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		System.out.println( "applicationIDCN==>" +applicationID);

	}

	@Test(priority = 8 , description = "This test will verify we navigated to Welcome To Ghana Embassy page upon cliclking on Login button")
	public void verifyTitleOfConsulateTitle() throws IOException, InterruptedException {
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		TestUtil.writeStringValue(13, 3, 1);
	}  
	
	@Test(priority = 9)
	public void verfiyTitleOfCNDocumentVerificatonPageCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		TestUtil.clickOnElement();
		applicantDashBoardPage.clickOnDocumentVeri();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"We are not navigate to Document Verification page upon clicking on Document Verification from Applicant Dashboard");
		TestUtil.writeStringValue(14, 36, 1);
	}
	

	@Test(priority = 10, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowCloseCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		Assert.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), TestUtil.readDataFromExcellString(17, 1, 0),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		TestUtil.writeStringValue(17, 1, 1);
		Thread.sleep(2000);
		cNDocumentVerificaton.closeButtonToCloseWindow1();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		TestUtil.writeStringValue(17, 2, 1);
	}	

	@Test(priority =11, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindowCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnConfirmAirTicket();
		Assert.assertEquals(cNDocumentVerificaton.titleOfConfirmedAirTicketWindow(), TestUtil.readDataFromExcellString(17, 1, 0),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		TestUtil.writeStringValue(17, 3, 1);
	}

	@Test(priority = 12, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoCloseCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		Assert.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), TestUtil.readDataFromExcellString(17, 4, 0),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		TestUtil.writeStringValue(17, 4, 1);
		cNDocumentVerificaton.closeButtonToCloseWindow2();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		TestUtil.writeStringValue(17, 5, 1);
	}

	@Test(priority = 13, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhotoCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnPhoto();
		Assert.assertEquals(cNDocumentVerificaton.titleOfRecentPhotoWindow(), TestUtil.readDataFromExcellString(17, 4, 0),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		TestUtil.writeStringValue(17, 6, 1);
	}

	@Test(priority = 14, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationCloseCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		Assert.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), TestUtil.readDataFromExcellString(17, 7, 0),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		TestUtil.writeStringValue(17, 7, 1);
		cNDocumentVerificaton.closeButtonToCloseWindow3();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		TestUtil.writeStringValue(17, 8, 1);
	}

	@Test(priority = 15, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationCN() throws InterruptedException, IOException{
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnYellowFevervaccination();
		Assert.assertEquals(cNDocumentVerificaton.titleOfYellowFeverWindow(), TestUtil.readDataFromExcellString(17, 7, 0),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
			Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
					"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
			TestUtil.writeStringValue(17, 9, 1);
	}

	@Test(priority = 16, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterCloseCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), TestUtil.readDataFromExcellString(17, 10, 0),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		TestUtil.writeStringValue(17, 10, 1);
		cNDocumentVerificaton.closeButtonToCloseWindow4();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		TestUtil.writeStringValue(17, 11, 1);
	}

	@Test(priority = 17, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetterCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnCoveringLetter();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCoveringLetterWindow(), TestUtil.readDataFromExcellString(17, 10, 0),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		TestUtil.writeStringValue(17, 12, 1);
	}

	@Test(priority = 18, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceCloseCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), TestUtil.readDataFromExcellString(17, 13, 0),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		TestUtil.writeStringValue(17, 13, 1);
		cNDocumentVerificaton.closeButtonToCloseWindow5();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		TestUtil.writeStringValue(17, 14, 1);
	}

	@Test(priority = 19, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReferenceCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnIdProofReference();
		Assert.assertEquals(cNDocumentVerificaton.titleOfIDProofOfReferenceWindow(), TestUtil.readDataFromExcellString(17, 13, 0),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		cNDocumentVerificaton.crossButtonToCloseWindow();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		TestUtil.writeStringValue(17, 15, 1);
	}


	@Test(priority = 20, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaCloseCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				TestUtil.readDataFromExcellString(17, 19, 0),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		TestUtil.writeStringValue(17, 19, 1);
		cNDocumentVerificaton.closeButtonToCloseWindow7();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		TestUtil.writeStringValue(17, 20, 1);
	}

	@Test(priority = 21, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaCN() throws InterruptedException, IOException {
		Thread.sleep(2000);
		cNDocumentVerificaton.clickOnProofOfTransitVisa();
		softAssertion.assertEquals(cNDocumentVerificaton.titleOfProofOfTransitValidVisaWindow(),
				TestUtil.readDataFromExcellString(17, 19, 0),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		cNDocumentVerificaton.crossButtonToCloseWindow();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		TestUtil.writeStringValue(17, 21, 1);
	}

	@Test(priority = 22, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopTextCN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		Assert.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), TestUtil.readDataFromExcellString(17, 22, 0),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		TestUtil.writeStringValue(17, 22, 1);
		cNDocumentVerificaton.clickOnCancelFromRejectPop();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		TestUtil.writeStringValue(17, 23, 1);
	}

	@Test(priority =23, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1CN() throws InterruptedException, IOException {
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		softAssertion.assertEquals(cNDocumentVerificaton.textFromRejectConfirmationPop(), TestUtil.readDataFromExcellString(17, 22, 0),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnCloseFromRejectConfir();
		Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		TestUtil.writeStringValue(17, 24, 1);
	}
	@Test(priority =24, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText2CN() throws InterruptedException, IOException{
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnReject();
		cNDocumentVerificaton.passInReason(TestUtil.readDataFromExcellString(17, 25, 0));
		cNDocumentVerificaton.getTextFromRejectButtonFromCN();
		cNDocumentVerificaton.clickOnRejectFromRejectConfir();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");	
		TestUtil.writeStringValue(17, 26, 1);
	}
	@Test(priority = 25, description = "This test will verify whether application is sent to HCD side")
	public void verifyApplicaInRejectApplicationBucket() throws InterruptedException, IOException {
		// check whether application removed from new application bucket and added in HCG application iin count
		System.out.println("getTextFromApproveButtonFromCN==>" +getTextFromRejectButtonFromCN);
		Assert.assertEquals(consulatedashBoardPage.textRejectedApplicationBucket(), getTextFromRejectButtonFromCN,
				"We are not in HCG Application bucket to check the application is present after approved by CN");		
		TestUtil.clickOnElement();
		consulatedashBoardPage.confirmationPop2ApplicationSentToRejected();
		System.out.println("consulatedashBoardPage.confirmationPopApplicationSentToHCD();;==>" +consulatedashBoardPage.confirmationPop2ApplicationSentToRejected());
		Assert.assertEquals(consulatedashBoardPage.confirmationPop2ApplicationSentToRejected(), TestUtil.readDataFromExcellString(17, 22, 0),
				"Confirmation popup is not displayed upon clicking on Application which is sent to Reject bucket");
		System.out.println("consulatedashBoardPage.textFromPop1PopApplicationSentToHCD();==>" +consulatedashBoardPage.textFromPop2ApplicationSentToRejected());
		//softAssertion.assertEquals(consulatedashBoardPage.textFromPop1PopApplicationSentToHCD(), "This application is already sent to High Commsion for"
			//	+"confirmation, Are you sure you want to open this?",
			//	"Application is not sent to HCD side(Checked in Bucket) even after approved the application");	
		TestUtil.writeStringValue(17, 27, 1);
	}
	
	@Test(priority = 26, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyApplicationSentToRejectBucketOpens() throws InterruptedException, IOException {
		consulatedashBoardPage.openButton1PopApplicationSentToopenButtonFromRejectBucketHCD();
		Assert.assertEquals(applicantDashBoardPage.titleOfApplicationDetailsPage(), TestUtil.readDataFromExcellString(14, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.writeStringValue(17, 28, 1);
		applicantDashBoardPage.clickOnCancelButton();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(17, 29, 1);
	}
	
	
	@Test(priority = 27, description = "This test will verify whether application is opens upon clicing on Open button and also clicking back button navigates to Bucket")
	public void verifyCanceAndCrossButton() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.clickOnElement();
		Thread.sleep(3000);
		consulatedashBoardPage.crossButtonPopApplicationSentToRejectBucket();
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		Thread.sleep(3000);
		TestUtil.writeStringValue(17, 30, 1);
		TestUtil.clickOnElement();
		Thread.sleep(3000);		
		consulatedashBoardPage.cancelButtonRejectBucketCN();	
		Assert.assertEquals(highAndConsulateLoginPage.getTitleOfConsulate(), TestUtil.readDataFromExcellString(13, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		System.out.println("2222");
		TestUtil.writeStringValue(17, 31, 1);
		System.out.println("Reject application class is done");	
		TestUtil.toCloseNewTab();	
	}	
	
	
}






/*@Test(priority = 20, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
public void clickOnOriginalInvitationLetterCloseCN() throws InterruptedException, IOException {
	Thread.sleep(2000);
	cNDocumentVerificaton.clickOnOriginalInvitationLetter();
	Assert.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
			TestUtil.readDataFromExcellString(17, 16, 0),
			"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
	TestUtil.writeStringValue(17, 16, 1);
	cNDocumentVerificaton.closeButtonToCloseWindow6();
	Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
			"Document Verification page is not displayed upon clicking on Close button from Document Verification");
	TestUtil.writeStringValue(17, 17, 1);
}

@Test(priority = 21, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
public void clickOnOriginalInvitationLetterCN() throws InterruptedException, IOException {
	Thread.sleep(2000);
	cNDocumentVerificaton.clickOnOriginalInvitationLetter();
	softAssertion.assertEquals(cNDocumentVerificaton.titleOfOriginalInvitationLetterWindow(),
			TestUtil.readDataFromExcellString(17, 16, 0),
			"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
	cNDocumentVerificaton.crossButtonToCloseWindow();
	Assert.assertEquals(cNDocumentVerificaton.titleOfCNDocumentVerificatonPage(), TestUtil.readDataFromExcellString(14, 36, 0),
			"Document Verification page is not displayed upon clicking on Close button from Document Verification");
	TestUtil.writeStringValue(17, 18, 1);
}*/
