package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locaters_name {
	
	public static void main(String[] args) throws Throwable {
		//String s="https://webflow.com/made-in-webflow/demo";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mobile");
		System.out.println("working");
		driver.close();
		
	}

}
