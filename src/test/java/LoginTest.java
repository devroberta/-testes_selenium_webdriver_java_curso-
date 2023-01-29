import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

  private WebDriver driver;

  @BeforeEach
  void setUp() throws Exception {
    System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my.account");
  }

  @AfterEach
  void tearDown() throws Exception {
    driver.quit();
  }

  @Test
  void test() {
    WebElement emailAddressElement = driver.findElement(By.id("email"));
    emailAddressElement.sendKeys("camilajavadev123@gmail.com");

    WebElement passordElement = driver.findElement(By.name("passwd"));
    passordElement.sendKeys("123456@Ca");

    WebElement subimitBtnElement = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
    subimitBtnElement.click();

    WebElement tagMyAccount = driver.findElement(By.tagName("h1"));
    String textTagH1 = tagMyAccount.getText();

    assertTrue(textTagH1.equals("MY ACCOUNT"));
  }
}
