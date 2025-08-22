package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	WebDriver driver;
	@Given("login user and search button available")
	public void login_user_and_search_button_available() {
		driver =new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	    
	}

	@When("click on search button")
	public void click_on_search_button() {
		WebElement searchbox=driver.findElement(By.id("searchTerm"));
		
	    
	}

	@When("Enter inputs and then use keyboard enter key")
	public void enter_inputs_and_then_use_keyboard_enter_key() {
		WebElement searchbox=driver.findElement(By.id("searchTerm"));
		searchbox.sendKeys("online");
		searchbox.sendKeys(Keys.ENTER);
	   
	}

	@Then("list of relevant output from search element")
	public void list_of_relevant_output_from_search_element() {
		System.out.println("Entered element is displayed.");
		driver.close();
	   
	}




}
