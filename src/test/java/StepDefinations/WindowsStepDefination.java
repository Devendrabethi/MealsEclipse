package StepDefinations;

import org.openqa.selenium.WebDriver;

import Hooks.hook;
import Pages.Windowspage;
import io.cucumber.java.en.*;

public class WindowsStepDefination {
	
	private static WebDriver driver = hook.driver;
	private Windowspage windowpage;
	
	@Given("Navigate to windows url")
	public void navigate_to_windows_url() 
	{
	 windowpage = new Windowspage(driver);
	 windowpage.url2();
	}

	@When("Click on new window")
	public void click_on_new_window() throws InterruptedException
	{
	    windowpage.windowhandles();
	}

	@When("navigate to parent window")
	public void navigate_to_parent_window()
	{
		windowpage.parentwin();
	}
}
