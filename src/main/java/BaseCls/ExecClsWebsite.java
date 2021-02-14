package BaseCls;

//import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecClsWebsite extends WebsiteBaseClass{
public static void main(String[] args) throws InterruptedException {
WebDriver d= chromeBrowser();
website("http://adactinhotelapp.com/");
max();
sleep(1000);
WebElement Uname= driver.findElement(By.id("username"));
tData(Uname, "sengeethas");
WebElement pword=driver.findElement(By.id("password"));
tData(pword,"password");
WebElement lbtn=driver.findElement(By.id("login"));
bClik(lbtn);
sleep(1000);
WebElement loc=driver.findElement(By.id("location"));
dDown(loc, "Paris");
sleep(1000);
WebElement hName=driver.findElement(By.id("hotels"));
dDown(hName, "Hotel Sunshine");
sleep(1000);
WebElement rType=driver.findElement(By.id("room_type"));
dDown(rType, "Standard");
sleep(1000);
WebElement rNum=driver.findElement(By.id("room_nos"));
rNum.click();
//dDown(rNum, "3 - Three");
sleep(1000);
WebElement dateIn=driver.findElement(By.id("datepick_in"));
clr(dateIn);
//Date td=new Date();
//How to pass the current date here
tData(dateIn, "18/01/2021");
sleep(1000);
WebElement dateOut=driver.findElement(By.id("datepick_out"));
clr(dateOut);
tData(dateOut, "20/01/2021");
sleep(1000);
WebElement aRoom=driver.findElement(By.xpath("(//option[text()='4 - Four'])[2]"));
bClik(aRoom);
WebElement cRoom=driver.findElement(By.xpath("(//option[text()='2 - Two'])[3]"));
bClik(cRoom);
WebElement subtn=driver.findElement(By.id("Submit"));
bClik(subtn);
sleep(1000);
//WebElement rBtn=driver.findElement(By.id("radiobutton_0"));
//bClik(subtn);
sleep(1000);
bQuit();

	
}
}
