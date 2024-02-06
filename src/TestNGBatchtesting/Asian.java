package TestNGBatchtesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Asian {
@Test(groups="smoke")
public void asian() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.asianfootwears.com/");
	//Thread.sleep(2000);
	driver.quit();
	
}
}
