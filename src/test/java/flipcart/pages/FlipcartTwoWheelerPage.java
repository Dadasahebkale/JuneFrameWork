package flipcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import flipcart.commonmethods.CommonMethods;
import flipcart.testbase.TestBase;

public class FlipcartTwoWheelerPage extends TestBase{
	
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
	
	public FlipcartTwoWheelerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public FlipcartTwoWheelerPage verifyFlipcartTitle() {
		
		CommonMethods.getPageTitle(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		return this;
	}
	public FlipcartTwoWheelerPage TwoWheelerPage() {
	x.isDisplayed();
	x.click();
	twowheelers.isDisplayed();
	twowheelers.click();
	return this;
	}
}
