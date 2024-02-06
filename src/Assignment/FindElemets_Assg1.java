package Assignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElemets_Assg1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	WebElement welcomestore=driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
	if(welcomestore.isDisplayed()) {
		System.out.println("You are in Home page ");
		//click on digital 
		driver.findElement(By.partialLinkText("Digital")).click();
		//verify the digital downloads page 
		WebElement Digitaldownloadsver=driver.findElement(By.linkText("Digital downloads"));
		if(Digitaldownloadsver.isDisplayed()) {
			System.out.println("You are in digital download page");
			List<WebElement> addtocart=driver.findElements(By.cssSelector("input[value='Add to cart']"));
			for( WebElement web:addtocart) {
				web.click();
				Thread.sleep(2000);
				System.out.println("Added in cart");
			}
			//welcome to shopping cart page
			driver.findElement(By.cssSelector("span[class='cart-label']")).click();
		WebElement Shoppingcart=driver.findElement(By.linkText("Shopping cart"));
		//verify the shopping cart page
		if(Shoppingcart.isDisplayed()) {
			System.out.println("Welcome to shopping cart page!!!!!!!");
			List<WebElement> clickcheckbox=driver.findElements(By.cssSelector("input[name='removefromcart']"));
			for(WebElement web1:clickcheckbox) 
			{
				web1.click();
		}
			driver.findElement(By.cssSelector("input[name='updatecart']")).click();
			driver.close();
		}
		else
			System.out.println("Welcome to shopping cart page!!!!!!!");
		}
		else
			System.out.println("You are not in digital download page");
	}
	else
		System.out.println("You are not in Home page");
	driver.close();
	}
}
