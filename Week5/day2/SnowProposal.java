package Week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class SnowProposal {
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
	filter.sendKeys("My Proposal",Keys.ENTER);
	//shadow.findElementByXPath("//mark[text()='My Proposal']").click();
	Thread.sleep(3000);
	WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(eleFrame);
	driver.findElement(By.xpath("//button[text()='New']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Created My New");
	Thread.sleep(10);
	driver.findElement(By.xpath("//span[@class='ui_action_container_primary']//button[text()='Submit']")).click();
	List <WebElement> proposal= driver.findElements(By.xpath("//table[@id='std_change_proposal_table']//tr/td"));
	for(int i=1;i<proposal.size();i++) {
		String text = proposal.get(i).getText();
		System.out.println(text);
	}
}

}
