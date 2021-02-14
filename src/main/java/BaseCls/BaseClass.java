package BaseCls;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Desktop.Action;
public class BaseClass {
		//private static final int OutputType = 0;
		//private static final int FILE = 0;
		public static WebDriver  driver;
		public static Actions  a;
		public static WebDriver ChromeBrowser() {
		System.setProperty("Webdriver.chrome.driver", "E:\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		}
public static void Browser(String url) {
driver.get(url);
}
public static void MaxUrl() {
driver.manage().window().maximize();
}
public static void Title() {	
String Tit=driver.getTitle();
System.out.println(Tit);
}
public static void CurrURL() {
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
public static void wait(int t) throws InterruptedException {
Thread.sleep(t);
}
public static void SendValue(WebElement ref,String Val) {
ref.sendKeys(Val);
}
public static void clik(WebElement ref1) {
	ref1.click();
}
public static void Txt(WebElement ref2) {
String Txt=ref2.getText();
System.out.println(Txt);
}
public static void GetAtri(WebElement ref5) {
String Atri=ref5.getAttribute("data");
System.out.println(Atri);
}
public static void screenshot() {
TakesScreenshot sc=(TakesScreenshot) driver;
//File src=sc.getScreenshotAs(OutputType.File);
}
public static void Wclose() {
driver.close();
}
public static void Bquit() {
driver.quit();
}
public static void Dclick(WebElement btn) {
	a=new Actions(driver);
	a.doubleClick(btn).perform();
}
public static void mouseh(WebElement ref3) {
a=new Actions(driver);
a.moveToElement(ref3).perform();
}
public static void Rclick(WebElement ref4) {
a=new Actions(driver);
a.contextClick(ref4).perform();
}
public static void DrgDrp(WebElement src, WebElement Des) {
	a=new Actions(driver);
	a.dragAndDrop(src,Des).perform();
}

}
