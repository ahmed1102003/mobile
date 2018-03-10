package mobile;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Javacode {
	


WebDriver driver = null;
	
	private String Text7;
	
	
	 @Given("^Open Goolge chrome on - Device1 Nexus 9$")
	 	public void open_google_chrome() throws Throwable {
		 
		
	 	
		 DesiredCapabilities  desiredCapabilities = new DesiredCapabilities();
		 
		    desiredCapabilities.setCapability("platformName", "Android" );
		    desiredCapabilities.setCapability( "deviceName", "HT4CSJT00905" );
		    desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main" );
		    desiredCapabilities.setCapability("platformVersion", "6.0" );
		    desiredCapabilities.setCapability( "appPackage", "com.android.chrome");
		    desiredCapabilities.setCapability("noReset", true);
		    desiredCapabilities.setCapability("fullReset", false);
		    
		    driver =  new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
			driver.get("http://www.yahoo.com");
	 
	 	}
	 	
	 	
	 @Given("^Open Mopria Print with for parameter from cucumber$")
	 
	 public void open_google_chrome_with_Parameter(DataTable setting) throws Throwable {
		
			
		 List<List<String>> data = setting.raw();
		 
		String platformNameValue = data.get(0).get(0); 
		String deviceNameValue = data.get(0).get(1); 
		String appActivityValue = data.get(0).get(2); 
		String platformVersionvalue = data.get(0).get(3); 
		String appPackagevalue = data.get(0).get(4); 
		 
		 DesiredCapabilities  desiredCapabilities = new DesiredCapabilities();
		 
		    desiredCapabilities.setCapability("platformName", platformNameValue );
		    desiredCapabilities.setCapability( "deviceName", deviceNameValue);
		    desiredCapabilities.setCapability("appActivity", appActivityValue );
		    desiredCapabilities.setCapability("platformVersion", platformVersionvalue );
		    desiredCapabilities.setCapability( "appPackage", appPackagevalue);
		    desiredCapabilities.setCapability("noReset", true);
		    desiredCapabilities.setCapability("fullReset", false);
		   

		 driver =  new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
			//driver.get("http://www.yahoo.com");
		 Thread.sleep(5000); 
	 	}
	
	 
	 @When("^The ID is '(.*)' and the printer '(.*)' should discover$")
	 public void pinter_dicover(String ids ,String printerName) throws Throwable {
		 Thread.sleep(5000); 
		 By by = By.id(ids);
			driver.findElement(by);
			WebElement findElement = driver.findElement(by);
			String text = findElement.getText();
			assertEquals(printerName, text);
			
	 }
	 	
	 
	 @When("^I Enter '(.*)' in the '(.*)' feild$")
	 public void I_Enter_Text_in_the_feild(String Text ,String IDfiled) throws Throwable {
		 Thread.sleep(5000); 
		 By by = By.id(IDfiled);
		 	
		 this.Text7 = Text;
		 
		 driver.findElement(by).clear();
		 
			driver.findElement(by).sendKeys(Text);
			 
	 }
	 
	 @When("^I Click on '(.*)' button$")
	 public void I_Click_on_ID_button(String ids) throws Throwable {
		 Thread.sleep(5000); 
		 By by = By.id(ids);
			driver.findElement(by).click();
			
	 }
	 
	 @Then("^The Text should discover at '(.*)'$")
	 public void The_Text_Should_Display(String IDPage) throws Throwable {
		 Thread.sleep(5000); 
		 By by = By.id(IDPage);
			driver.findElement(by);
			WebElement findElement = driver.findElement(by);
			String Pagetext = findElement.getText();
			assertEquals(this.Text7, Pagetext);
			 
	 }
	 	 	 
}