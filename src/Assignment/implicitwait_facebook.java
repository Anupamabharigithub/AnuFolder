package Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitwait_facebook {
	

	public static void main(String[] args) throws Throwable {
		//String s="https://webflow.com/made-in-webflow/demo";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		//click on the create new button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//enter the text in email id field
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anupama");
		//enter the last name 
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bhari");
		Thread.sleep(5000);
		
		//click on close
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		
		WebElement verifycontent = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if (verifycontent.isDisplayed()) {
			System.out.println("you are in create new Account page ");
			driver.close();
			
			
		}else
			
			System.out.println("you are not in create new Account page ");
		
				
	}
}


