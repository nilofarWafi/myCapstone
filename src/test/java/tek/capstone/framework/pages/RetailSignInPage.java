package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		
	}

	@FindBy(xpath = "//h1[text()='Sign in']")
	public WebElement signPageLogo;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginPageButton;

	@FindBy(linkText = "Create New Account")
	public WebElement createNewAccountButton;

	@FindBy(id = "newCompanyAccount")
	public WebElement wantToSellSomethingLink;

	@FindBy(id = "nameInput")
	public WebElement signUpNameField;

	@FindBy(css = "#emailInput")
	public WebElement signUpEmailField;

	@FindBy(id = "passwordInput")
	public WebElement signUpPasswordField;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement signUpConfirmPassField;

	@FindBy(xpath = "//button[text()='Sign Up']")
	public WebElement signUpFormButton;

	}
