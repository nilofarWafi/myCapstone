package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "orderLink")
	public WebElement ordersBtn;
	
	@FindBy(xpath = "(//p[contains(text(),'Show Details')])[1]")
	public WebElement firstOrderclick;

	@FindBy(id = "cancelBtn")
	public WebElement cancelTheOrder;

	@FindBy(id ="reasonInput")
	public WebElement cancellationReason;

	@FindBy(css ="#orderSubmitBtn")
	public WebElement OrderCancellationBtn;

	@FindBy(xpath = "//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement cancelConfirmationMessage;

	@FindBy(xpath = "//button[contains(text(),'Return Items')]")
	public WebElement returnItems;

	@FindBy(css = "#reasonInput")
	public WebElement returnReason;

	@FindBy(css = "#dropOffInput")
	public WebElement dropOffLocation;

	@FindBy(css = "#orderSubmitBtn")
	public WebElement returnOrderSubmitBtn;

	@FindBy(xpath = "//p[contains(text(),'Return was successfull')]")
	public WebElement returnSuccessfulMessage;

	@FindBy(css = "#reviewBtn")
	public WebElement reviewButton;

	@FindBy(css = "#headlineInput")
	public WebElement reviewHeadLineBtn;

	@FindBy(css = "#descriptionInput")
	public WebElement reviewBodyMessage;

	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitButton;

	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewSuccessMessage;

}
