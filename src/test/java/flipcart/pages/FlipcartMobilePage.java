package flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import flipcart.commonmethods.CommonMethods;
import flipcart.testbase.TestBase;

public class FlipcartMobilePage extends TestBase{
	
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
	
	@FindBy(xpath = "//*[@id=\"menu-item-1743\"]")
	private WebElement reviews;
	
	@FindBy(xpath = "//*[@id=\"menu-item-1870\"]")
	private WebElement inquryRegister;
	
	@FindBy(xpath = "//*[@id=\"menu-item-2439\"]")
	private WebElement feedback;
	
	@FindBy(xpath = "//*[@id=\"menu-item-111\"]")
	private WebElement contact_Us;
	
	@FindBy(xpath = "//*[text()=\"Selenium\"]")
	private WebElement selenium_btn;
	//private By selenium_btn;
	@FindBy(xpath = "//button[contains(text(),'✕')]")
	private WebElement x;

	public FlipcartMobilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public FlipcartMobilePage verifyFlipcartTitle() {
		
		CommonMethods.getPageTitle(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		return this;
	}
	public FlipcartMobilePage VerifyFlipCarMobilePageTest() {
		
	x.isDisplayed();
	x.click();
	mobile.isDisplayed();
	mobile.click();
	return this;
	}
}
