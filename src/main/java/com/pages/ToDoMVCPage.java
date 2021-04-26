package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ToDoMVCPage {

	private WebDriver driver;

	// 1. By Locators: OR(Object Repository)
	private By ToDoTask = By.xpath("//input[@placeholder='What needs to be done?']");
	private By ToDoCount = By.xpath("//footer[@class='footer']//span[@class='todo-count']");
	private By ToDoView = By.xpath("//li[@class='todo']//div[@class='view']");
	
	//private By signInButton = By.id("SubmitLogin");
	
	// 2. Constructor of the page class:
		public ToDoMVCPage(WebDriver driver) {
			this.driver = driver;
		}
		
	// 3. page actions: features(behavior) of the page the form of methods:
		
		public boolean checkToDoEnabled() {
			return driver.findElement(ToDoTask).isEnabled();
		}
		
		public String getDefaultToDoText() {
			String innerText = driver.findElement(ToDoTask).getAttribute("placeholder");
			return innerText;
			
		}
			
		public void enterTask(String taskname) {
			driver.findElement(ToDoTask).sendKeys(taskname);
		}
		
		public void clickEnter() {
			driver.findElement(ToDoTask).sendKeys(Keys.RETURN);
		}
		
		public boolean verifyTaskExists() {
			return driver.findElement(ToDoView).isDisplayed();
		}

		public boolean isToDoCountDisplayed() {
			return driver.findElement(ToDoCount).isDisplayed();
		}
    
	
	
}
