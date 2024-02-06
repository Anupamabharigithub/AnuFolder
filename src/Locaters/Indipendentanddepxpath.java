package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Indipendentanddepxpath {
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
	public static void demoshop() throws Throwable
	{
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')] )[1]")).click();
		Thread.sleep(1000);
		WebElement web = driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../../..//span[@class='price actual-price']"));
		System.out.println(web.getText());
		WebElement web1 = driver.findElement(By.xpath("((//a[contains(text(),'Music 2')])/../../..//span[@class='price actual-price'])[1]"));
		System.out.println(web1.getText());
		WebElement web2=driver.findElement(By.xpath("((//a[contains(text(),'Music 2')])/../../..//span[@class='price actual-price'])[2]"));
		System.out.println(web2.getText());
	}
	public static void main(String[] args) throws Throwable {
		openfirefoxdriver();
		demoshop();
		closebrowser();

	}

}
