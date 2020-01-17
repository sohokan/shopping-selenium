package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class viewcart {

	public void proceed_to_checkout(WebDriver driver)

	{
		// driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		WebDriverWait wait2 = new WebDriverWait(driver, 10);

		WebElement viewcarticon = driver
				.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/i"));
		viewcarticon.click();
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/i")));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[2]/a"))
				.getText());
		System.out.println(driver
				.findElement(
						By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[3]/span"))
				.getText());
		System.out.println(driver
				.findElement(
						By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[2]/dl/dd"))
				.getText());
		WebElement checkouticon = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[2]/div/a"));
		checkouticon.click();

	}

	public void continue_shopping(WebDriver driver)

	{

	//	WebDriverWait wait2 = new WebDriverWait(driver, 10);

		WebElement viewcarticon = driver
				.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/i"));
		viewcarticon.click();

		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[2]/a"))
				.getText());
		System.out.println(driver
				.findElement(
						By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[3]/span"))
				.getText());
		System.out.println(driver
				.findElement(
						By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[1]/td[2]/dl/dd"))
				.getText());
		// wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[2]/td/a[2]]")));
		WebElement continueshoping = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/form/table/tbody/tr[2]/td/a[2]"));
		continueshoping.click();

	}
}
