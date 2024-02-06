package Action_Class;

import java.time.Duration;
//import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Maltipal_page_up {

	public static void main(String[] args) throws Throwable {
			String given_URl="https://demowebshop.tricentis.com/";
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			Actions A=new Actions(driver);
		    List<WebElement> Allelement = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
		    for(WebElement web:Allelement) {
			A.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
			Thread.sleep(2000);
		}
		driver.close();
	}

}
