package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {

	WebDriver driver;

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("I open orange hrm homepage")
	public void i_open_orange_hrm_homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify that the logo present on home page")
	public void i_verify_that_the_logo_present_on_home_page() {
		boolean result = driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
		Assert.assertEquals(true, result);

	}

	@And("Close browser")
	public void close_browser() {
		driver.close();
	}

}
