package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regularpage {
	
	public WebDriver driver;
	
	public Regularpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement UN;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement PWD;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement PloginbtnWD;
	
	public void regularurl()
	{
		driver.get("https://www.saucedemo.com/v1/");
	}
	public void credential(String username, String password) throws InterruptedException
	{
		UN.sendKeys(username);
		PWD.sendKeys(password);
		Thread.sleep(3000);
	}
	public void loginbutton()
	{
		PloginbtnWD.click();
	}

}
