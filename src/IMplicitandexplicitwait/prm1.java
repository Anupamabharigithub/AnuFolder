package IMplicitandexplicitwait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prm1 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		//explicit wait condition
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
		//click on login button
		WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		login.click();
		//click on create account 
		WebElement create_account=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
		create_account.click();
		driver.close();
	}

}
