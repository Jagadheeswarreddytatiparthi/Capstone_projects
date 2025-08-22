package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multiplesearchesstep {
	
	WebDriver driver;
	Pageclass pg;
	
	@Given("ebay website homepage")
	public void ebay_website_homepage() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    	}

	@When("search for any item in search box multiple times")
	public void search_for_any_item_in_search_box_multiple_times() throws InterruptedException {
		pg=new Pageclass(driver);
		pg.search_in();
	    
	}

	@Then("searched item is appreded successfully.")
	public void searched_item_is_appreded_successfully() {
		System.out.println("searched item is appered below successfully.");
		driver.close();
	    
	}




}
