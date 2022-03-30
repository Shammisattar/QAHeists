package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	WebDriver driver;
	
		 public PageObjects(WebDriver driver) {
			 
			 
			 this.driver = driver;
			 PageFactory.initElements(driver,this);
			 // we try to reuse 
			 
		 }
			 //WebElement searchBox;
				//searchBox = driver.findElement(By.name ("q"));
				@FindBy(name="q")
				WebElement searchBox;
			 
				// step:2 perform action 
				//searchBox.sendKeys(string);
				
				public void entersearch (String text) {
					searchBox.sendKeys(text);
					
				}
		 
	
	//WebElement searchBtn;
				//searchBtn = driver.findElement(By.name("btnK"));
				//searchBtn.click();
				 @FindBy(name ="btK")
				 WebElement searchBtn;
				 
				 public void clickSearch() {
					searchBtn.click();
					//searchBtn.sendKeys(Keys.RETURN);
					Actions actions = new Actions(driver);
					actions.click(searchBtn);
					actions.sendKeys(searchBtn, Keys.RETURN);
					 
				 }
				 @FindBy (id = "result-stats")
				 WebElement resultStats ;
				 public void resultStats() {
					 
				 
				 //WebElement resultStats;
					//resultStats = driver.findElement(By.id("result-stats"));
					String results = resultStats.getText();
					System.out.println("=============================================");
					System.out.println(results);
					System.out.println("=============================================");
					
				 }
				
	

}
