package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shopbyallcategory {
	
	WebDriver driver;
	Pageclass pg;
	@Given("eBay website Homepage")
	public void e_bay_website_homepage() throws InterruptedException {
		driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	    
	}

	
	@When("click on shop by all category select anyone category")
	public void click_on_shop_by_all_category_select_anyone_category() throws InterruptedException {
		pg=new Pageclass(driver);
		pg.shopbyallcategory_in();
	   
	}

	@When("click on that selected category")
	public void click_on_that_selected_category() {
		System.out.println("particular Category is selected successfully from all category");
	    
	}

	@Then("category is selected from all category successfully.")
	public void category_is_selected_from_all_category_successfully() {
		System.out.println("Category is selected successfully from all category");
		driver.close();
		
	   
	}




}
