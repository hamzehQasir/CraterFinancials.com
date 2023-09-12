package pages;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class PageObject {
	    private WebDriver driver;

	    public PageObject(WebDriver driver) {
	        this.driver = driver;
	    }

	    public WebElement getEmailField() {
	        return driver.findElement(By.id("emailField"));
	    }

	    public WebElement getPasswordField() {
	        return driver.findElement(By.id("passwordField"));
	    }

	    public WebElement getLoginButton() {
	        return driver.findElement(By.id("loginButton"));
	    }

}
