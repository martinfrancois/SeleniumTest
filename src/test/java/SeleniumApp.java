import static org.junit.Assert.assertEquals;

import java.io.File;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by François Martin on 13.12.17.
 */
public class SeleniumApp {

  @Test
  public void testSelenium() {
    // declaration and instantiation of objects/variables
    String geckoDriverPath = new File("").getAbsolutePath() + "/geckodriver";
    System.out.println(geckoDriverPath);
    System.setProperty("webdriver.gecko.driver", geckoDriverPath);
    WebDriver driver = new FirefoxDriver();
    //comment the above 2 lines and uncomment below 2 lines to use Chrome
    //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
    //WebDriver driver = new ChromeDriver();

    String baseUrl = "http://demo.guru99.com/selenium/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = "";

    // launch Fire fox and direct it to the Base URL
    driver.get(baseUrl);

    // get the actual value of the title
    actualTitle = driver.getTitle();

    //close Fire fox
    driver.close();

    /*
     * compare the actual title of the page with the expected one and print
     * the result as "Passed" or "Failed"
     */
    assertEquals(expectedTitle, actualTitle);
  }
}
