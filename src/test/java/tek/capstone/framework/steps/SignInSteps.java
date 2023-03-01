package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("User click on Sign in option");

	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
		clearText(factory.signInPage().emailField);
		sendText(factory.signInPage().emailField, emailValue);
		clearText(factory.signInPage().passwordField);
		sendText(factory.signInPage().passwordField, passwordValue);
		logger.info("User enter email " + emailValue + " passwordField " + passwordValue);
	}

	@When("User click on login butten")
	public void userClickOnLoginButten() {
		click(factory.signInPage().loginPageButton);
		logger.info("User click on login butten");

	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("User should be logged in into Account");

	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("User click on Create New Account button");
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> singUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameField, singUpInformation.get(0).get("name"));
		sendText(factory.signInPage().signUpEmailField, singUpInformation.get(0).get("email"));
		sendText(factory.signInPage().signUpPasswordField, singUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPassField, singUpInformation.get(0).get("confirmPassword"));
		logger.info("User fill the signUp information with below data");
	}

	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpFormButton);
		logger.info("User click on SignUp button");

	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));

	}}

