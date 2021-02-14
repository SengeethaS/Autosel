package BaseCls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecFile1 extends BaseClass {
	public static void main(String[] args) throws InterruptedException{
		WebDriver d= ChromeBrowser();
		Browser("http://demo.automationtesting.in/Register.html");
	    MaxUrl();
	    wait(2000);
	    WebElement MH=d.findElement(By.xpath("//a[text()='WebTable']"));
	    mouseh(MH);
	}
}
