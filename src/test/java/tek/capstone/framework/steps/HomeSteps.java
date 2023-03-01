package tek.capstone.framework.steps;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	private POMFactory factory=new POMFactory();
	@When("User click on All section")
	public void userClickOnAllSection() {
	 click(factory.homePage().allIcon); 
	 logger.info("User click on All section");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar=dataTable.asLists(String.class);
		List<WebElement> actualSideBar=factory.homePage().sideBarElements;
		for(int i=0;i<expectedSideBar.size();i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(),expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText()+" is equal to "+expectedSideBar.get(0).get(i));
		
		}
	}

@When("User on {string}")
public void userOnElectronics(String department) {
	List<WebElement> sideBarOptions=factory.homePage().sideBarElements;
	for(WebElement option:sideBarOptions) {
		if(option.getText().equals(department)) {
			click(option);
			logger.info(option.getText()+" is present");
			break;
		}
	}
}
@Then("below options are present in department")
public void belowOptionsArePresentInDepartment(DataTable dataTable1) {
	List<List<String>> expectedDepartmentOptions=dataTable1.asLists(String.class);
	List<WebElement> actualDepartmentOptions=factory.homePage().sideBarElements;
	for(int i=0; i<expectedDepartmentOptions.get(0).size();i++) {
		for(WebElement department1:actualDepartmentOptions) {
			if(department1.getText().equals(expectedDepartmentOptions.get(0).get(i))){
				
				Assert.assertTrue(isElementDisplayed(department1));
				logger.info(department1.getText()+" is present ");
				
			}
			
		}
	}}
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		selectByVisibleText(factory.homePage().smartHome,smartHome);
		logger.info(smartHome +" the category should be smart home");
	
	    
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaOutDoorSmartPlug) {
		sendText(factory.homePage().searchBar,kasaOutDoorSmartPlug);
		logger.info(kasaOutDoorSmartPlug + " User search for this element");
 
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	    click(factory.homePage().searchButton);
	    logger.info("User click on Search icon");
	}
	@When("User click on item")
	public void userClickOnItem() {
	     click(factory.homePage().KasaOutDoorSmartPlug);
	     logger.info("User click on item");
	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String cartKasaItemQuantity) {
	   selectByValue(factory.homePage().itemQuantity,cartKasaItemQuantity); 
	   logger.info("User select quantity {string}");
	}
	@When("user click add to Cart button")
	public void userclickAddToCartButton() {
	     click(factory.homePage().addToCartButton);
	     logger.info("Userclick add to Cart button");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
	     Assert.assertEquals(string,factory.homePage().cartIconQuantity.getText());
	     logger.info("the cart icon quantity should change to "+string);
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartButton);
		logger.info("User click add to Cart button");
	     
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartButtonClickToBuy);
		logger.info("User click on Cart option");
 
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedCheckOutCartButton);
		logger.info("User click on Proceed to Checkout button");
	     
	}
	
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().orderNewAddressLink);
logger.info("User click Add a new address link for shipping address");
 
	 
		 
 
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
 click(factory.homePage().addCardBtn);
 logger.info("User click Add a credit card or Debit Card for Payment method");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeYourOrderButton);
		logger.info("User click on Place Your Order");
	     
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		Assert.assertEquals(string,factory.homePage().orderPlacedSuccessfullyMassege.getText());
	     logger.info("the cart icon quantity should change to "+string);
 
	}
	@When("User click on the item")
	public void userClickOnTheItem() {
	click(factory.homePage().apexSecondOrder);
	 logger.info("user clicked on the apex Legen item");

	}

}