package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(css= "#personalUpdateBtn")
	public WebElement profileUpdateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;

	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordField;

	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordField;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordField;

	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdateSuccessMessage;
	
	@FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	public WebElement addPaimentMethodBtn;
	
	@FindBy(id="cardNumberInput")
	public WebElement addCredNumberInput;
	
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement nameOnCardInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement cardExpirationMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput;
 
  	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement cardSecurityCodeInput;
  	
	@FindBy(css = "#paymentSubmitBtn")
	public WebElement addYourCardButton;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentAddedSuccesfullyMessage;
	
	@FindBy(xpath="(//button[@class='text-blue-800 cursor-pointer hover:underline'])[2]")
	public WebElement editPaymentMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement editCartNumber;
	
	@FindBy(id="nameOnCardInput")
	public WebElement editNameOnCardInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement editexpirationMonthInput;
	@FindBy(id="expirationYearInput")
	public WebElement editexpirationYearInput;
	
	@FindBy(xpath="//img[@alt='Master Card']")
	public WebElement cardEditeBtn;
	
	@FindBy(id="securityCodeInput")
	public WebElement editsecurityCodeInput;
	
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement editpaymentSubmitBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[last()]")
	public WebElement messageBar;
	
	@FindBy(xpath = "//div[contains(text(),'payment Method updated Successfully')]")
	public WebElement paymentEditedSuccesfullyMessage;


	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement removeCardButton;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardButton;
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;
	
	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement newAddressCountry;
	
	@FindBy(css = "#fullNameInput")
	public WebElement newAddressFullNameField;
	
	@FindBy(css = "#phoneNumberInput")
	public WebElement newAddressPhoneNumberField;
	
	@FindBy(css = "#streetInput")
	public WebElement newAddressStreetField;
	
	@FindBy(css = "#apartmentInput")
	public WebElement newAddressAptField;
	
	@FindBy(css = "#cityInput")
	public WebElement newAddressCityField;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement newAddressStateDropdown;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement newAddressZipCodeField;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement newAddressAddYourAddressButton;
	
	@FindBy(css = "#addressBtn")
	public WebElement updateYourAddressButton;
	
	@FindBy(xpath = "//div[@class='account__address-single']")
	public List<WebElement> addressBoxes;
	
	@FindBy(xpath = "//div[@class='account__address-new-modal']")
	public WebElement newAddressPopup;
	
	@FindBy(xpath = "//div[@class='account__address-single'][last()]//button[@class='account__address-btn' and text()='Edit']")
	public WebElement editAddressButton;
	
	@FindBy(xpath = "//div[@class='account__address-single'][last()]//button[@class='account__address-btn' and text()='Remove']")
	public WebElement removeAddressButton;
}
