package StepDefinition;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
 
public class LoginExcelSteps {
	WebDriver driver;
 
    @Given("user logs in with all usernames and passwords from excel")
    public void user_logs_in_with_all_usernames_and_passwords_from_excel() {
        String filePath = "src/test/resources/testdata/LoginData.xlsx";
      List<List<String>> sheetData =ExcelReader.getSheetData(filePath,"Sheet1");
      
      System.out.println("login attempt "+i+":"+username1+"/"+password1);
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
 
 
