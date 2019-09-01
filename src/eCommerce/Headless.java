package eCommerce;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver dr = new HtmlUnitDriver();
		dr.setJavascriptEnabled(true);
		dr.get("https://www.google.com/");
	//	System.out.println(dr.getTitle());
	}

}
