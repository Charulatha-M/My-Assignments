package Week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class SnowCaller {
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
		filter.sendKeys("Caller",Keys.ENTER);
		Thread.sleep(3000);
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='sys_user.user_name']")).sendKeys("55555");
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Charu");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Latha");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("abc.12@gmail.com");
		WebElement lang = driver.findElement(By.xpath("//select[@id='sys_user.preferred_language']"));
		Select drop1 = new Select(lang);
		drop1.selectByVisibleText("English");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("999999999");
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow= new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Customer Support']")).click();
		driver.switchTo().window(listWindow.get(0));
		WebElement eleFrame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame1);
		driver.findElement(By.xpath("//button[@class='form_action_button header  action_context btn btn-default']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@class='list_header_search  form-control form-control-search'])[2]")).sendKeys("Charu",Keys.ENTER);
		
}
}
