package actions_api;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormSubmission {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @name='name']")).sendKeys("Akshay");
		 driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @name='email']")).sendKeys("akshaygaikwad8087@gmail.com");
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("akshay123");
		 driver.findElement(By.id("exampleCheck1")).click();
		WebElement Gender= driver.findElement(By.id("exampleFormControlSelect1"));
		 
		Select select=new Select(Gender);
		select.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("25101994");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		String ActualText=driver.findElement(By.cssSelector("a[class='close']")).getText();
		System.out.println(ActualText);
		Assert.assertEquals(ActualText, "Success! The Form has been submitted successfully!.");
		
	}  
	
}
