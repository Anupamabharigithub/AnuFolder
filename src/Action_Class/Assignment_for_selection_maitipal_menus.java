package Action_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_for_selection_maitipal_menus {
	public static void main(String[] args) {
		String giver_URl="https://www.ajio.com/";
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.ajio.com/");
		  String Curent_URL = driver.getCurrentUrl();
		  if(giver_URl.equals(Curent_URL))
		  {
			  System.out.println("Ajio URL is maching welcome!!!!!!!!!");
			  ////ul[@class='level-first false']/li
			  WebElement Search_bar = driver.findElement(By.xpath("//ul[@class='level-first false']/li"));
			  if(Search_bar.isEnabled())
			  {
				  System.out.println("Seach bar is present"); 
				  Actions A=new Actions(driver);
				  A.moveToElement(Search_bar).click().sendKeys("Kurtas").build().perform();
				  ////input[@placeholder='Search AJIO']
				  List<WebElement> Elements = driver.findElements(By.xpath("//ul[@class='level-first false']/li"));
				  for(WebElement web:Elements)
				  {
					  A.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
					  driver.close();
					  
				  }
				  
				  driver.close();
				  
			  }
			  else
			  {
				  System.out.println("Seach bar is not  present"); 
			  }
		  }
		  
		  else
		  {
			  System.out.println("Ajio URL not  maching Sorry");
		  }
		
	}

}
