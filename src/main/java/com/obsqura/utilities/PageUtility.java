package com.obsqura.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.constants.Constants;

public class PageUtility {

	WebDriver driver;
	WebDriverWait wait;
	public PageUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver, Duration.ofSeconds(8));
	}
	
	
	/**
	 * Utility or wrapper for ClickElement
	 * @param element
	 */
	public void ClickElement(WebElement element) {
		element.click();
	}
	
	
	public void SetTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void SelectFromStaticDropdown(WebElement dropdown, String value) {
		 Select staticDropdown = new Select(dropdown);
	     staticDropdown.selectByValue(value);
		
	}
	
	public void AcceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	
	public String GetElementText(WebElement element) {
		return element.getText();
		
	}
	/**
	 * Homework
	 * @param element
	 */
	public void WaitUntilVisible(WebElement element) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, "Complete!"));
	}
	
	public void ScrollUp() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000);");
	}
	
	public void WaitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
}
