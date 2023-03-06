package selenium.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver facebook=new ChromeDriver();
	facebook.get("https://en-gb.facebook.com/");
	facebook.manage().window().maximize();
	facebook.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	facebook.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	facebook.findElement(By.name("firstname")).sendKeys("Charulatha");
	facebook.findElement(By.name("lastname")).sendKeys("Mohan");
	facebook.findElement(By.name("reg_email__")).sendKeys("charulathamohan.12@gmail.com");
	facebook.findElement(By.name("reg_email_confirmation__")).sendKeys("charulathamohan.12@gmail.com");
	facebook.findElement(By.name("reg_passwd__")).sendKeys("Charu_6100");
	WebElement date = facebook.findElement(By.name("birthday_day"));
	Select drop1=new Select(date);
	drop1.selectByValue("7");
	WebElement month = facebook.findElement(By.name("birthday_month"));
	Select drop2=new Select(month);
	drop2.selectByVisibleText("Aug");
	WebElement year = facebook.findElement(By.name("birthday_year"));
	Select drop3=new Select(year);
	drop3.selectByValue("1997");
	facebook.findElement(By.xpath("//label[text()='Female']")).click();
	Thread.sleep(2000);
	
}
}
