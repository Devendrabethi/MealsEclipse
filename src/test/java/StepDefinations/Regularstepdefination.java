package StepDefinations;

import org.openqa.selenium.WebDriver;

import Hooks.hook;
import Pages.Regularpage;
import io.cucumber.java.en.*;

public class Regularstepdefination {

	private WebDriver driver = hook.driver;
	private Regularpage regularpage;
	
	
	
	@Given("Navigate to meals url")
	public void navigate_to_meals_url() {
		regularpage = new Regularpage(driver);
		regularpage.regularurl();
	}

	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String username, String password) throws InterruptedException {
		regularpage.credential(username, password);
	}

	@When("Click on swagLogin button")
	public void click_on_swag_login_button() {
		regularpage.loginbutton();
	}
}
