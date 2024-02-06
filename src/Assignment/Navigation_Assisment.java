package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_Assisment {

	public static void main(String[] args) throws Throwable {
		String s="https://webflow.com/made-in-webflow/demo";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://webflow.com/made-in-webflow/demo");
		Thread.sleep(2000);
		driver.get("https://www.tvsmssotor.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String s1=driver.getCurrentUrl();
		if(s.equals(s1)) {
			System.out.println("TVS URL IS MACHING !!!!!!!!!!!!");
		}
		else
		{
			System.out.println("TVS URL IS NOT  MACHING !!!!!!!!!!!!");
		}
		driver.close();
		

	}

}
