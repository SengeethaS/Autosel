package NGFramework;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngFramework {
public static WebDriver d=new ChromeDriver();
@BeforeClass
private void LaunchBrowser() 
{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\BaseClassPrgs\\driver\\chromedriver.exe");
		System.out.println("START OF THE PROGRAM");
		d.get("http://adactinhotelapp.com/");
		d.manage().window().maximize();
}
@AfterClass
private void Closebrowser() 
{
	d.quit();
}
@Test
private void tc2()
{
	WebElement Uname= d.findElement(By.id("username"));
	Uname.sendKeys("Sengeetha");
	WebElement pword=d.findElement(By.id("password"));
	pword.sendKeys("1234");
	WebElement lbtn=d.findElement(By.id("login"));
	lbtn.click();
}
@BeforeMethod
private void stTime() {
	Date dt=new Date();
	System.out.println("<<Execution started>>" +dt);	
}

@AfterMethod
private void EndTime() {
	Date edt=new Date();
	System.out.println("<<Execution Ended>>" +edt);	

}
	
}
