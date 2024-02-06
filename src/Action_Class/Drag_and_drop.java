package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	 WebElement Source = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	  WebElement target = driver.findElement(By.xpath("(//div[text()='Italy'])"));
	 Actions A=new Actions(driver);
	 A.dragAndDrop(Source, target).build().perform();
	 driver.close();
}
}
