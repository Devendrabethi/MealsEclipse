package StepDefinations;

import org.openqa.selenium.WebDriver;

import Hooks.hook;
import Pages.Loginpage;
import io.cucumber.java.en.*;

public class Loginstepdefination {

	public static WebDriver driver = hook.driver;
	private Loginpage loginpage;


	@Given("Navigate to url")
	public void navigate_to_url() {
		loginpage = new Loginpage(driver);
		loginpage.url();
	}

	@When("Enter username and password")
	public void enter_username_and_password() {

		loginpage.hover();
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		loginpage.waits();
	}

	@Then("Validate the successfully logged in")
	public void validate_the_successfully_logged_in() {
		loginpage.verifying();
	}

}
