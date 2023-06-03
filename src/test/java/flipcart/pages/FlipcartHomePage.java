package flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import flipcart.commonmethods.CommonMethods;
import flipcart.testbase.TestBase;
import flipcart.testcases.VerifyFlipCarMobilePageTest;


public class FlipcartHomePage extends TestBase{
	
	@FindBy(xpath = "//img[@alt='Flipkart']")       
	//private By hp_logo;
	private WebElement logo;
	@FindBy(name = "q")
	private WebElement search;
	
	@FindBy(xpath = "//*[text()='Grocery']")       
	//private By about_us;
	private WebElement grocery;
	
	@FindBy(xpath = "(//*[text()='Mobiles'])[1]")
	private WebElement mobile;
	
	@FindBy(xpath = "//*[text()='Fashion']")
	private WebElement fashon;
	
	@FindBy(xpath = "//*[text()='Electronics']")
	private WebElement electronics;
	
	@FindBy(xpath = "//*[text()='Home']")
	private WebElement home;
	
	@FindBy(xpath = "//*[text()='Appliances']")
	private WebElement appliances;
	
	@FindBy(xpath = "//*[text()='Travel']")
	private WebElement travel;
	
	@FindBy(xpath = "//*[text()='Top Offers']")
	private WebElement topoffers;
	
	@FindBy(xpath = "//*[text()='Beauty, Toys & More']")
	private WebElement beautytoysmore;
	
	@FindBy(xpath = "//*[text()='Two Wheelers']")
	private WebElement twowheelers;
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	private WebElement x;

	public FlipcartHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public FlipcartHomePage verifyFlipcartTitle() {
		
		CommonMethods.getPageTitle(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		return this;
	}
	public FlipcartHomePage grocerypage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "user clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(grocery, "User clicked on grocery page");
	return this;
	}
	public VerifyFlipCarMobilePageTest VerifyFlipCarMobilePageTest() {
	CommonMethods.clickSelectCheckBoxAndRedioButton(x, "user clicked on X button");
	CommonMethods.clickSelectCheckBoxAndRedioButton(mobile, "user clicked on Mobile page");
		return new VerifyFlipCarMobilePageTest();
	}
	public FlipcartFashionPage VerifyFlipCartFashonPageTest() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "user clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(fashon, "user clicked on Fashion page");
			return new FlipcartFashionPage();
	}
	public FlipcartElctrictPage ElectrictPage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "user clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(electronics, "user clicked on Electonic page");
			return new FlipcartElctrictPage();
	}
	public FlipcartHomeAppPage homeappPage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "User clicked on x button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(home, "user clicked on HomeApp page");
		return new FlipcartHomeAppPage();
	}
	public FlipcartAppliancesPage appliancePage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "User clicked on x button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(appliances, "User clicke on appliance page");
		return new FlipcartAppliancesPage();
	}
	public FlipcartTravelPage travelPageTest() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "User clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(travel, "User clicked on flipcart travel page");
		return new FlipcartTravelPage();
	}
	
	public FlipcartTopOffersPage TopOffersPage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "User clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(topoffers, "User clicked on flipcart TopOffers page");
		return new FlipcartTopOffersPage();
	}
	public FlipcartBeautyToyMorePage BeautyToyMorePage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "User clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(beautytoysmore, "User clicked on flipcart Beauty toy and more page");
		return new FlipcartBeautyToyMorePage();

	}
	public FlipcartTwoWheelerPage TwoWheelerPage() {
		CommonMethods.clickSelectCheckBoxAndRedioButton(x, "User clicked on X button");
		CommonMethods.clickSelectCheckBoxAndRedioButton(twowheelers, "User clicked on flipcart on twowheeler page");
		return new FlipcartTwoWheelerPage();
	}
}
