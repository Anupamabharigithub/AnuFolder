package Action_Class;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_up_and_page_down {
	
	public static void main(String[] args) throws Throwable {
		
		String given_URl="https://demowebshop.tricentis.com/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions A=new Actions(driver);
		//for page down
		A.keyDown(Keys.PAGE_DOWN).build().perform();
		A.keyUp(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		
		A.keyDown(Keys.PAGE_UP).build().perform();
		A.keyUp(Keys.PAGE_UP).build().perform();
		
		//buid:-some of the Action not able to perform
		//perfom()-tell the compile for to perform
		
	}
	
}
