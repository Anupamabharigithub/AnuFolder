package TestNGBatchtesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Bata {
	
	
		@Test(groups="smoke")
		public void bata() {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.bata.com/");
			//Thread.sleep(2000);
			driver.quit();
			
		
		}

}
