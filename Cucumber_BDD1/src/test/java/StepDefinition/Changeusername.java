package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Changeusername {
	WebDriver driver;
	Pageclass pg;
	boolean changeloginname=false;
	
	@Given("Ebay website homepage")
	public void ebay_website_homepage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);    
	}

	@When("click on sign button and entering using email and password")
	public void click_on_sign_button_and_entering_using_email_and_password() throws InterruptedException {
		driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		pg=new Pageclass(driver);
		 pg.email_in();
		 pg.con_in();
		 pg.pass_in();
		 pg.submit_in();
	  
	}

	@When("click on account settings and click on personal info")
	public void click_on_account_settings_and_click_on_personal_info() throws InterruptedException {
		pg=new Pageclass(driver);
		pg.changeloginname_in();
		boolean changeloginname=true;
	    
	}

	@When("click on edit and change the username")
	public void click_on_edit_and_change_the_username() {
		if(changeloginname==true) {
		System.out.println("Loginname is changed successfully.");
		}else {
			System.out.println("username is not able to change for next 30 days");
		}
	   
	}

	@Then("username is successfully changed.")
	public void username_is_successfully_changed() {
		
		driver.close();
	    
	}




}
