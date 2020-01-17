package automationFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_items {

	

	public void search(String searchclothname, WebDriver driver) {
		
		// a[@class='noo-search']
		System.out.println(driver.getCurrentUrl());
		// WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement searchicon = driver.findElement(By.xpath("//a[@class='noo-search']"));
		// WebElement search =
		// wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='noo-search']")));
		searchicon.click();
		WebElement search = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/form/input[1]"));
		/// html/body/div[2]/header/div[3]/div[2]/form/label
		search.sendKeys(searchclothname);
		search.sendKeys(Keys.ENTER);

	}

	public void identifyclothes(WebDriver driver,List<clotheslist> clotheList,int page_number)
	{
		WebDriverWait wait2 = new WebDriverWait(driver, 5);
		
	//	List<WebElement> xpath = (List<WebElement>) By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/*");
		
		//System.out.println(wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/*"))).getText());

		//wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"noo-site\"]")));
		//wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/*")));
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/i")));
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		
		
		
		
		//Boolean doenstexit = wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[2]/p"))).size()>0;

		//int items = wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div[2]/div[1]/div"))).size();
		Boolean isPresentcloths =(driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p"))).size()!=0;
		// System.out.println(doenstexit);
		//System.out.println(driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p")).size());
		
		
		//Boolean isPresentcloths =	isElementPresent(wait2, "/html/body/div[2]/div[2]/div[1]/div/p", driver);
		
		//System.out.println(isPresentcloths);
		
		
          if (isPresentcloths)
        //((wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p"))).size())>0)
        {
        	
        	  System.out.println("THERES CLOTHES");
        	
			//clotheList = new ArrayList<>();
			
			wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p")));
			System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p")).getText());
			int item_total = driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/*")).size();
			System.out.println(item_total);
			
			// System.out.println(
			// (driver.findElements(By.xpath("/html/body/div[1]/div[2]/p")).getText()));

		
			for (int item_num = 1; item_num <= item_total; item_num++) {
				

				String clothnamestr1 = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]//div[";

				String clothnamestr2 = "]/div[1]/h3[1]/a[1]";

				String clothtypestr1 = "/html/body/div[2]/div[2]/div[2]/div/div/div[";
				String clothtypestr2 = "]/div/span[1]/a";

				String clothprice1 = " /html/body/div[2]/div[2]/div[2]/div/div/div[";
				String clothprice2 = "]/div/span[2]/span";

				String stringclothname = new StringBuilder(clothnamestr1).append(item_num).append(clothnamestr2)
						.toString();
				//System.out.println(stringclothname);

				String stringclothtype = new StringBuilder(clothtypestr1).append(item_num).append(clothtypestr2)
						.toString();
				//System.out.println(stringclothtype);

				String clothimg = new StringBuilder("/html/body/div[2]/div[2]/div[2]/div/div/div[").append(item_num)
						.append("]/div/div[1]/div[2]/div[1]/div/div[1]/a/img").toString();

				String clothicon = new StringBuilder("/html/body/div[2]/div[2]/div[2]/div/div/div[").append(item_num)
						.append("]/div/div[1]/div[1]/span").toString();

				String stringclothprice = new StringBuilder(clothprice1).append(item_num).append(clothprice2)
						.toString();
				//System.out.println(stringclothprice);

				String stringclothpricerng = new StringBuilder(clothprice1).append(item_num).append("]/div/span[3]")
						.toString();

				String stringclothpricedisc = new StringBuilder(clothprice1).append(item_num)
						.append("]/div/span[3]/ins/span").toString();

				// WebElement clothname =
				// wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]")));
				WebElement clothname = wait2
						.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringclothname)));

				System.out.println(clothname.getText());

				WebElement clothtype = wait2
						.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringclothtype)));

				System.out.println(clothtype.getText());
				
				String pagenumbericon=new StringBuilder("//a[contains(text(),'").append(page_number)
						.append("')]").toString();

				System.out.println("page number icon: "+pagenumbericon);	

				if ((driver.findElements(By.xpath(stringclothprice)).size()) != 0)

				{
					System.out.println("normalprice");
					WebElement clothprice = wait2
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringclothprice)));

					System.out.println(clothprice.getText());
					// clotheList.add(new clotheslist(stringclothpricedisc, stringclothpricedisc,
					// stringclothpricedisc, stringclothpricedisc, stringclothpricedisc));
					
					clotheList.add(new clotheslist(clothname.getText(), clothtype.getText(), clothprice.getText(),
							clothimg, clothicon,pagenumbericon));

				} else if ((driver.findElements(By.xpath(stringclothpricedisc)).size()) != 0) {
					//System.out.println(stringclothpricedisc);
					System.out.println("discountprice");
					WebElement clothprice = wait2
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringclothpricedisc)));
					
					clotheList.add(new clotheslist(clothname.getText(), clothtype.getText(), clothprice.getText(),
							clothimg, clothicon,pagenumbericon));
					
				} else if ((driver.findElements(By.xpath(stringclothpricerng)).size()) != 0) {
					System.out.println(stringclothpricerng);
					System.out.println("pricerange");
					WebElement clothprice = wait2
							.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stringclothpricerng)));
					System.out.println(clothprice.getText());
					
					clotheList.add(new clotheslist(clothname.getText(), clothtype.getText(), clothprice.getText(),
							clothimg, clothicon,pagenumbericon));
					
					
				}
				
				
				else {
					// do nothing
				}
			}

			}
          else {
        	  System.out.println("THERES NO CLOTHES");
        	  
        	  System.out.println(  wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/p"))).getText());
        	//System.out.println(driver.findElements(By.xpath("/html/body/div[1]/div[2]/p")).getText());
          	System.out.println("exit");

  			System.exit(-1);
  			driver.close();
        	  
        	  
          }
        }
        
	

		
	public void sort(List<clotheslist> clotheList)

	{
		System.out.println("sorting price");
		Collections.sort(clotheList, Comparator.comparing(clotheslist::getclothe_price));
		//System.out.println(clotheList.size());

		
		/* for (clotheslist clothes : clotheList) 
		 { 
			// System.out.println( clothes.getclothe_name());
		  System.out.println(clothes.clothe_name);
		  System.out.println(clothes.clothe_type);
		  System.out.println(clothes.clothe_price);
		  }
		 */
	}

	public void cheapestclothe(WebDriver driver,List<clotheslist> clotheList)
{
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		System.out.println("cheap clothes");
		System.out.println(clotheList.get(0).clothe_price);
		System.out.println(clotheList.get(0).clothe_name);
		System.out.println(clotheList.get(0).clothe_img);
		String clothe_page_location=clotheList.get(0).page_number_icon;
		System.out.println("clothes_pagination_location="+clothe_page_location);
		int paginationsize=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div/nav/ul/*")).size();
		System.out.println("paginationsize: "+paginationsize);
		if (paginationsize>0)
		{
			int clothesnumbericon = driver.findElements(By.xpath(clothe_page_location)).size();
			System.out.println("clothesnumbericon size: "+clothesnumbericon);
		WebElement clothpaginationlocation = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(clothe_page_location)));
		clothpaginationlocation.click();
		WebElement clothimg = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(clotheList.get(0).clothe_img)));
		clothimg.click();
		}
		else
		{
			WebElement clothimg = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(clotheList.get(0).clothe_img)));
			clothimg.click();	
		}
	}

	public void expensiveclothe(WebDriver driver,List<clotheslist> clotheList)
	{
		/*WebDriverWait wait2 = new WebDriverWait(driver, 20);
		System.out.println("expensive clothes");
		System.out.println("clothes list size: "+(clotheList.size()));
		System.out.println(clotheList.get(clotheList.size() - 1).clothe_price);
		System.out.println(clotheList.get(clotheList.size() - 1).clothe_name);
		System.out.println(clotheList.get(clotheList.size() - 1).clothe_img);
		WebElement icon = wait2.until(
				ExpectedConditions.elementToBeClickable(By.xpath(clotheList.get(clotheList.size() - 1).clothe_img)));

		icon.click();*/
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		System.out.println("expensive clothes");
		System.out.println(clotheList.get(clotheList.size()-1).clothe_price);
		System.out.println(clotheList.get(clotheList.size()-1 ).clothe_name);
		System.out.println(clotheList.get(clotheList.size()-1).clothe_img);
		String clothe_page_location=clotheList.get(clotheList.size()).page_number_icon;
		System.out.println("clothes_pagination_location="+clothe_page_location);
		int paginationsize=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div/nav/ul/*")).size();
		System.out.println("paginationsize: "+paginationsize);
		if (paginationsize >0)
		{
			int clothesnumbericon = driver.findElements(By.xpath(clothe_page_location)).size();
			System.out.println("clothesnumbericon size: "+clothesnumbericon);
		WebElement clothpaginationlocation = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(clothe_page_location)));
		clothpaginationlocation.click();
		WebElement clothimg = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(clotheList.get(clotheList.size()-1 ).clothe_img)));
		clothimg.click();
		}
		else
		{
			WebElement clothimg = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(clotheList.get(clotheList.size()-1).clothe_img)));
			clothimg.click();	
		}
		
		
	}
	
	
	public void paginationbynext(WebDriver driver,List<clotheslist> list) {
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println("pagination");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 3);
		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p")));
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/p")).getText());
		
		//wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div[2]/div[2]/div/nav/ul")));
		int paginationsize=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[2]/div/nav/ul/*")).size();
		// int paginationsize=driver.findElements(By.xpath("//ul[@class='page-numbers']")).size();
		System.out.println(paginationsize);
	
		if (paginationsize >1)
		{
			//String paginationtext=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/nav")).getText();
	    
		    //System.out.println(paginationtext);
			
			int pag_location=1;
		    for 
		    (int pag_num = 4; pag_num <=paginationsize+2; pag_num++)
		    {	
		    	System.out.println(driver.getCurrentUrl());
		    	//WebElement pagination_icon= driver.findElement(By.xpath(new StringBuilder("/html/body/div[2]/div[2]/div[2]/div/nav/ul/li[").append(pag_num).append("]/a").toString())); 
		    	
		    	System.out.println("pag_num: "+pag_num);
		    	
		    	System.out.println((new StringBuilder("/html/body/div[2]/div[2]/div[2]/div/nav/ul/li[").append(pag_num).append("]/a/i").toString()));
		    	int nexticon=driver.findElements(By.xpath(new StringBuilder("/html/body/div[2]/div[2]/div[2]/div/nav/ul/li[").append(pag_num).append("]/a/i").toString())).size();
		    	 identifyclothes(driver, list,pag_location);
		    	
		    	 System.out.println("pag_location: "+pag_location);
		    	 pag_location++;
		    	if (nexticon>0)
		    	{
		    	   
					WebElement pagination_icon=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath(new StringBuilder("/html/body/div[2]/div[2]/div[2]/div/nav/ul/li[").append(pag_num).append("]/a/i").toString())));
		    
					
					pagination_icon.click();
		    	}
		    
		    	
		    
		    }
		    
		}
		
		
		System.out.println("list size: "+list.size());

	}
	
	public boolean isElementPresent(WebDriverWait wait2, String id, WebDriver driver) {
	    try {
	    	
	    	wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath(id)));
	        driver.findElement(By.xpath(id));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}

}
