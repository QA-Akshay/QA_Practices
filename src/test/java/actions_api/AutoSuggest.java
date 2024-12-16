package actions_api;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("autosuggest")).sendKeys("au");
		 
		List<WebElement> Options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for( WebElement option:Options)
		{
			if(option.getText().equalsIgnoreCase("Guinea-Bissau")) {
				option.click();
				break;
			}
		}
		 
	}

}
