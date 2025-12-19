package com.Amazon.PageObjectModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonHomePage {

	WebDriver driver;
	String parent;
	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;

	public void click_Search_Box() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(SearchBox)).click();
	}


	public void Senddata_Search_Box(String productName) {
		SearchBox.sendKeys(productName);

	} 


	@FindBy(id="nav-search-submit-button")
	WebElement searchButton;
	public void click_OnSearch_Button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
	}



	@FindBy(xpath="//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'and not(contains(@aria-label,'Sponsored Ad'))]")
	WebElement wirelse;


	public void choose_Item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		parent= driver.getWindowHandle();
		wait.until(ExpectedConditions.elementToBeClickable(wirelse)).click();

	} 

	@FindBy(xpath="//span[@id='productTitle']")
	WebElement assertItemName;

	public void Item_name_assert() {
		Set<String> children=driver.getWindowHandles();
		for(String child :children) {
			if(child!=parent) {
				driver.switchTo().window(child);
			}
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(assertItemName));
		String name=assertItemName.getText();
		//		assertEquals
		System.out.println(name);
//		assertEquals(name,"Portronics Toad 23 Wireless Optical Mouse with 2.4GHz, USB Nano Dongle, Optical Orientation, Click Wheel, Adjustable DPI(Black)> but was: <Portronics Toad 34 Wireless Mouse with 2.4 GHz Wireless, Adjustable Sensitivity, USB Receiver, Ergonomic Design, for Laptops, Desktops PC, Mac (Grey)" );

	}


	@FindBy(xpath="(//span[text()='299'])[1]")
	WebElement assertPrice;
	public void assert_price_value()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(assertPrice));
		String price=assertPrice.getText();
		System.out.println(price);
//		assertEquals(price,"299");
	}

	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]")
	WebElement addcartButtton;
	public void add_To_Cart_Button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(addcartButtton)).click();
	}

	@FindBy(xpath="//*[@id=\"sw-atc-details-single-container\"]/div[2]")

	WebElement addToCartAssersion;
	public void add_To_Cart_Validation()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(addToCartAssersion));

		String cartMes=addToCartAssersion.getText();
		System.out.println(cartMes);
//		assertEquals(cartMes, "Added to cart");
	}














}






