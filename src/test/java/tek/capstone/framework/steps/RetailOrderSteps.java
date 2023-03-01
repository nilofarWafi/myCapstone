package tek.capstone.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	private POMFactory factory=new POMFactory();
	
	@When("User click on login button")
	public void userClickOnLoginButton() {
	     click(factory.signInPage().loginPageButton);
	     logger.info("User click on login button");
	}
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	     click(factory.orderPage().ordersBtn);
	     logger.info("User click on Orders section");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		waitTillClickable(factory.homePage().KasaOutDoorSmartPlug);
	     click(factory.homePage().KasaOutDoorSmartPlug);
	     logger.info("User click on first order in list");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click(factory.orderPage().cancelTheOrder);
	    logger.info("User click on Cancel The Order button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String string) {
		selectByVisibleText(factory.orderPage().cancellationReason,string);
		logger.info("User select the cancelation Reason ‘Bought wrong item’");
	     
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	     click(factory.orderPage().OrderCancellationBtn);
	     logger.info("User click on Cancel Order button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String string) {
		waitTillPresence(factory.orderPage().cancelConfirmationMessage);
		Assert.assertEquals(string,factory.orderPage().cancelConfirmationMessage.getText());
		logger.info("a cancelation message should be displayed " +string);
	
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnItems);
	    logger.info("User click on Return Items button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String itemDamaged ) {
		 selectByVisibleText(factory.orderPage().returnReason,itemDamaged);
	    logger.info("User select the Return Reason ‘Item damaged’");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String string) {
	   selectByVisibleText(factory.orderPage().dropOffLocation,string);
	   logger.info("User select the drop off service ‘FedEx’");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	     click(factory.orderPage().returnOrderSubmitBtn);
	     logger.info("User click on Return Order button");
	}
	@Then("a Cancelation message should be displayed {string}")
	public void acancelationMessageShouldBeDisplayedReturnWasSuccessful(String string) {
	     Assert.assertEquals(string,factory.orderPage().returnSuccessfulMessage.getText());
	     logger.info("a cancelation message should be displayed "+string);
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User click on Review button");
 
	}
	@When("User write Review headline  {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
		sendText(factory.orderPage().reviewHeadLineBtn, string);
		sendText(factory.orderPage().reviewBodyMessage, string2);
		logger.info("User write Review headline "+string+" review Body Message"+string2);
 
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitButton);
		logger.info("User click Add your Review button");
 
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String string) {
		waitTillPresence(factory.orderPage().reviewSuccessMessage);
		Assert.assertEquals(string,factory.orderPage().reviewSuccessMessage.getText());
		logger.info("a review message should be displayed "+string);
 
	}



 }
 
