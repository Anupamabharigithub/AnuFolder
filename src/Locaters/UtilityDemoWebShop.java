package Locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityDemoWebShop {
	public static WebDriver driver=null;
	public static void ChromeBrowser() {
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void FireFoxBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	public static void closeBrowser() {
		driver.close();
	}
    public static void openDWS()
    {
    	ChromeBrowser();
    	closeBrowser();
	
	}
	public static void main(String[] args) 
	{
		FireFoxBrowser();
		closeBrowser();
		
	}

}
