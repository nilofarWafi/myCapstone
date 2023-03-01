package tek.capstone.framework.steps;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	private POMFactory factory=new POMFactory();
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}

@When("User enter below information")
public void userEnterBelowInformation(DataTable dataTable) {
	List<Map<String, String>> passwordUpdateInformation=dataTable.asMaps(String.class,String.class);
	sendText(factory.accountPage().previousPasswordField,passwordUpdateInformation.get(0).get("previousPassword"));
	sendText(factory.accountPage().newPasswordField,passwordUpdateInformation.get(0).get("newPassword"));
    sendText(factory.accountPage().confirmPasswordField,passwordUpdateInformation.get(0).get("confirmPassword"));
    logger.info("User enter below information");
}
@When("User click on Change Password button")
public void userClickOnChangePasswordButton() {
	click(factory.accountPage().changePasswordBtn);
	logger.info("User click on Change Password button");
     
}
@Then("a message should be displayed ‘Password Updated Successfully’")
public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
	Assert.assertNotNull(factory.accountPage().passwordUpdateSuccessMessage);
//	Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdateSuccessMessage));
//	Assert.assertEquals(actual,factory.accountPage().passwordUpdateSuccessMessage.getText());
//	waitTillPresence(factory.accountPage().passwordUpdateSuccessMessage);
	logger.info("a message should be displayed ‘Password Updated Successfully’");
     
}
@When("User click on Add a payment method link")
public void userClickOnAddAPaymentMethodLink() {
     click(factory.accountPage().addPaimentMethodBtn);
     logger.info("User click on Add a payment method link");
}
@When("User fill Debit or credit card information")
public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	List<Map<String, String>> creditCardInformation=dataTable.asMaps(String.class,String.class);
	sendText(factory.accountPage().addCredNumberInput,creditCardInformation.get(0).get("cardNumber"));
	sendText(factory.accountPage().nameOnCardInput,creditCardInformation.get(0).get("nameOnCard"));
	sendText(factory.accountPage().cardExpirationMonthInput,creditCardInformation.get(0).get("expirationMonth"));
	sendText(factory.accountPage().expirationYearInput,creditCardInformation.get(0).get("expirationYear"));
	sendText(factory.accountPage().cardSecurityCodeInput,creditCardInformation.get(0).get("securityCode"));
   logger.info("User fill Debit or credit card information");
}
@When("User click on Add your card button")
public void userClickOnAddYourCardButton() {
	click(factory.accountPage().addYourCardButton);
	logger.info("User click on Add your card button");
    
}
@Then("a message should be displayed ‘Payment Method added successfully’")
public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
	Assert.assertNotNull(isElementDisplayed(factory.accountPage().paymentAddedSuccesfullyMessage));
	logger.info("a message should be displayed ‘Payment Method added successfully’");
     
}
@And("User click on bank card")
public void UserClickOnBbankCard() {
	click(factory.accountPage().cardEditeBtn);
	logger.info("User clicked on bank card");
}

@When("User click on Edit option of card section")
public void userClickOnEditOptionOfCardSection() {
	waitTillClickable(factory.accountPage().editPaymentMethod);
	click(factory.accountPage().editPaymentMethod);
	logger.info("User click on Edit option of card section");
     
}
@When("user edit information with below data")
public void userEditInformationWithBelowData(DataTable dataTable) {
	List<Map<String, String>> creditCardInformation=dataTable.asMaps(String.class,String.class);
	sendText(factory.accountPage().addCredNumberInput,creditCardInformation.get(0).get("cardNumber"));
	sendText(factory.accountPage().nameOnCardInput,creditCardInformation.get(0).get("nameOnCard"));
	sendText(factory.accountPage().cardExpirationMonthInput,creditCardInformation.get(0).get("expirationMonth"));
	sendText(factory.accountPage().expirationYearInput,creditCardInformation.get(0).get("expirationYear"));
	sendText(factory.accountPage().cardSecurityCodeInput,creditCardInformation.get(0).get("securityCode"));
   logger.info("user edit information with below data");


   
}
@When("user click on Update Your Card button")
public void userClickOnUpdateYourCardButton() {
	click(factory.accountPage().editpaymentSubmitBtn);
	logger.info("user click on Update Your Card button");
 

//@Then("a message should be displayed {string}")
//public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully(String string) {
//	waitTillPresence(factory.accountPage().paymentEditedSuccesfullyMessage);
//	Assert.assertEquals(string,factory.accountPage().paymentEditedSuccesfullyMessage.getText());
//	logger.info("a message should be displayed "+string);
}
@When("User click on remove option of card section")
public void userClickOnRemoveOptionOfCardSection() {
	waitTillPresence(factory.accountPage().removeCardButton);
	click(factory.accountPage().removeCardButton);
	logger.info("User click on remove option of card section");
    
}
@Then("payment details should be removed")
public void paymentDetailsShouldBeRemoved() {
	Assert.assertTrue(isElementDisplayed(factory.accountPage().addYourCardButton));
	logger.info("payment details should be removed");
     
}
@When("User click on Add address option")
public void userClickOnAddAddressOption() {
     click(factory.accountPage().addAddressOption);
     logger.info("User click on Add address option");
}
@When("User fill new address form with below information")
public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	List<Map<String, String>> addressInfo=dataTable.asMaps(String.class,String.class);
	selectByVisibleText(factory.accountPage().newAddressCountry,addressInfo.get(0).get("country"));
	sendText(factory.accountPage().newAddressFullNameField,addressInfo.get(0).get("fullName"));
	sendText(factory.accountPage().newAddressPhoneNumberField,addressInfo.get(0).get("phoneNumber"));
	sendText(factory.accountPage().newAddressStreetField,addressInfo.get(0).get("streetAddress"));
	sendText(factory.accountPage().newAddressAptField,addressInfo.get(0).get("apt"));
	sendText(factory.accountPage().newAddressCityField,addressInfo.get(0).get("city"));
	selectByValue(factory.accountPage().newAddressStateDropdown,addressInfo.get(0).get("state"));
	sendText(factory.accountPage().newAddressZipCodeField,addressInfo.get(0).get("zipCode"));
	logger.info("user edit information with below data");	
 
}
@When("User click Add Your Address button")
public void userClickAddYourAddressButton() {
	click(factory.accountPage().newAddressAddYourAddressButton);
	logger.info("User click Add Your Address button");
     
}
@Then("a message should be displayed ‘Address Added Successfully’")
public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.accountPage().newAddressPopup));
	logger.info("a message should be displayed ‘Address Added Successfully’");
    
}

@When("User click on edit address option")
public void userClickOnEditAddressOption() {
	click(factory.accountPage().editAddressButton);
	logger.info("User click on edit address option");
    
}
@When("User click update Your Address button")
public void userClickUpdateYourAddressButton() {
	waitTillClickable(factory.accountPage().updateYourAddressButton);
	click(factory.accountPage().updateYourAddressButton);
	logger.info("User click update Your Address button");
	
     
}
@Then("a message should be displayed ‘Address Updated Successfully’")
public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.accountPage().newAddressPopup));
	logger.info("a message should be displayed ‘Address Updated Successfully’");
     
}
@When("User click on remove option of Address section")
public void userClickOnRemoveOptionOfAddressSection() {
	click(factory.accountPage().removeAddressButton);
	logger.info("User click on remove option of Address section");
     
}
@Then("Address details should be removed")
public void addressDetailsShouldBeRemoved() {
	Assert.assertTrue(isElementDisplayed(factory.accountPage().addAddressOption));
	logger.info("Address details should be removed");


}
}