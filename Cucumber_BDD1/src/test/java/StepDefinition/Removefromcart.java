package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Removefromcart {
	WebDriver driver;
	Pageclass pg;
	By addtocart=By.id("atcBtn_btn_1");
	
	@Given("eBay website home page where already item is added to cart")
	public void e_bay_website_home_page_where_already_item_is_added_to_cart() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.id("gh-ac"));
		  search.sendKeys("watch");
		  search.sendKeys(Keys.ENTER);
		  
		  driver.navigate().to("https://www.ebay.com/itm/335822935963?_skw=watch&epid=15064111658&itmmeta=01K2R971V1JRE287EAC2TXSVDJ&hash=item4e309b579b:g:pysAAOSwaoloC6Ve&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1exwDffoYngbM18VK6MQZe1JM7WhpmRF8rmTBwB6fQ8lrHWXvVJMfFOb55SqJH1nvTxw1w3nOiSmvEghXX2%2FIFsaHuPgjY5G3uM1KfpsGpgdNK0y5spDCRrEcNp9Vu%2BcPt4bRgCWAih57%2BFzcLNKgx7iLDv2%2BCMA0hlVgRBzFbynsNKIvQWo2EoJjuReZk6j6DGD4WPMnlHOt%2BEcvbR5r2xMKA2c9Rr3Y1dmdrcdaQbxLdfqGwfj2ykceFUx4CHM4JNHT6XIOZO0RYqxh%2FSOzfh%7Ctkp%3ABk9SR4ienImWZg");
	   	  //driver.switchTo().window(Frame.getFrames(0));
	   	  driver.findElement(addtocart).click();
	   	  driver.navigate().refresh();
	    
	}

	@When("click on remove button to remove item from cart")
	public void click_on_remove_button_to_remove_item_from_cart() throws InterruptedException {
		pg=new Pageclass(driver);
		pg.removefromcart_in();
		
		
	    
	}

	@Then("item is removed successfully")
	public void item_is_removed_successfully() {
	    driver.close();
	}

}
