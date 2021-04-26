package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ToDoMondayTasksPage {
	
private WebDriver driver;

	
	// 1. By Locators: OR(Object Repository)
	private By ToDoMonTask = By.xpath("//input[@placeholder='What needs to be done?']");
	private By getcheckBoxList = By.xpath("//li[@class='todo']//div[@class='view']//input[@type='checkbox']");
	private By selectClearCompleted = By.xpath("//button[normalize-space()='Clear completed']");
	private By deleteDinnerTask = By.xpath("//label[text() = 'Schedule dinner on saturday']");
	private By clickAll = By.xpath("//a[normalize-space()='All']");
	private By selectSportstask = By.xpath("//li[@class='todo']//div[@class='view']//label[.='Play tennis on Sunday']");
	private By completeTask = By.xpath("//li[@class='todo']//div[@class='view']//input[@class='toggle' and @type='checkbox']");
	
	
	// 2. Constructor of the page class:
	public ToDoMondayTasksPage(WebDriver driver) {
		this.driver = driver;
	}
			
	// 3. page actions: features(behaviour) of the page the form of methods:
			
			public void entertask1(String taskname1) {
				driver.findElement(ToDoMonTask).sendKeys(taskname1);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(ToDoMonTask).sendKeys(Keys.RETURN);
			}
			
			public void entertask2(String taskname2) {
				driver.findElement(ToDoMonTask).sendKeys(taskname2);
				driver.findElement(ToDoMonTask).sendKeys(Keys.RETURN);
			}
			
			public void entertask3(String taskname3) {
				driver.findElement(ToDoMonTask).sendKeys(taskname3);
				driver.findElement(ToDoMonTask).sendKeys(Keys.RETURN);
			}
			
			public void selectCheckbox(){
			    int option =1;
				List<WebElement> checkBox = driver.findElements(getcheckBoxList);
		        if (option > 0 && option <= checkBox.size()) {
		        	checkBox.get(option - 1).click();
		        } else {
		            throw new NotFoundException("option " + option + " not found");
		        }
		        
		    }
			public void clearComplete () {
				driver.findElement(selectClearCompleted).click();
			}
			
			public void enterSportstask(String sportstask) {
				driver.findElement(ToDoMonTask).sendKeys(sportstask);
				driver.findElement(ToDoMonTask).sendKeys(Keys.RETURN);
			}
			
			public void enterDinnertask(String dinnertask) {
				driver.findElement(ToDoMonTask).sendKeys(dinnertask);
				driver.findElement(ToDoMonTask).sendKeys(Keys.RETURN);
			}
			
			public void deleteDinnertask() {
				WebDriverWait wait = new WebDriverWait(driver, 5);
				WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(deleteDinnerTask));
				System.out.println("Delete button is visible: " + element);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
				
			}
			public void verifySporttask() {
				driver.findElement(clickAll).click();
				driver.findElement(selectSportstask).isDisplayed();
				driver.findElement(completeTask).click();
			}
				
}


