package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleStep {
	
	WebDriver driver=null;
	@Given("Browser is open$")
	public void browser_is_open() {
		  System.out.println("login page launched");
		  String projectpath=System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		}
	

	@And("user enter on googlesearch$")
	public void user_enter_on_googlesearch() {
		 System.out.println("search box");
	    driver.close();
	}

}
