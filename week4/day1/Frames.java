package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	//To disable the notification
	option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.leafground.com/frame.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//handle the frame
	driver.switchTo().frame(0);
	//To clcik the element
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
   //print
	String text = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
  System.out.println(text);
  //switch back the control from one frame to main window
  
  driver.switchTo().defaultContent();
  //Nested frame
  //As a webelement
  WebElement firstframe = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
  driver.switchTo().frame(firstframe);
  driver.switchTo().frame("frame2");
  
  driver.findElement(By.xpath("//button[text()='Click Me']")).click();
  String text2 = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
  System.out.println(text2);
  driver.switchTo().defaultContent();
  //immediate parent
  driver.switchTo().parentFrame();
}
}
