package actions_api;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.manage().window().maximize();
		WebElement currency= driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		
		currency.click();
		 
		 Select s= new Select(currency);
		s.selectByIndex(2);//aed
		
	System.out.println(s.getFirstSelectedOption());
		 s.selectByValue("USD");
		 System.out.println(s.getFirstSelectedOption());
		 s.selectByVisibleText("INR");
		 System.out.println(s.getFirstSelectedOption());
		 
		// driver.close();
	}

}
