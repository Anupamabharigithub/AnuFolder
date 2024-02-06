package Alert_popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	//click on seach button
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	a.accept();
	//driver.findElement(By.linkText("")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	}

}
