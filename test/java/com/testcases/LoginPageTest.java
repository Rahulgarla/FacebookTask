package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		System.out.println("1");
		driver();
		loginpage = new LoginPage();
		System.out.println("1");
	}
	
	@Test(priority=1)
	public void pageTest() {
		System.out.println("2");
		String title = loginpage.title();
		System.out.println(title);
		System.out.println("2");
	}
	
//	@Test(priority=2)
//	public void login() throws InterruptedException {
//		System.out.println("3");
//		logindetails();
//		Thread.sleep(2000);
//		System.out.println("3");
//	}
	
	@Test(priority=2)
	public void loginpagelogin() throws InterruptedException {
		System.out.println("3");
		loginpage.details();
		Thread.sleep(2000);
		System.out.println("3");
	}
	
	@AfterMethod
	public void Quit() {
		System.out.println("4");
		closebrowser();
		System.out.println("4");
	}


}
