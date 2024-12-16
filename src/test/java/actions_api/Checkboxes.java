package actions_api;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 System.out.println("Checkbox1 is not selected"+driver.findElement(By.id("checkBoxOption1")).isSelected());
		 driver.findElement(By.id("checkBoxOption1")).click();
		 Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
         System.out.println("Now Checkbox1 is selected"+driver.findElement(By.id("checkBoxOption1")).isSelected());
         driver.findElement(By.id("checkBoxOption1")).click();
         Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
         System.out.println("Checkbox1 is deselected"+driver.findElement(By.id("checkBoxOption1")).isSelected());
         
         //count no of checkbox in webpage checkbox-example
         System.out.println("Count of checkboxes"+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
