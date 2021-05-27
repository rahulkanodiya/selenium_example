package com.edureka.devops.selenium_20210508;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verifyHomepageTitle()
    {
    	String expectedTitle = "Google";
    	System.setProperty("webdriver.gecko.driver","/home/edureka/firefoxdriver/geckodriver"); 
		FirefoxOptions firefoxOptions = new FirefoxOptions(); 
		firefoxOptions.setHeadless(true);
		firefoxOptions.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(firefoxOptions); 
		driver.get("http://localhost:8080/addressbook/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);		
		Assert.assertEquals(expectedTitle,actualTitle);
		driver.close();        
    }
}
