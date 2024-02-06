package Locaters;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityforDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		String GivenURL="https://demowebshop.tricentis.com/";
		String Give_digitaltitle="Demo Web Shop. Digital downloads";
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String Curentrl=driver.getCurrentUrl();
		//verify the URL
		if(Curentrl.equals(GivenURL)) {
			System.out.println("URl is maching!!!");
			driver.findElement(By.partialLinkText("Digital download")).click();
			Thread.sleep(2000);
			if(Give_digitaltitle.contains(driver.getTitle())) {
				System.out.println("Digitaldownload title is maching!!!");
				List<WebElement> digitaldownload=driver.findElements(By.cssSelector("input[value='Add to cart']"));
			for(WebElement web:digitaldownload) {
				web.click();
				Thread.sleep(2000);
			}
				driver.findElement(By.partialLinkText("Shopping cart")).click();
				//page title of shoping cart
				WebElement shpingcartpage=driver.findElement(By.cssSelector("div[class='page-title']"));
				if(shpingcartpage.isDisplayed()) {
					System.out.println("You are in shopping cart page ");
					List<WebElement> clickcheckbox=driver.findElements(By.cssSelector("input[name='removefromcart']"));
					for(WebElement web1:clickcheckbox) 
					{
						web1.click();
					Thread.sleep(2000);
					
				}
					driver.findElement(By.cssSelector("input[name='updatecart']")).click();
					driver.close();
					
				}
			
				else
					System.out.println("You are not in shopping cart page");	
			}	
		}
		else
			System.out.println("URL is not maching!!!!");
	}

}
