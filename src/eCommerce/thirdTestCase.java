package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class thirdTestCase extends SetUp
{
	public static void main(String[] args)
	{
	String exePath = "C:\\Users\\Ankita\\Documents\\selenium\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	String url = "https://www.google.com";
	SetUp.Launch(driver, url);
	}
	
	public void validatePage(String url, WebDriver driver) 
	{
		
		String cu = driver.getCurrentUrl();
		if(cu.contentEquals(url))
		{
			System.out.println("correct URL");
			System.out.println(cu);
		}
		else
		{
			System.out.println("Wrong URL");
			System.out.println("The correct URL is - https://www.facebook.com/");
		}
}
}