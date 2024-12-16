package actions_api;

import org.testng.annotations.BeforeTest;

public class BaseChromeTest extends BaseTest {

	  @BeforeTest
	  public void setup() {
	    startChromeDriver();
	  }
	}

