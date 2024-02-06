package TestNg_Ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//Here if @test(testng)is preset it is always asking for selecting the testng for running the scripts and run the only one script as rayal and fied
//if selrcting only the java APplication only  demowebshop will excecueted 


public class Test_NG_And_mainmethod {
	
		public static void main(String[] args) throws Throwable {
			//String s="https://webflow.com/made-in-webflow/demo";
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
}
		@Test
		public void RoleyAndfield() throws Throwable {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
		    Thread.sleep(2000);
			driver.get("https://www.bikewale.com/royalenfield-bikes/");
			Thread.sleep(2000);
			
		}
}