package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TVS_Assismnet2 {
	public static void main(String[] args) {
		String s="https://www.tvsmssotor.com/";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tvsmotor.com/");
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
