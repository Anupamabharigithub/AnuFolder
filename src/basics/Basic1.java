package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic1 {

	public static void main(String[] args) throws InterruptedException {
		
		String s="https://www.facebook.com/";
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String s1= driver.getCurrentUrl();
		//check the URL is maching are not 
		if(s.equals(s1)) {
			System.out.println("URl is same");
		}
		else
			System.out.println("URL is not same");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
			

	}

}
