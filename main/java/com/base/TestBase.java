package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties det;
	
	public TestBase() {
		det = new Properties();
		try {
			FileInputStream fis = new FileInputStream(".\\src\\main\\java\\com\\config\\config.properties");
			det.load(fis);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void driver() {
		String URL = det.getProperty("URL");
		System.out.println(URL);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	public void logindetails() {
		String username = det.getProperty("username");
		String password = det.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	public void closebrowser() {
		driver.quit();
	}

}
