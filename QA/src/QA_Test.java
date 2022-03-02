import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QA_Test {
	
WebDriver driver; 
	
	@BeforeMethod 
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver","E:\\Application\\QA\\driver\\gecko\\geckodriver.exe");
	    driver = new FirefoxDriver(); //created web driver object	
    //System.setProperty("webdriver.chrome.driver","E:\\Application\\QA\\driver\\Chrome driver\\chromedriver.exe");
    //driver = new ChromeDriver();
	
	}
	
	@Test
	public void Test() throws InterruptedException {
		driver.get("https://odel.lk/home");//set URL
		driver.manage().window().maximize(); //maximize screen
		driver.manage().deleteAllCookies(); // Delete cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//page load time
		
		//clicks on the “WOMEN” menu item at the top 
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/nav/div[4]/div[1]/div[1]/a")).click();
		Thread.sleep(500);
		
		//Clicks on “Casualwear” category
		driver.findElement(By.xpath("//*[@id=\"category-drop-777\"]")).click();
		
		Thread.sleep(200);
		//Clicks on “Dresses” 
		driver.findElement(By.xpath("//*[@id=\"category-collapse-777\"]/div/a[5]")).click();
		Thread.sleep(100);
		//Clicks “Brands” dropdown
		driver.findElement(By.xpath("//*[@id=\"brand_filter_button\"]")).click();
		Thread.sleep(100);
		//Select “ODEL” brand
		driver.findElement(By.xpath("//*[@id=\"brand_filters\"]/div/div[3]/div[1]/div")).click();
		Thread.sleep(1000);
		
		//selects 3 items with different sizes into the cart using ‘Add to cart” option for each item
		//item 1
		driver.findElement(By.xpath("//*[@id=\"search_result\"]/div[2]/div/div[2]/div[1]")).click();
		Thread.sleep(100);
		
		
		//item size
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div/div[6]/form/div[1]/div[2]/div[2]/div/div/span/span[1]/span")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[4]")).click();
		//Thread.sleep(100);
		
		//select colour
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div/div[6]/form/div[1]/div[2]/div[3]/div/div/span/span[1]/span")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		//Thread.sleep(100);
		//Add to cart
		driver.findElement(By.id("product_add_to_cart")).click();
		Thread.sleep(100);
		
		//navigate back
		 driver.navigate().back();
		// Thread.sleep(100);
		 
		//item 2
		driver.findElement(By.xpath("//*[@id=\"search_result\"]/div[1]/div/div[2]/div[1]/a")).click();
		Thread.sleep(100);
		
		//select colour
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div/div[6]/form/div[1]/div[2]/div[2]/div/div/span/span[1]/span")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		//Thread.sleep(100);
				
		//item size
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div/div[6]/form/div[1]/div[2]/div[3]/div/div/span/span[1]/span")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		//Thread.sleep(100);
		driver.findElement(By.id("product_add_to_cart")).click();
		Thread.sleep(100);
		
		//navigate back
		 driver.navigate().back();
		 //Thread.sleep(100);
		
		 
		//item 3
		driver.findElement(By.xpath("//*[@id=\"search_result\"]/div[11]/div/div[2]/div[1]/a")).click();
		Thread.sleep(100);
		
		//select colour
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div/div[6]/form/div[1]/div[2]/div[2]/div/div/span/span[1]/span")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		//Thread.sleep(100);
				
		//item size
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div/div[6]/form/div[1]/div[2]/div[3]/div/div/span/span[1]/span")).click();
		//Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[5]")).click();
		//Thread.sleep(100);
		driver.findElement(By.id("product_add_to_cart")).click();
		Thread.sleep(100);
			
			
		WebElement text=driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/nav/div[2]/a[1]/div/div/span"));	
		int Count= Integer.parseInt(text.getText());
		System.out.println("Item Count in the Cart is "+Count);
		if(Count==3) {
			System.out.println(" Test pass:- There is 3 items in the Cart ");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/nav/div[2]/a[1]/i")).click();
			WebElement firstitem=driver.findElement(By.xpath("//*[@id=\"product_discounted_price_3988313\"]"));
			float item_1=Float.parseFloat(firstitem.getText());
			WebElement seconditem=driver.findElement(By.xpath("//*[@id=\"product_discounted_price_3988337\"]"));
			float item_2=Float.parseFloat(seconditem.getText());
			WebElement thirditem=driver.findElement(By.xpath("//*[@id=\"product_discounted_price_3988340\"]"));
			float item_3=Float.parseFloat(thirditem.getText());
			WebElement total=driver.findElement(By.xpath("//*[@id=\"dynamic_cart\"]/div[2]/div[3]/div/div[1]"));
			float item_total=Float.parseFloat(total.getText());
			
			float actual_total=item_1+item_2+item_3;
			
			System.out.println("Actual Total "+actual_total);
			System.out.println("Expected Total "+item_total);
			if(actual_total==item_total)
			{
				System.out.println(" Test pass:- Total is Correct ");	
			}
			else
			{
				System.out.println(" Test fail:- Total is Inorrect ");	
			}
		}
		else if(Count==0)
		{
			System.out.println(" Test fail :- There isn't any item in the Cart ");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/nav/div[2]/a[1]/i")).click();
		}
		else
		{
			System.out.println("Test fail :- less than 3 items");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/nav/div[2]/a[1]/i")).click();
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
		
}
