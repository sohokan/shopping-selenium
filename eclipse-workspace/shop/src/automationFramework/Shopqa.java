package automationFramework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Shopqa {
	private static WebDriver driver;

	public static void main(String[] args) {
		
		List<clotheslist> clotheList ;
		clotheList = new ArrayList<>();
		List<clotheslist> allitemsList;
		allitemsList= new ArrayList<>();

		System.setProperty("webdriver.gecko.driver", "c:/Users/103124/Downloads/geckodriver.exe");

		driver = new FirefoxDriver();

		// Open the web page
		driver.get("http://shop.demoqa.com/");

		String s2 = "dress";

		credentials_login logins = new credentials_login();

		search_items search = new search_items();

		clothing_overview clothingdetail = new clothing_overview();

		viewcart shoppingcontinue = new viewcart();

		logins.credentials(driver);

		search.search(s2, driver);
		//search.paginationbynext(driver,clotheList);
		search.identifyclothes(driver,clotheList,1);

		search.sort(clotheList);
		search.cheapestclothe(driver, clotheList);
		// search.expensiveclothe(driver);
		clothingdetail.clothing_purchase(driver);

		shoppingcontinue.continue_shopping(driver);
		search.paginationbynext(driver,allitemsList);
		search.sort(allitemsList);
		search.expensiveclothe(driver, allitemsList);
	}

}
