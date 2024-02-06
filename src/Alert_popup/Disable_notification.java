package Alert_popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Disable_notification {
	public static void main(String[] args) {
		FirefoxOptions F_options=new FirefoxOptions();
		F_options.addArguments("--disable-notifications");		//open the broweser
		WebDriver driver=new FirefoxDriver(F_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
		
	}

}
