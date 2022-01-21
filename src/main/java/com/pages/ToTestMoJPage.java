package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToTestMoJPage {
	
	private WebDriver driver;
	
	private By Organis = By.xpath("//a[normalize-space()='Organisations']");
	//private By TitleText = By.xpath("//input[@placeholder='What needs to be done?']");
	
	public ToTestMoJPage(WebDriver driver) {
		this.driver = driver;
			
	}
	
	public void clickOrg() {
		driver.findElement(Organis).click();
	}
	
	public void VerifyText() {
		String strTitle = driver.getTitle();
		System.out.println(strTitle);
	}

}
