package Assignment;
//using utility class doing one script
//script is
//1.open browser
//2.maximize
//3.enter into demoweb page
//4.verify the demo web page URl
//5.click on digital link by using text xpath funtion
//6.verify title of the digital link page
//7.close the browser


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Text_function {
	static WebDriver driver;
	static String givenURL="https://demowebshop.tricentis.com/";
	static String shopingcarttitle="Demo Web Shop. Shopping Cart";
	
	public static void openFirefoxDriver()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void DMSopenpage() throws Throwable {
		driver.get("https://demowebshop.tricentis.com/");
	String	currenturl=driver.getCurrentUrl();
	if(currenturl.equals(givenURL)) {
		System.out.println("URl is maching");
		//a[text()='Register']
		
		List<WebElement> addtocart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:addtocart) {
			
			web.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			Thread.sleep(2000);
			String shopingcarttitle=driver.getTitle();
			if(shopingcarttitle.contains(shopingcarttitle)) {
				System.out.println("shopping cart title is machiing ");
			}
			else
			{
				System.out.println("shopping cart title is not machiing ");
			}
			
			
		}
	}
	else
		System.out.println("URl is not maching");
	}
	
	public static void main(String[] args) throws Throwable {
		openFirefoxDriver();
		DMSopenpage();
		closeBrowser();
	}
	
}
