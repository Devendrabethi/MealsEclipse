package StepDefinations;

import org.openqa.selenium.WebDriver;

import Hooks.hook;
import Pages.Alertpage;
import io.cucumber.java.en.*;

public class AlertStepDefination {
	
	private WebDriver driver = hook.driver;
	private Alertpage alertpage;
	
	
	@Given("navigate to alert url")
	public void navigate_to_alert_url() {
		alertpage = new Alertpage(driver);
		alertpage.alerturl();
	}

	@Then("Verify the alert page")
	public void verify_the_alert_page() {
		alertpage.assertverify();
	}

	@When("Click on climeme button")
	public void click_on_climeme_button() throws InterruptedException {
		alertpage.clickbutton();
	}

	@When("Accept the alert")
	public void accept_the_alert() {
		alertpage.alertpop();
	}

}
