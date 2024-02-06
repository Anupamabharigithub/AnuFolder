package Alert_popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.automationtesting.in/Alerts.html ");
	//click on seach button
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	a.dismiss();
	
}
}
