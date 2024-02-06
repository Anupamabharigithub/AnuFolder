package TestNg_Ex;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Priority_invoctaion {
	
	@Test(priority='0')
	public void agoda() 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
		
		driver.quit();
		
	}
	@Test(priority='1')
	public void Redbus() 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(2000);
		driver.quit();
		
	}
	@Test(priority='2')
	public void DWS() 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://webflow.com/made-in-webflow/demo");
		//Thread.sleep(2000);
		driver.quit();
		
	}
	
	

}
