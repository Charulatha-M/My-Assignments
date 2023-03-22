package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDrag {
 public static void main(String[] args) {
	 ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//a[text()='Droppable']")).click();
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions builder=new Actions(driver);
        builder.dragAndDrop(source, des).perform();
        System.out.println(des.getCssValue("background-color"));
        String text = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        System.out.println(text);
 
 }
}
