package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {

  private LoginPage loginPage;
  private final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my.account";

  @BeforeEach
  void setUp() throws Exception {
    this.loginPage = new LoginPage();
    this.loginPage.visit(this.URL);
  }

  @AfterEach
  void tearDown() throws Exception {
    this.loginPage.quitWebDriver();
  }

  @Test
  void test() {
    this.loginPage.signin();
    assertTrue(this.loginPage.getMyAccountMessage().equals("MY ACCOUNT"));
    assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
  }
}
