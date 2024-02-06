package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Locater_assignment {
	public static void main(String[] args) throws InterruptedException {
		String currenturl="https://demowebshop.tricentis.com/";
		String logintitle="Demo Web Shop. Login";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//verify the curent url
		String s2=driver.getCurrentUrl();
		if(currenturl.equals(s2)) {
			System.out.println("URl is maching");
			//click on the login button
			driver.findElement(By.linkText("Log in")).click();
			//verify a login by using a title
			String curenttitle=driver.getTitle();
			//verify the current url
			if(curenttitle.equals(curenttitle))
			{
				System.out.println("title is maching");
				//fill up the login by using login by using CSS locater
				driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("Anupamabhari33@gmail.com");
				Thread.sleep(3000);
				
				//password text filed
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Anupama");
				Thread.sleep(3000);
				//clcik on login input[class='button-1 login-button']
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				System.out.println("clcik fun working fine");
				driver.close();
				}
		}else
			
			System.out.println("title is not maching");
		
	}

}
