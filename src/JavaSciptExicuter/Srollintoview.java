package JavaSciptExicuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Srollintoview {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		//driver.get("https://www.skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://demowebshop.tricentis.com/");
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		js.executeScript("arguments[2].scrollIntoView(true);", facebook);
		Thread.sleep(2000);
		driver.close();
		
	}

}
