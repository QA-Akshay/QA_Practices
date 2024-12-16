package actions_api;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("hrefIncAdt")).click();
		 try{
			 int i=1;
		 
		 while (i<9) {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 i++;
		 }
		 }
		 finally
		 {
			 Alert alert=driver.switchTo().alert();
			 String alertMessage=alert.getText();
			 System.out.println(alertMessage);
			 alert.accept();
		 }
 
	}

}
