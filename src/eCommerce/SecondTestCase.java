package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase extends SetUp{
	//WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String exePath = "C:\\Users\\Ankita\\Documents\\selenium\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
	
		
		//SetUp s = new SetUp();
		//s.Launch(url);
		SecondTestCase stc = new SecondTestCase();
		//stc.Launch(url);
		stc.validatePage(driver);
		
		//driver.get(url);
	}
	
		
	}


