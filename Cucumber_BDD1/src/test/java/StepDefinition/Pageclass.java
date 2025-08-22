package StepDefinition;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class Pageclass {
	WebDriver driver;
	Pageclass pg;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
    By search=By.name("_nkw");
    By searchbutton=By.id("gh-search-btn");
    By submit=By.id("sgnBt");
    By addtocart=By.id("atcBtn_btn_1");
    By allcategories=By.id("gh-cat");
    By shopbycategory=By.cssSelector("span[class=gh-categories__title]");
    By particularcategory =By.name("_sacat");
    By electronics=By.linkText("Electronics");
    By addressbox=By.id("account-settings-link-ADDR");
    By individualedit=By.id("individual_personal_info_address_edit_button");
    By countryBox=By.id("country");
    By countryName=By.cssSelector("select>option[value=\"IN\"]");
    By address1Box=By.id("addressLine1");
    By cityBox=By.id("city");
    By cityName=By.cssSelector("select>option[value=\"AP\"]");
    By pincode=By.id("postalCode");
    By addressedit=By.id("address_edit_submit_button");
    By productimage=By.cssSelector("s-item__image");
    By accountsettings=By.id("account-settings-link-PI");
    By individualusername=By.id("individual_username_edit_button");
    By username1=By.id("user_name");
    By usernamesubmit=By.id("username_submit_edit_btn");
    By ebaylogo=By.id("gh-logo");
    
    public Pageclass(WebDriver driver) {
    	this.driver=driver;
    }
    public void email_in() {
    	driver.findElement(email).click();
    	driver.findElement(email).clear();
    	driver.findElement(email).sendKeys("tatiparthijr2001@gmail.com");
    }
    public void pass_in() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(pass).click();
    	driver.findElement(pass).clear();
    	driver.findElement(pass).sendKeys("Reddy@7125");
    }
    public void con_in() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(cont).click();
    	Thread.sleep(2000);
    	
    }
    public void submit_in() {
    	driver.findElement(submit).click();
    	
    }
    public void search_in() throws InterruptedException {
    	driver.findElement(search).click();
    	List<String> items = Arrays.asList("laptop", "headphones", "smartwatch");
        for (String item : items) {
           WebElement searchBox = driver.findElement(search);  
           searchBox.clear();
            Thread.sleep(2000);
           searchBox.sendKeys(item);
           driver.findElement(searchbutton).click();
        }
    	
    }
    public void addtocart_in() {
      WebElement search1=driver.findElement(search);
   	  search1.clear();
   	 search1.sendKeys("watch");
   	 search1.sendKeys(Keys.ENTER);
   	driver.navigate().to("https://www.ebay.com/itm/335822935963?_skw=watch&epid=15064111658&itmmeta=01K2R971V1JRE287EAC2TXSVDJ&hash=item4e309b579b:g:pysAAOSwaoloC6Ve&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1exwDffoYngbM18VK6MQZe1JM7WhpmRF8rmTBwB6fQ8lrHWXvVJMfFOb55SqJH1nvTxw1w3nOiSmvEghXX2%2FIFsaHuPgjY5G3uM1KfpsGpgdNK0y5spDCRrEcNp9Vu%2BcPt4bRgCWAih57%2BFzcLNKgx7iLDv2%2BCMA0hlVgRBzFbynsNKIvQWo2EoJjuReZk6j6DGD4WPMnlHOt%2BEcvbR5r2xMKA2c9Rr3Y1dmdrcdaQbxLdfqGwfj2ykceFUx4CHM4JNHT6XIOZO0RYqxh%2FSOzfh%7Ctkp%3ABk9SR4ienImWZg");
   	  //driver.switchTo().window(Frame.getFrames(0));
   	  driver.findElement(addtocart).click();
   	  driver.navigate().refresh();
    	
    }
    public void removefromcart_in() throws InterruptedException {
    	driver.navigate().to("https://cart.ebay.com/");
  	  Thread.sleep(2000);
  	 driver.findElement(By.cssSelector("button[class=fake-link]")).click();
  	 Thread.sleep(2000);
  	 driver.navigate().refresh();
    }
    public void shopbycategory_in() throws InterruptedException {
    	
    	driver.findElement(shopbycategory).click();
   	    driver.findElement(electronics).click();
   	 Thread.sleep(2000);
   	 driver.navigate().back();
    	
    }
    public void shopbyallcategory_in() throws InterruptedException {
    	driver.findElement(allcategories).click();
    	Thread.sleep(2000);
    	//driver.findElement(particularcategory).click();
    	//Thread.sleep(2000);
    	
    	
    }
    public void changeloginname_in() throws InterruptedException {
    	 //driver.get("https://www.ebay.com/usr/tatipart89");
    	pg=new Pageclass(driver);
    	  driver.navigate().to("https://accountsettings.ebay.com/uas");
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    driver.findElement(accountsettings).click();
    	    pg.pass_in();
    	    pg.submit_in();
    	    driver.findElement(individualusername).click();
    	   WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Edit profile')]")));
    	  editButton.click();
    	  System.out.println("Edit profile button clicked");
    	  try {
    	        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(username1));

    	        if (username.isEnabled() && username.isDisplayed()) {
    	            username.clear();
    	            username.sendKeys("tatiparthi99");

    	            WebElement submitBtn = driver.findElement(usernamesubmit);
    	            submitBtn.click();
    	            driver.navigate().refresh();
    	        } else {
    	        	
    	            System.out.println("Username is not editable now. Try after 30 days from now.");
    	            driver.findElement(ebaylogo).click();
    	        }
    	    } catch (TimeoutException e) {
    	        System.out.println("Username field not available. It may not be editable now. Try after 30 days from now.");
    	    }

    	   
    }
    public void changeaddress_in() throws InterruptedException {
    	 driver.navigate().to("https://accountsettings.ebay.com/uas");
   	  WebElement address=driver.findElement( addressbox);
   	  address.click();
   	  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[1]/div/div[2]/a")).click();
   	  driver.findElement(individualedit).click();
   	  WebElement country=driver.findElement(countryBox);
   	  country.click();
   	  country.findElements(countryName);
   	  WebElement currentaddress=driver.findElement(address1Box);
   	  Thread.sleep(1000);
   	  currentaddress.clear();
   	  currentaddress.sendKeys("1-143/1,kallamvaripalem,andhrapradesh");
   	  WebElement city=driver.findElement(cityBox);
   	  city.clear();
   	  city.sendKeys("inkollu");
   	  driver.findElement(cityName).click();
   	 WebElement zip= driver.findElement(pincode);
   	 zip.clear();
   	  zip.sendKeys("523167");
   	  driver.findElement(addressedit).click();
   	  driver.navigate().refresh();
   	  
    	
    }
    public void rightclickonproduct_in() throws InterruptedException {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
  	  js.executeScript("window.scrollBy(0,400)");
  	  driver.findElement(search).sendKeys("smartwatches");
  	  driver.findElement(searchbutton).click();
  	  WebElement productImage=driver.findElement(productimage);
  	  String description=productImage.getAttribute("alt");
  	  System.out.println("Product Description:"+description);
  	  Thread.sleep(2000);
    	
    }
    public void languagechange_in() {
    	//driver.get("https://www.ebay.com/");
    	JavascriptExecutor js=(JavascriptExecutor)driver;
      	 js.executeScript("window.scrollBy(0,1200)");
      	 driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]")).click();
      	 driver.findElement(By.linkText("india")).click();
    	
    }
	
}

