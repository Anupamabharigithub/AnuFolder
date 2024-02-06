package Alert_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Red_Bus_Popup {
	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions F_options=new FirefoxOptions();
		F_options.addArguments("--disable-notifications");
		//open the browser
		FirefoxDriver driver=new FirefoxDriver(F_options);
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
		//enter into the browser
		driver.get("https://www.redbus.in/");
		Actions Act=new Actions(driver);
		driver.findElement(By.id("src")).sendKeys("bangalore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bengaluru']")));
		Act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.id("dest")).sendKeys("chennai");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("ExpectedConditions")));
		Act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("ExpectedConditions")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
			
	}

}
