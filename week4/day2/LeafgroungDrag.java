package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class LeafgroungDrag {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.leafground.com/drag.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
	WebElement des = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
	Actions builder=new Actions(driver);
	builder.dragAndDrop(source, des).perform();
	System.out.println(des.getCssValue("background-color"));
	WebElement scr = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-titlebar ui-widget-header')]"));
	Point location =scr.getLocation();
	int x=location.getX();
	System.out.println(x);
	int y=location.getY();
	System.out.println(y);
	builder.dragAndDropBy(scr, 100, 50).perform();
	System.out.println(scr.getLocation().getX());
	WebElement table = driver.findElement(By.xpath("//table[@role='grid'][1]"));
	WebElement dest = driver.findElement(By.xpath("//table[@role='grid'][1]//th[1]"));
	WebElement source1 = driver.findElement(By.xpath("//table[@role='grid'][1]//th[2]"));
	builder.dragAndDrop(source1, dest).perform();
	String text = driver.findElement(By.xpath("//div[@role='alert']")).getText();
	System.out.println("The Confirmation is: "+text);
	WebElement table1 = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
	WebElement destination = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]"));
	WebElement source2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[3]"));
    builder.dragAndDrop(source2, destination).perform();
     String text2 = driver.findElement(By.xpath("//span[text()='Row moved']")).getText();
     System.out.println(text2);
}
}
