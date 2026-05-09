package com.Amazon.Stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.Amazon.Baseclass.Longscreenshot;
import com.Amazon.Baseclass.baseclassDriver;
import com.Amazon.PageObjectModel.AmazonHomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsFile extends baseclassDriver{
	AmazonHomePage page;
	WebDriver driver;
	
   

   


	@Given("launch url")
	public void launch_url() throws IOException {

		driver = launchBrowser();   
		page = new AmazonHomePage(driver);  
		page.click_Search_Box();

		System.out.println("clicked");
	}


	@When("Enter {string} in the search bar and press Enter")
	public void enter_in_the_search_bar_and_press_enter(String productName) {
		page.Senddata_Search_Box(productName);
		page.click_OnSearch_Button();
		System.out.println("clicked");
		driver.navigate().refresh();
	}


	@And("Click on the first non-sponsored product")
	public void click_on_the_first_non_sponsored_product() {
		page.choose_Item();
	}

	@And("On the product detail page, validate that the product title and price are visible")
	public void on_the_product_detail_page_validate_that_the_product_title_and_price_are_visible() {
		page.Item_name_assert();
		page.assert_price_value();
	}

	@And("Click Add to Cart")
	public void click_add_to_cart() {
		page.add_To_Cart_Button();
	}

	@Then("Verify confirmation message appears: Added to Cart")
	public void verify_confirmation_message_appears_added_to_cart() throws IOException {
		System.out.println("clicked");
		Longscreenshot.takeFullScreenshot(driver);
	}




}
