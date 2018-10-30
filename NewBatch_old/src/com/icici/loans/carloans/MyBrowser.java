package com.icici.loans.carloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyBrowser 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Browser Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		
		System.setProperty("webdriver.ie.driver", "D:\\Browser Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");

	}

}
