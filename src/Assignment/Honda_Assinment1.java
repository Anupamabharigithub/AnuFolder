package Assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Honda_Assinment1 {
	public static void main(String[] args) {
		//FirefoxDriver driver=new FirefoxDriver();
		//Get the URL of The Current Webpage.
		String s="https://www.honda2wheelersindia.com/";
		//open the Browser	
		WebDriver driver=new FirefoxDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Enter into the Particular Webpage
		driver.get("https://www.honda2wheelersindia.com/");
		//store the webpage URL in String Containner(Given URL)
		String s1=driver.getCurrentUrl();
		//Verify the (Given URL) with (Current URL) by if & else condition and Provide some Statement inside that Conditions.
		if(s.equals(s1))
		{
			System.out.println("HONDA URL is maching happy!!!!!!!!!");
		}
			 else
		{
			System.out.println("HONDA URL is not  maching"); 
		}
		 //Close the Browser.
		 driver.close();	
	}

}
