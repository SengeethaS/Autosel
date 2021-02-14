package BaseCls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteBaseClass {
	public static WebDriver driver;
	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Projects\\BaseClassPrgs\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;	
	}
	public static void website(String url) {
	driver.get(url);
	}
	public static void max() {
		driver.manage().window().maximize();		
	}
	public static void sleep(int s) throws InterruptedException {
		Thread.sleep(s);
	}
	public static void bClik(WebElement btn) {
		btn.click();
	}
	public static void tData(WebElement ref, String dt) {
		ref.sendKeys(dt);
	}
	public static void dDown(WebElement w, String d) {
		
		Select s=new Select(w);
		s.selectByValue(d);
	}
	public static void bQuit() {
		driver.quit();
	}
	public static void clr(WebElement c) {
		c.clear();

	}
	

}
