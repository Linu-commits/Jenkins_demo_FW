package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ListDeliveryBoyPage extends PageUtility{
	WebDriver driver;

	public ListDeliveryBoyPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css =".btn.btn-rounded.btn-danger")
	private WebElement newBtn;
	
	@FindBy(xpath ="//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath ="//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='create']")
	private WebElement saveBtn;
	
	public void CreateDeliveryBoy() {
		ClickElement(newBtn);
		SetTextBox(name,"Linu");
		SetTextBox(userName,"linu4569");
		SetTextBox(password,"12345");
		ScrollUp();
		ClickElement(saveBtn);
	}
	
	public void ValidateDeliveryBoyIsCreated() {
		
	}
}
