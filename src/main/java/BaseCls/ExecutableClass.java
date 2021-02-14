package BaseCls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutableClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException{
		WebDriver d= ChromeBrowser();
	    Browser("https://www.facebook.com/");
	    MaxUrl();
	    wait(2000);
	    Title();
	    CurrURL();
	    WebElement UserId=d.findElement(By.id("email"));
	    SendValue(UserId, "TestUser");
	    WebElement pwd=d.findElement(By.id("pass"));
	    SendValue(pwd, "password1");
	    WebElement btn=d.findElement(By.id("u_0_b"));
	    clik(btn);
	    WebElement Msg=d.findElement(By.xpath("//div[contains(text(),'The password')]"));
	    Txt(Msg);
	    Wclose();
	    
	    
	   	}

}
