package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id="email")
	WebElement name;
	@FindBy(id="pass")
	WebElement pass;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String title() {
		return driver.getTitle();
	}
	
	public void details() {
		String username = det.getProperty("username");
		String password = det.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		name.sendKeys(username);
		pass.sendKeys(password);
	}

}
