package actions_api;


import java.io.File;
import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseChromeTest {

  @Test
  public void fileUploadTest() {
    driver.get("https://the-internet.herokuapp.com/upload");
    File uploadFile = new File("C:/Users/Akshay/Downloads/selenium-snapshot.png");

    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
    fileInput.sendKeys(uploadFile.getAbsolutePath());
    driver.findElement(By.id("file-submit")).click();

    WebElement fileName = driver.findElement(By.id("uploaded-files"));
    Assertions.assertEquals("selenium-snapshot.png", fileName.getText());
  }
}
