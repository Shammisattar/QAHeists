package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglebaseHeist {
	
	 public WebDriver driver;
	
	public void lanuchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
	}
	
	//@SuppressWarnings("deprecation")
	//public void closePopup() {
		//System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    //ChromeOptions options  = new ChromeOptions();
	    //options.addArguments("incognito");
	    //options.addArguments("--disable-popup-blocking");
	   // DesiredCapabilities capabilities = new DesiredCapabilities();
	   // capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	   // driver = new ChromeDriver(capabilities);
	//}
	
	
	
	
	
	
	
	

}
