package eCommerce;

import java.awt.Desktop.Action;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String childWindow = " ";
		String exePath = "C:\\Users\\Ankita\\Documents\\selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 String url = "http://toolsqa.com/automation-practice-switch-windows/";
	//	 WebElement element;
		 driver.get(url);
		 driver.manage().window().maximize();
		 String mainWindow = driver.getWindowHandle();
		 System.out.println(mainWindow);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)", "");
		 	 
		 
		 driver.findElement(By.xpath("//button[text() = 'New Message Window']")).click();
		 
		 Set<String> s1 = driver.getWindowHandles();
		 java.util.Iterator<String> i1 = s1.iterator();
		 while(i1.hasNext())
		 {
			//  childWindow = i1.next();
			 System.out.println("Child windows "+ i1.next());
		 }
		 driver.switchTo().window(childWindow);
		 driver.close();
		 
		 driver.switchTo().window(mainWindow);
		 driver.close();
		 
	}

}
