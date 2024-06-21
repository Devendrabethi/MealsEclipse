package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePage {
	
	public WebDriver driver;
	
	public FramePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By selectdropdown = By.xpath("(//select[@id='selectnav2'])[1]");
	By textoutarea = By.xpath("//input[@id='name']");
	
	public void url1()
	{
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	}
	
	public void framein()
	{
		driver.switchTo().frame("frm1");
		Select sel = new Select(driver.findElement(selectdropdown));
		sel.selectByVisibleText("Contact");
		driver.switchTo().defaultContent();
	}
	public void frameout() throws InterruptedException
	{
		driver.findElement(textoutarea).sendKeys("parent");
		Thread.sleep(5000);
	}

}
