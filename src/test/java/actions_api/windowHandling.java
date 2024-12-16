package actions_api;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> Iterator = allwindows.iterator();
		String window1 = Iterator.next();
		System.out.println(window1);

		driver.switchTo().window(window1);

		
		System.out.println(driver.findElement(By.cssSelector("div h3")).getText());
		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
