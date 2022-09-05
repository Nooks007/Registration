package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Registration 
{
	WebDriver driver=null;
	
	@Given("I enter URL")
	public void EnterURL() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Swapna Testing\\Softwares\\Selenium Browsers\\chromedriver_win32\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}

	@Then("I click on Submit")
	public void ClickSubmit() 
	{
	    driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
	}

	@Then("I click on Refresh")
	public void ClickRefresh() 
	{
	    driver.findElement(By.xpath("//button[@id='Button1']")).click();
	}
	
	@And("I verify FirstName is blank")
	public void VerifyFirstName() 
	{
		WebElement firstName=driver. findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		String tooltipText = firstName.getAttribute("validationMessage");
		System.out.println(tooltipText);
		String expectedText = "Please fill out this field.";
		System.out.println(expectedText);
		
		//Assert.notNull(tooltipText, "Please fill in this field.");
		
		
		
		Assert.assertTrue(tooltipText.contains(“Please fill”));
		
	}
	
	@Then("I quit")
	public void Quit() 
	{
	    driver.quit();
	}

	
	@Then("I click on facebook link")
	public void ClickFacebook() 
	{
		driver.findElement(By.xpath("//body/footer[@id='footer']/div[1]/div[1]/div[2]/a[1]/span[1]]")).click();
	}

	@Then("I click on Linkedin link")
	public void ClickLinkedin()
	{
		driver.findElement(By.xpath("//body/footer[@id='footer']/div[1]/div[1]/div[2]/a[3]/span[1]")).click();
	}

	@Then("I click on Twitter link")
	public void ClickTwitter() 
	{
		driver.findElement(By.xpath("//body/footer[@id='footer']/div[1]/div[1]/div[2]/a[2]/span[1]")).click();
	}

	@Then("I click on Youtube link")
	public void ClickYoutube()
	{
		driver.findElement(By.xpath("//body/footer[@id='footer']/div[1]/div[1]/div[2]/a[5]/span[1]")).click();
	}

	
}
