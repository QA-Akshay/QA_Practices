package actions_api;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Pune")).click();
		 driver.findElement(By.xpath("//a[@value=\"JAI\"]")).click();
		 
	}

}
