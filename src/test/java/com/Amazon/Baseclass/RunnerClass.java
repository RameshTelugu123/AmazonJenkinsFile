package com.Amazon.Baseclass;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
    features = "C:\\Users\\telug\\eclipse-workspace\\amazonWebsite\\Feature\\fea.feature",   // relative path
    glue = {"com.Amazon.Stepdefination"},                  // package name
    plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
    monochrome = true
)
public class RunnerClass extends AbstractTestNGCucumberTests {
}
