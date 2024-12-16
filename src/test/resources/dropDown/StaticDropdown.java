import org.openqa.selenium.WebDriver;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\eclipse-workspace\\OrangeHRM\\Common\\Drivers\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
 
 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}

}
