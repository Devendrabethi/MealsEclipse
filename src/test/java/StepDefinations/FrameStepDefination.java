package StepDefinations;

import org.openqa.selenium.WebDriver;

import Hooks.hook;
import Pages.FramePage;
import io.cucumber.java.en.*;

public class FrameStepDefination {
	
	public static WebDriver driver = hook.driver;
	private FramePage framepage;
	
	@Given("Navigate to urls")
	public void navigate_to_urls() {
		framepage = new FramePage(driver);
		framepage.url1();
	}

	@When("Select menu from frame")
	public void select_menu_from_frame() {
	    framepage.framein();
	}

	@When("Enter text in parent outside frame")
	public void enter_text_in_parent_outside_frame() throws InterruptedException {
	    framepage.frameout();
	    
	}

}
