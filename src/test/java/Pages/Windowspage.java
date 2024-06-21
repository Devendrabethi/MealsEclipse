package Pages;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Windowspage
{
	
	public WebDriver driver;
	
	public Windowspage( WebDriver driver)
	{	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath="//button[@id='newWindowBtn']") 
	 WebElement newopenwindowbtn;
	 
	 @FindBy(xpath="//input[@id='firstName']")
	 WebElement firsttext;
	 
	 @FindBy(xpath="//input[@id='lastName']")
	 WebElement lasttext;
	 
	 @FindBy(xpath="//input[@id='malerb']")
	 WebElement radiobtn;
	 
	 @FindBy(xpath="//input[@id='email']")
	 WebElement emailidfield;
	 
	 @FindBy(xpath="//input[@id='password']")
	 WebElement passwordfield;
	 
	 @FindBy(xpath="//button[@id='registerbtn']")
	 WebElement registerbtn;
	 
	 @FindBy(xpath="//label[contains(text(),'Registration is Successful')]")
	 WebElement registermsg;
	 
	 @FindBy(xpath="//input[@id='name']")
	 WebElement parenttext;
	 
	 public void url2()
	 {
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
	 }
	 
	 public void windowhandles() throws InterruptedException
	 {
		 String parentwindow = driver.getWindowHandle();
		 String expecregistermsg = "Registration is Successful";
		 newopenwindowbtn.click();
		 Set<String> arr = driver.getWindowHandles();
		 int a = arr.size();
		 System.out.println("no of windows" +a);
		 
		 for(String totalwindow:arr)
		 {
		 driver.switchTo().window(totalwindow);
		 System.out.println(driver.getTitle());
		 
		 try 
		 {
			 if(!totalwindow.equals(parentwindow))
			 {
				 driver.switchTo().window(totalwindow);
				 driver.manage().window().maximize();
				 Thread.sleep(5000);
				 firsttext.sendKeys("Devendra");
				 lasttext.sendKeys("Prasad");
				 if(radiobtn.isSelected())
				 {
					 
				 }
				 else 
				 {
					 radiobtn.click();
				 }
				 
				 List<WebElement> chklist = driver.findElements(By.xpath("//input[@name='language']"));
				 int listofcheckbox = chklist.size();
				 
				 for(int i=0;i<listofcheckbox;i++)
				 {
					 chklist.get(i).click();
				 }
				 
				 emailidfield.sendKeys("Devendraprasad@gma.com");
				 passwordfield.sendKeys("Password123");
				 registerbtn.click();
				 Assert.assertTrue(registermsg.getText().contains(expecregistermsg));
				 
				 Thread.sleep(3000);
				 driver.close();
				 
				 driver.switchTo().window(parentwindow);
				 Thread.sleep(3000);
				 
			 }
		 }
		 finally
		 {
			 
		 }
		 
		 }

	 }
	 public void parentwin()
	 {
		 parenttext.sendKeys("Parent");
	 }

}
