package com.Amazon.Baseclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extenetreports {

	static ExtentReports extent;
	public static ExtentReports initReport() {
		// Define the report path
		ExtentSparkReporter spark = new ExtentSparkReporter("amazonWebsite/target/ExtentReport.html");

		// Create ExtentReports object
		extent = new ExtentReports();

		// Attach reporter
		extent.attachReporter(spark);
		return extent;
	}

}
