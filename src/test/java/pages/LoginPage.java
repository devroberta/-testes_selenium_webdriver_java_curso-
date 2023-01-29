package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

  private By emailAddressLocator = By.id("email");
  private By passwordLocator = By.name("passwd");
  private By submitBtnLocator = By.xpath("//*[@id=\"SubmitLogin\"]");
  private By tagByAccountLocator = By.xpath("h1");


  public void signin() {
    if (super.isDisplayed(emailAddressLocator)) {
      super.type("camilajavadev123@gmail.com", emailAddressLocator);
      super.type("123456@Ca", passwordLocator);
      super.click(submitBtnLocator);
    } else {
      System.out.println("Email textbox was not present");
    }
  }

  public String getMyAccountMessage() {
    return super.getText(tagByAccountLocator);
  }
}
