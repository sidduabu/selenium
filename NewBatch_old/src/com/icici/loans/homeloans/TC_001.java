package com.icici.loans.homeloans;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_001 extends BasePage
{

	public static void main(String[] args) throws IOException
	{
		browserLaunch(loadData("browser"), loadData("url"));
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		String actval = loc.getAttribute("value");
		System.out.println("Entered text is:" + actval);
		
	}

}
