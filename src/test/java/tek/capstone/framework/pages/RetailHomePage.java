package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
		
	}
		@FindBy(xpath="//a[text()='TEKSCHOOL']")
		public WebElement tekSchoolLogo;
		
		@FindBy(id ="search")
		public WebElement allDepartmentDropDown;
		
		@FindBy(css = "#searchInput")
		public WebElement searchBar;
		
		@FindBy(xpath = "//button[@id='searchBtn']")
		public WebElement searchButton; 
		
		@FindBy(linkText = "Sign in")
		public WebElement signInButton;
		
		@FindBy(id="cartBtn")
		public WebElement cartButton;
		
		@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
		public WebElement pokemanProductImage;
		
		@FindBy(xpath ="//a[text()='Account']")
		public WebElement accountOption;
		@FindBy(id="hamburgerBtn")
		public WebElement allIcon;
		
		@FindBy(xpath="//div[@class='sidebar_content-item']/span")
		public List<WebElement> sideBarElements;
		
		@FindBy(xpath="//span[text()='Electronics']")
		public WebElement electronicsSideBar;
		
		@FindBy(xpath="//span[text()='Computers']")
		public WebElement computersSideBar;
		
		@FindBy(xpath="//span[text()='Smart Home']")
		public WebElement smartHomeSideBar;
		
		@FindBy(xpath="//span[text()='Sports']")
		public WebElement sportsSideBar;
		
		@FindBy(xpath="//span[text()='Automative']")
		public WebElement automativeSideBar;
		
		@FindBy(xpath="//a[@id='signinLink']")
		public WebElement homePageSingInBtn;
		
		@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
		public WebElement KasaOutDoorSmartPlug;
		
		@FindBy(xpath="//select[@class='product__select']")
		public WebElement itemQuantity;
		
		@FindBy(css="#addToCartBtn")
		public WebElement addToCartButton;
		
		
		@FindBy(xpath="//span[contains(text(),'All')]")
		public WebElement sidebarAllButton;
		
		@FindBy(xpath="//span[@class='top-nav__cart-quantity']")
		public WebElement cartIconQuantity;
		
		@FindBy(xpath="//div[@class='sidebar__content']//span")
		public List<WebElement> sidebarAllDepartment;
		
		@FindBy(xpath="//span[contains(text(),'Electronics')]")
		public WebElement electronics;
		
		@FindBy(xpath= "//span[contains(text(),'Computers')]")
		public WebElement computers;
		
		@FindBy(css="#search")
		public WebElement smartHome;
		
		@FindBy(xpath="//span[contains(text(),'Sports')]")
		public WebElement sports;
		
		@FindBy(xpath="//span[contains(text(),'Automative')]")
		public WebElement automative;
		
		@FindBy(xpath="//div[@class='top-nav__btn top-nav__cart']")
		public WebElement cartButtonClickToBuy;
		
		@FindBy(id="proceedBtn")
		public WebElement proceedCheckOutCartButton;
		
		@FindBy(id="placeOrderBtn")
		public WebElement pleaceOrderBtn;
		
		@FindBy(css="#countryDropdown")
		public WebElement countryDropDownButton;
		
		@FindBy(xpath="//button[@id='addPaymentBtn']")
		public WebElement addCardBtn;
		
		@FindBy(css="#placeOrderBtn")
		public WebElement placeYourOrderButton;
		
		@FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
		public WebElement orderPlacedSuccessfullyMassege;
		
		@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
		public WebElement apexItemClick;
		
		@FindBy(xpath="//select[@class='product__select']")
		public WebElement quantityApexItem;
		
		@FindBy(xpath="//span[@id='cartQuantity' and text()='2']")
		public WebElement cartQuantity5Items;
		
		@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
		public WebElement apexSecondOrder;
		
		@FindBy(css="button[id='addAddressBtn']")
		public WebElement orderNewAddressLink;
		}
		
		
