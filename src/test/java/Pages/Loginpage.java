package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Loginpage {
	
	public WebDriver driver;
	//public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By seleniumhover = By.xpath("//a[contains(text(),'Selenium Practice')]");
	By Waitspractice = By.xpath("//a[contains(text(),'Waits Practice')]");
	By dismisspopup = By.xpath("//div[@id = 'dismiss-button']");
	By verifywaitpage = By.xpath("//h1[contains(text(),'Waits Demo')]");
	
	By textbox1 = By.xpath("//button[@id='btn1']");
	By textarea1 = By.xpath("//input[@id='txt1']");
	
	
	public void url()
	{
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	}
	
	public void hover()
	{
		driver.findElement(textbox1).click();
		
		//Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(seleniumhover)).build().perform();
	}
	public void waits()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(textarea1));
		driver.findElement(textarea1).sendKeys("Devendra");
		
		//driver.findElement(Waitspractice).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(dismisspopup));
		
		//driver.findElement(dismisspopup).click();
	}
	public void verifying()
	{
		//Assert.assertTrue(driver.findElement(verifywaitpage).isDisplayed());
	}

	

}
