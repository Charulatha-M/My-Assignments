package Week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class SnowKnowledge {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://dev57553.service-now.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("2oaD6KN$q$vN");
	driver.findElement(By.id("sysverb_login")).click();
	Shadow shadow = new Shadow(driver);
	shadow.setImplicitWait(20);
	shadow.findElementByXPath("//div[text()='All']").click();
	WebElement filter = shadow.findElementByXPath("//input[@id='filter']");
	shadow.setImplicitWait(10);
	filter.click();
	filter.sendKeys("Knowledge",Keys.ENTER);
	Thread.sleep(3000);
	WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(eleFrame);
	driver.findElement(By.xpath("//span[@class='btn-icon icon-article-document homepage-icon']")).click();
	driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
	driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("New Test Article");
	driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
	//WebElement category = driver.findElement(By.xpath("//iframe[@id='AC.kb_knowledge.kb_knowledge_base_shim']"));
	//driver.switchTo().frame(category);
	driver.findElement(By.xpath("(//div[@class='list-item arrow'])[4]/span")).click();
	driver.findElement(By.xpath("//span[text()='Java']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary category-ok-btn']")).click();
	driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
	Thread.sleep(3000);
	driver.close();

}
}
