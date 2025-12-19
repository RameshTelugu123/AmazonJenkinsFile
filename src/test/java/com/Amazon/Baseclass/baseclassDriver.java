package com.Amazon.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclassDriver {
	static WebDriver driver;
//	public static void launchBrowser(WebDriver driver) throws IOException {
		
		public WebDriver launchBrowser() {
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.amazon.in/");
		    return driver;  
//		}
	}

}
