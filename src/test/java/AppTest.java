import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

  private WebDriver driver;
  @Test
  public void helloSelenium() {
    //https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
    System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com/index.php");

    String currentUrl = driver.getCurrentUrl();
    String expect = "http://automationpractice.com/index.php";

    assertEquals(expect, currentUrl);

    driver.quit();
  }

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }
}
