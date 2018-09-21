package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(name="username")
private WebElement userNameTextBox;

@FindBy(name="pwd")
private WebElement passWordTextBox;

@FindBy(id="loginButton")
private WebElement LoginButton;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void login()
{
	userNameTextBox.sendKeys("admin");
	passWordTextBox.sendKeys("manager");
	LoginButton.click();
}


}
