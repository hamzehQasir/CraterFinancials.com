package tests;

import java.time.Duration;


import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.DashboardPage;
import pages.LoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class UserManagment_steps {
	
	
	BrowserUtils utils = new BrowserUtils();
	LoginPage loginpage = new LoginPage();
	DashboardPage dashboardPage = new DashboardPage();

	@Given("As a user, I am on the login page")
	public void as_a_user_i_am_on_the_login_page() {

		Driver.getDriver().get(TestDataReader.getProperty("appurl"));
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.getDriver().manage().window().maximize();
		utils.waitForElementToBeVisible(loginpage.login_page_email_box);

	}

	@When("I enter valid useremail and valid password")
	public void i_enter_valid_useremail_and_valid_password() {
		// Write code here that turns the phrase above into concrete actions
		utils.sendkeysWithActionsClass(loginpage.login_page_email_box, TestDataReader.getProperty("email"));
		utils.sendkeysWithActionsClass(loginpage.login_page_password_box,TestDataReader.getProperty("password"));
	}

	@When("Click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		loginpage.login_page_login_btn.click();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		utils.wiatUntilElementVisibleWithLocator(By.xpath("//span[text()=\"Amount Due\"]"));
		Assert.assertTrue( dashboardPage.dashboard_tab.isDisplayed());
		
	}
	// invalid email login attempt _start
	
	@When("I enter invalid useremail  and password")
	public void i_enter_invalid_useremail_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		utils.sendkeysWithActionsClass(loginpage.login_page_email_box,"ummy@primetechschool.com");
		utils.sendkeysWithActionsClass(loginpage.login_page_password_box,TestDataReader.getProperty("password"));
	}

	@Then("I should see an error message {string} displays")
	public void i_should_see_an_error_message_displays(String errorMessage) {
		utils.waitForElementToBeVisible(loginpage.login_page_invalidLogin_message);
	Assert.assertEquals(errorMessage,loginpage.login_page_invalidLogin_message.getText());
	
	    // Write code here that turns the phrase above into concrete actions
	  
	   
	}

	@Then("I should not be logged in")
	public void i_should_not_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(loginpage.login_page_login_btn.isDisplayed());
	}
	
	// invalid email login attempt _end


	 
	
	}



	


