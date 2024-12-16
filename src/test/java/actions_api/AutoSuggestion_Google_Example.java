package actions_api;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Google_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("aksh");
		 
		List<WebElement> Options= driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div/div"));
		
		for( WebElement option:Options)
		{
			if(option.getText().equalsIgnoreCase("akshay kumar new movie")) {
				option.click();
				break;
			}
		}
		 
	}
	

}
