package tests;



import java.time.Duration;

import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class UserManagmentTests {

	public static void main(String[] args) {
		invalidEmailLoginTest();
	}
	
	static BrowserUtils utils;
	static LoginPage loginpage;

	public static void invalidEmailLoginTest() {
		utils = new BrowserUtils();
		loginpage = new LoginPage();
		// invalid email login test
		// go to crater
		Driver.getDriver().get(TestDataReader.getProperty("appurl"));
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.getDriver().manage().window().maximize();
		
		utils.waitForElementToBeVisible(loginpage.login_page_email_box);
	
		loginpage.login_page_login_btn.click();
		
	
		utils.waitForAllElementToBeVisible(loginpage.login_page_fieldRequired_Messages);
		if (loginpage.login_page_fieldRequired_Messages.size() == 2) {
			System.out.println("There are 2 required field messages displayed");
		}else {
			System.out.println("Something is wrong with required field messages.");
		}
		
		// enter invalid email yummy@primetechschool.com and valid password primetech@school
		utils.sendkeysWithActionsClass(loginpage.login_page_email_box, "yummy@primetechschool.com");
		//loginpage.login_page_email_box.sendKeys("yummy@primetechschool.com");
		utils.sendkeysWithActionsClass(loginpage.login_page_password_box, TestDataReader.getProperty("password"));
		//loginpage.login_page_password_box.sendKeys(TestDataReader.getProperty("password"));
		
		// click login button
		loginpage.login_page_login_btn.click();
		
		// then verify that an error message  "These credentials do not match our records." displays
		utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
		if (loginpage.login_page_invalidLogin_message.isDisplayed()) {
			System.out.println("Credential invalid Error message displayed");
		}else {
			System.out.println("Credential invalid Error message not displayed"); 
		
		}
	}
}

	
		
	