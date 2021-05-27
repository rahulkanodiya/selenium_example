package com.edureka.devops.selenium_20210508;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		System.setProperty("webdriver.gecko.driver","/home/edureka/firefoxdriver/geckodriver"); 
		FirefoxOptions firefoxOptions = new FirefoxOptions(); 
		firefoxOptions.setHeadless(true);
		firefoxOptions.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(firefoxOptions); 
		driver.get("http://google.com");
		driver.close();
    }
}
