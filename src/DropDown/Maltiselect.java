package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Maltiselect {

	public class SelectDropDownMenu {
		static WebDriver driver;
		
		public static void openEdgeBrowser() {
			driver=new FirefoxDriver();
			
		}
		public static void closebrowser() {
			driver.close();
		}
		public static void dropdownmenu() throws Throwable {
			
			driver.get("file:///C:/Users/DELL/Downloads/demo-1.html");
			driver.manage().window().maximize();
			WebElement Malti_select = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
			Select s_ref=new Select(Malti_select);
			s_ref.selectByVisibleText("Audi");
			Thread.sleep(2000);
			s_ref.selectByValue("bmw");
			Thread.sleep(2000);
			s_ref.selectByIndex(6);
			Thread.sleep(2000);
		}

		public static void main(String[] args) throws Throwable {
			openEdgeBrowser();
			dropdownmenu();
			closebrowser();
			
			

		}

	}


}
