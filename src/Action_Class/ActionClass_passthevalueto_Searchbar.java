package Action_Class;

//scrit for using ACtion class how to send a keys

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_passthevalueto_Searchbar {

	public static void main(String[] args) {
		
		String given_URl="https://demowebshop.tricentis.com/";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String curent_url = driver.getCurrentUrl();
		if(given_URl.equals(curent_url)) {
			System.out.println("Your are in DWS page");
			WebElement searchbar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
			Actions A=new Actions(driver);
	
			if(searchbar.isEnabled())
			{
				System.out.println("Search bar is enabled");
				//send a values using action class method
				A.moveToElement(searchbar).click().sendKeys("hello hi").build().perform();
				//click on search bar
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println("scrpt is succussfull");
			}
			else
				
			{
				System.out.println("scrpt is not succussfull");
			}
		}
		
			else
			{
				System.out.println("Your are not in DWS page");
			}
	}

}
