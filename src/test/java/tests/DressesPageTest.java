package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DressesPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DressesPageTest {

  private DressesPage dressesPage;
  private final String URL = "http://automationpractice.com/index.pho";

  @BeforeEach
  void setUp() throws Exception {
    dressesPage = new DressesPage();
    dressesPage.visit("http://automationpractice.com/index.pho");
  }

  @AfterEach
  void tearDown() throws Exception {
    this.dressesPage.quitWebDriver();
  }

  @Test
  void test() {
    //when
    this.dressesPage.viewCasualDressesPage();

    //then
    assertEquals("CASUAL DRESSES ", this.dressesPage.getTitlePage());
    assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
  }
}
