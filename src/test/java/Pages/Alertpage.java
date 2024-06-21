package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Alertpage {
	
	public WebDriver driver;
	
	public Alertpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'AlertsDemo')]")
	WebElement verifyalert;
	
	@FindBy(xpath="//button[@id='alertBox']")
	WebElement clickmebtn;
	
	
	public void alerturl()
	{
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	}
	public void assertverify() 
	{
		String a = "AlertsDemo";
		Assert.assertEquals(verifyalert.getText(), a);
	}
	public void clickbutton() throws InterruptedException
	{
		clickmebtn.click();
		Thread.sleep(3000);
	}
	 public void alertpop()
	 {
		 try
		 {
			 driver.switchTo().alert().dismiss();
		 }
		 catch(NoAlertPresentException  e)
		 {
			driver.switchTo().alert().accept(); 
		 } 
	 }

}
