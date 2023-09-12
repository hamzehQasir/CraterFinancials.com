package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerManagementSteps {
	
	
	 @Given("I am on the Crater login page")
	    public void iAmOnTheCraterLoginPage() {
	        // Implementation for navigating to the login page
	    }

	    @When("I enter the credentials email: {string} password: {string}")
	    public void iEnterTheCredentials(String email, String password) {
	        // Implementation for entering email and password
	    }

	    @When("I click the login button")
	    public void iClickTheLoginButton() {
	        // Implementation for clicking the login button
	    }

	    @When("I navigate to the customers tab")
	    public void iNavigateToTheCustomersTab() {
	        // Implementation for navigating to the customers tab
	    }

	    @When("I click the new customer button")
	    public void iClickTheNewCustomerButton() {
	        // Implementation for clicking the new customer button
	    }

	    @When("I enter a valid Display Name: {string}, Email: {string}, Billing Address: {string}, and Shipping Address: {string}")
	    public void iEnterValidCustomerDetails(String displayName, String customerEmail, String billingAddress, String shippingAddress) {
	        // Implementation for entering customer details
	    }

	    @When("I click Save Customer")
	    public void iClickSaveCustomer() {
	        // Implementation for clicking the save customer button
	    }

	    @Then("I should view the saved customer in the Customers Table")
	    public void iShouldViewSavedCustomer() {
	        // Implementation for verifying the saved customer in the table
	    }

	    @And("I delete the customer")
	    public void iDeleteTheCustomer() {
	        // Implementation for deleting the customer
	    }

}
