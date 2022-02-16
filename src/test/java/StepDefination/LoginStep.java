package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class LoginStep {
	
	WebDriver driver=null;
	
	
	@Given("launch login url")
	public void launch_login_url() {
		 System.out.println("login page launched");
		  String projectpath=System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
	
	}

	@When("enter creds")
	public void enter_creds() {
		  System.out.println("creds page launched");
		  driver.close();
	}
	
	



}
