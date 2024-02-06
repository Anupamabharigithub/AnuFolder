package JavaSciptExicuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disable_click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement download_link = driver.findElement(By.linkText("jdk-11.0.21_linux-aarch64_bin"));
		download_link.click();
		Thread.sleep(1000);
		js.executeScript("arguments[2].scrollIntoView(true);", download_link);
		WebElement Disable_button=driver.findElement(By.linkText(""))
		
	}

}
