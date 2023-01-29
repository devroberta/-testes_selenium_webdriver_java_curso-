package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegisterPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RegisterPageTest {

  private RegisterPage registerPage;
  private final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my.account";

  @BeforeEach
  void setUp() throws Exception {
    this.registerPage = new RegisterPage();
    this.registerPage.visit(this.URL);
  }

  @AfterEach
  void tearDown() {
    this.registerPage.quitWebDriver();
  }

  @Test
  void test() {
    this.registerPage.insertEMailToRegister();
    String expect = "camila001@email.com";
    String actual = this.registerPage.getEmailNewAccount();
    assertEquals(expect, actual);
  }

  @Test
  void test2() {
    this.registerPage.fillOutForm();
    String expect = "Welcome to your account. Here you can manage all of your personal information and orders.";
    String actual = this.registerPage.getWelcomeMessage();
    assertEquals(expect, actual);
    assertFalse(this.URL.equals(this.registerPage.getCurrentUrl()));
  }
}
