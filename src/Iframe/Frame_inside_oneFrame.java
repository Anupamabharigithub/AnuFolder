package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame_inside_oneFrame {
	public static void main(String[] args) {
		FirefoxOptions F_options=new FirefoxOptions();
		//
		F_options.addArguments("--disable-notifications");
		//open the browser
		FirefoxDriver driver=new FirefoxDriver(F_options);
		//maximize
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
		//enter into the browser
		driver.get("https://www.dream11.com/");
	//driver swich to frame
	//one way using index	:-driver.switchTo().frame(0);
		//uding id and class neme:- driver.switchTo().frame("send-sms-iframe");
		WebElement webelemet_1 = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		driver.switchTo().frame(webelemet_1);
		driver.findElement(By.id("regEmail")).sendKeys("09328409380");
		//swich the cintroler to the parant page
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hamburger")));
		driver.findElement(By.id("hamburger")).click();
		
		
		driver.close();
		
		
	}

}
