package Alert_popup;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_pop_up_fileUpload {
	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/profile");
		Thread.sleep(2000);
		Actions Act=new Actions(driver);
		Act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("C:\\Users\\DELL\\Downloads\\Anupama_Resume-Testing-4-years-experience (1).docx");
		driver.close();
		
		
		
	}

}
