package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class RegistrationPage extends BaseClass{
	
	public RegistrationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);//constructor or method variable are equal then we can follow this keyword PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath = "//a[@class='ico-register']")
	WebElement registerButtop;               //Webelement-HTML element on a website.locating elements, getting attribute properties, 
	                                          //asserting text present in WebElement, and more.
	@FindBy (xpath = "//*[@id='gender-female']")
	WebElement radio;
	
	@FindBy (xpath = "//*[@id='FirstName']")
	WebElement firstName;

	@FindBy (xpath = "//*[@id='LastName']")
	WebElement lastName;
	
	@FindBy (xpath = "//*[@name='Email']")
	WebElement email;

	@FindBy (xpath = "//*[@name='Password']")
	WebElement password;
	
	@FindBy (xpath = "//*[@name='ConfirmPassword']")
	WebElement confirmpPassword;
	
	@FindBy (xpath = "//*[@id='register-button']")
	WebElement confirmRegister;
	
	@FindBy (xpath = "(//a[@class='account'])[1]")
	WebElement account;
	
	
	public void registerUser(String fName,String lName,String mail) {
		registerButtop.click();
		radio.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email.sendKeys(mail);
	}
	
	public void userPassword(String pass, String confirmPass) {
		password.sendKeys(pass);
		confirmpPassword.sendKeys(confirmPass);
	}
	
	public void register() {
		confirmRegister.click();
	}
	
	public String user() {
		String acc = account.getText();
		return acc;
	}
	
}
