package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_Action {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://demowebshop.tricentis.com/");
	WebElement PLaceover = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
	Actions A=new Actions(driver);
	A.moveToElement(PLaceover).build().perform();
	driver.close();

		
	}

}
