package automationFramework;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clothing_overview 
{
	String[] ddl1;
	String[] ddl2;
	
public void clothing_purchase(WebDriver driver)

{
	String color;
	String size;
	System.out.println( driver.getCurrentUrl());
	
	WebDriverWait wait2 = new WebDriverWait(driver, 10);
	
	WebElement clothname =wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/h1")));
	
	System.out.println(clothname.getText());
	
	//boolean ddlcolor=driver.findElements(By.xpath("//*[@id=\"color\"]")).size()>0;
	//boolean ddlsize=driver.findElements(By.xpath("//*[@id=\"size\"]")).size()>0;
	if (driver.findElements(By.xpath("//*[@id=\"color\"]")).size()>0)
   {
		 color="//*[@id=\"color\"]";
   }
	else
	{
		 color="//*[@id=\"pa_color\"]";
	}
	
	if (driver.findElements(By.xpath("//*[@id=\"size\"]")).size()>0)
	   {
			 size="//*[@id=\"size\"]";
	   }
		else
		{
			 size="//*[@id=\"size\"]";
		}
	
	Select dropdown1 = new Select(driver.findElement(By.xpath(color)));
	
	Select dropdown2 = new Select(driver.findElement(By.xpath(size)));
	
	

	 
	List<WebElement> lst = dropdown1.getOptions();
	 List<WebElement> lst2 = dropdown2.getOptions();
	 ddl1 = new String[lst.size()-1];
	 ddl2 = new String[lst2.size()-1];
	 selectInDropdownByValue(lst, "Choose an option", ddl1);
	 selectInDropdownByValue(lst2, "Choose an option", ddl2);
	 System.out.println( Arrays.toString(ddl1) );
	 System.out.println( Arrays.toString(ddl2) );
	 
	 System.out.println( ddl1.length);
	 System.out.println( ddl2.length);
	 dropdown1.selectByIndex(ddl1.length);
	 dropdown2.selectByIndex(ddl2.length-2);
	
	// WebElement iconplus= driver.findElement(By.xpath ("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/div/div/button[2]/i"));
	// iconplus.click();
	 
	 WebElement addtocart= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/form/div/div[2]/button"));
	 addtocart.click();
}

public static void selectInDropdownByValue(List<WebElement> lst, String val, String[] ddlarray)

{
	int i=0;
	System.out.println(lst.size());
	for (WebElement ddl : lst) 
	{
		System.out.println(ddl.getText());
		 //System.out.println(ddl.getText());
		 if (!ddl.getText().contentEquals(val))
		 {
			 ddlarray[i]=ddl.getText();
			 //System.out.println(i);
			// System.out.println(ddl.getText());
			 
			 i++;
		 }
	 }
}
}