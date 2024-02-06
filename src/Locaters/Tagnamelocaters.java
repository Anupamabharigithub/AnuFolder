package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagnamelocaters {
	static WebDriver driver;

	public static void openfirefoxdriver()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();	
	}
	public static void closebrowser()
	{
		driver.close();
	}
	public static void Tagnamelocatres() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> all_a = driver.findElements(By.tagName("a"));
		for(WebElement web:all_a)
		{
			System.out.println(web.getText());
		}
		
	}
	public static void main(String[] args) throws Throwable {
		openfirefoxdriver();
		Tagnamelocatres();
		closebrowser();

	}

}
