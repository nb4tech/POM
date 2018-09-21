package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.LoginPage;

public class Login {
	WebDriver driver;
	
@BeforeMethod
public void preCondition()
{
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://desktop-rnpcvaj:8080/login.do");
}

@AfterMethod
public void postCondition()
{
	driver.close();
}

@Test
public void log()
{
	LoginPage lpage=new LoginPage(driver);
	lpage.login();
}
}

