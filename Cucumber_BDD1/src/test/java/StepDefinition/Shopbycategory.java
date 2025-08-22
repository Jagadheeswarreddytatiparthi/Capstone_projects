package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shopbycategory {
	
	WebDriver driver;
	Pageclass pg;
	@Given("eBay website homepage")
	public void e_bay_website_homepage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("click on shop by category")
	public void click_on_shop_by_category() throws InterruptedException {
		pg=new Pageclass(driver);
		pg.shopbycategory_in();
	    
	}

	@When("select any particular category")
	public void select_any_particular_category() {
		System.out.println("Particular category is selected.");
		
	   
	}

	@Then("particular category is selected successfully.")
	public void particular_category_is_selected_successfully() {
	    driver.close();
	}




}
