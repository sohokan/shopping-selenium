package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class credentials_login {
	
	
	public void credentials (WebDriver driver){


    
   /* // Launch FirefoxDriver
    driver = new FirefoxDriver();
    
    // Open the web page
    driver.get("http://shop.demoqa.com/");*/
    
	
	WebDriverWait wait = new WebDriverWait(driver, 30);      
	Alert alert = wait.until(ExpectedConditions.alertIsPresent()); 
	
	System.out.println(alert.getText());
	driver.switchTo().alert().sendKeys("103124"+ Keys.TAB + "gamer$345");
	driver.switchTo().alert().accept();
	
    System.out.println( driver.getCurrentUrl());

   
    WebDriverWait wait2 = new WebDriverWait(driver, 30); 
   // WebElement button = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='button']")));
    
 WebElement button = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/form/table[2]/tbody/tr/td/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/input[2]")));
    
     button.click();

}
}
