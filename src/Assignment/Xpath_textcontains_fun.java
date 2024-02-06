package Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_textcontains_fun {
	static WebDriver driver;
	static String curentURL="https://demowebshop.tricentis.com/";
	static String degitaldownloadtitle="Demo Web Shop. Digital downloads";
	static String shopingcarttitle ="Demo Web Shop. Shopping Cart";
	
	public static void openfirefoxdriver()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();	
	}
	public static void closebrowser()
	{
		driver.close();
	}
	public static void demoshop() throws Throwable
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')] )[1]")).click();
		String digitaldownloadtitle=driver.getTitle();
		if(degitaldownloadtitle.equals(digitaldownloadtitle)) {
			System.out.println("title is maching");
		Thread.sleep(1000);
		List<WebElement> addtocart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:addtocart) {
			web.click();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String shopingcarttitle=driver.getTitle();
		if(shopingcarttitle.contains(shopingcarttitle)) {
			System.out.println("shopingcarttitle title is  maching ");
	List <WebElement>	removecheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement web:removecheckbox) {
		web.click();
		Thread.sleep(1000);
	}
	driver.findElement(By.xpath("(//input[@value='Update shopping cart'])[1]")).click();	
		}
		else
			System.out.println("title is not maching ");
		}

		else
			System.out.println("title is not maching ");
	}

	public static void main(String[] args) throws Throwable {
		openfirefoxdriver();
		demoshop();
		closebrowser();
	
	}

}
