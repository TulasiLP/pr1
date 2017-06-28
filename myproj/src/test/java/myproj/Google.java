package myproj;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google 
{
  @Test
  public void login()
  {
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
  }
}
