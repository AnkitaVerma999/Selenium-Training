package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class firstTestCase {
	static String url = "https://www.google.com/?gws_rd=ssl";
	static String secUrl ="https://www.facebook.com/";
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args)
	{
		String exePath = "C:\\Users\\Ankita\\Documents\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		firstTestCase first = new firstTestCase();
		first.check("https://www.google.com/?gws_rd=ssl");
		first.Nav("https://www.google.com/?gws_rd=ssl", "https://www.facebook.com/");
		thirdTestCase third = new thirdTestCase();
		third.validatePage(url, driver);
		//String title = driver.getTitle();
		//System.out.println(title);
	}
		public void check(String u)
		{
			this.url= u;
			driver.get(url);
			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.contentEquals(url))
			{
				System.out.println("Successfull");
			}
			else
			{
				System.out.println("Not successfull");
			}
		}
		
		//validate the page source
		//System.out.println(driver.getPageSource().length());
		public static void Nav(String ur,String ur2)
		{
		
		
		driver.navigate().to(url);
		driver.navigate().to(secUrl);
		driver.navigate().back();
		thirdTestCase third = new thirdTestCase();
		third.validatePage(url, driver);
		driver.navigate().forward();
		third.validatePage(secUrl, driver);
		
		
		}
		// closes browser 
		//driver.quit();
		// closes the particular page
		//driver.close();
	
		

		}
		
		
		
	


