package eCommerce;
import org.openqa.selenium.h
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	//public String url = "https://www.amazon.in/";
	
	public static WebDriver Launch(WebDriver driver ,String url)
	{
		driver.get(url);
		return driver;
		driver.manage().timeouts();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		name - //input[@class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']
		
	}
}
