package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement double_Click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions A=new Actions(driver);
	A.doubleClick(double_Click).build().perform();
	try {
		double_Click.isEnabled();
		System.out.println("My Script is successfully ");
		
	} catch (Exception e) {
		System.out.println("My Script is unsuccessfully ");
	}
	driver.close();
}
}
